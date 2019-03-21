package by.epam.javawebtraining.spalaukou.task04.logic.parser;

import by.epam.javawebtraining.spalaukou.task04.model.TextComposite;
import by.epam.javawebtraining.spalaukou.task04.model.entity.Book;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class ParagraphParser {
    private static final String NEWSENTENCE_PATTERN = "[.]";
    private static final String ENUMERATION_PATTERN = "[:]";

    public static TextComposite parse(String initialString) {

        TextComposite paragraph = new Book();

        if(initialString.length() - 1 == initialString.lastIndexOf(ENUMERATION_PATTERN)) {
            if(!initialString.contains(NEWSENTENCE_PATTERN)) {
                paragraph.addElement(SentenceParser.parse(initialString));
            } else {
                String[] splitted = initialString.split(NEWSENTENCE_PATTERN);
                for(int i = 0; i < splitted.length; i++) {
                    if(i < splitted.length - 1) {
                        paragraph.addElement(SentenceParser.parse(initialString + NEWSENTENCE_PATTERN));
                    } else {
                        paragraph.addElement(SentenceParser.parse(initialString + ENUMERATION_PATTERN));
                    }
                }
            }
        } else if(initialString.contains(NEWSENTENCE_PATTERN)) {
            String[] splitted = initialString.split(NEWSENTENCE_PATTERN);
            for(String string: splitted) {
                paragraph.addElement(SentenceParser.parse(string + NEWSENTENCE_PATTERN));
            }
        } else {
            paragraph.addElement(SentenceParser.parse(initialString));
        }

        return paragraph;
    }

}
