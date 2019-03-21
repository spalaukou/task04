package by.epam.javawebtraining.spalaukou.task04.logic.parser;

import by.epam.javawebtraining.spalaukou.task04.model.TextComposite;
import by.epam.javawebtraining.spalaukou.task04.model.entity.PunctuationMark;
import by.epam.javawebtraining.spalaukou.task04.model.entity.Sentence;
import by.epam.javawebtraining.spalaukou.task04.model.entity.Word;

/**
 * @author Stanislau Palaukou on 21.03.2019
 * @project WordsCalculator
 */

public class SentenceParser {
    private static final String WORD_PATTERN = "";

    public static TextComposite parse(String initialString) {
        String[] splitted = initialString.split(" ");

        TextComposite sentence = new Sentence();

        for(String string: splitted) {
            if(string.matches(WORD_PATTERN)) {
                sentence.addElement(new Word(string));
            } else {
                sentence.addElement(new PunctuationMark(string));
            }
        }
        return sentence;
    }
}
