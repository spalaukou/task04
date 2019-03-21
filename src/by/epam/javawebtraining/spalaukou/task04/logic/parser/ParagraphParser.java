package by.epam.javawebtraining.spalaukou.task04.logic.parser;

import by.epam.javawebtraining.spalaukou.task04.model.entity.Paragraph;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class ParagraphParser {
    private static final String SENTENCE_PATTERN = "";

    public static Paragraph parse(String initialString) {
        System.out.println(initialString);
        String[] splitted = initialString.split(". ");

        Paragraph paragraph = new Paragraph();

        for(String string: splitted) {
            if(string.matches(SENTENCE_PATTERN)) {
                paragraph.addComponent(SentenceParser.parse(string));
            }
        }
        return paragraph;
    }
}
