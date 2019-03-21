package by.epam.javawebtraining.spalaukou.task04.logic.parser;

import by.epam.javawebtraining.spalaukou.task04.model.TextComposite;
import by.epam.javawebtraining.spalaukou.task04.model.entity.Paragraph;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class ParagraphParser {
    private static final String SENTENCE_PATTERN = "(^[-]|([A-Z])).+?([.]\\s?|[:]|[;]|[\\w]$)";

    public static TextComposite parse(String initialString) {
        String[] splitted = initialString.split(SENTENCE_PATTERN);

        TextComposite paragraph = new Paragraph();

        for(String string: splitted) {
            paragraph.addElement(SentenceParser.parse(string));
        }
        return paragraph;
    }
}
