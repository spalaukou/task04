package by.epam.javawebtraining.spalaukou.task04.logic.parser;

import by.epam.javawebtraining.spalaukou.task04.model.entity.TextComposite;
import by.epam.javawebtraining.spalaukou.task04.model.entity.Paragraph;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class ParagraphParser extends TextParser {
    private static final String NEWSENTENCE_PATTERN = "[.]";
    private static final String HEADLINE_PATTERN = "^\\w.+\\w$";
    private static final String REGULAR_PATTERN = "^(\\w.+[.])$";
    private static final String WITHENUMERATION_PATTERN = "^(\\w.+[:])$";
    private static final String ENUMERATION_PATTERN = "^([-].+)$";

    public ParagraphParser(TextParser next) {
        super(next);
    }

    @Override
    public TextComposite parse(String initialString) {

        TextComposite paragraph = new Paragraph();

        if(initialString.matches(HEADLINE_PATTERN)) {
            paragraph.addElement(next.parse(initialString));
        } else if (initialString.matches(REGULAR_PATTERN)) {
            String[] splitted = initialString.split(NEWSENTENCE_PATTERN);
            for (String string : splitted) {
                paragraph.addElement(next.parse(string + "."));
            }
        } else if(initialString.matches(WITHENUMERATION_PATTERN)) {
            String[] splitted = initialString.split(NEWSENTENCE_PATTERN);
            for(int i = 0; i < splitted.length; i++) {
                if (i < splitted.length - 1) {
                    paragraph.addElement(next.parse(splitted[i] + "."));
                } else {
                    paragraph.addElement(next.parse(splitted[i]));
                }
            }
        } else if(initialString.matches(ENUMERATION_PATTERN)){
            paragraph.addElement(next.parse(initialString));
        }


        return paragraph;
    }
}
