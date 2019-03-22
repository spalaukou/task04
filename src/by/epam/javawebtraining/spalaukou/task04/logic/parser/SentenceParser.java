package by.epam.javawebtraining.spalaukou.task04.logic.parser;

import by.epam.javawebtraining.spalaukou.task04.model.TextComposite;
import by.epam.javawebtraining.spalaukou.task04.model.entity.PunctuationMark;
import by.epam.javawebtraining.spalaukou.task04.model.entity.Sentence;
import by.epam.javawebtraining.spalaukou.task04.model.entity.Word;

/**
 * @author Stanislau Palaukou on 21.03.2019
 * @project WordsCalculator
 */

public class SentenceParser extends TextParser {
    private static final String WORDSTRING_PATTERN = "^\\w+$";
    private static final String NONWORDSTRING_PATTERN = "^\\W+$";
    private static final String WORD_PATTERN = "\\w+";
    private static final String NONWORD_PATTERN = "\\W";
    private static final String SPACE_PATTERN = "\\s+";
    private static final String NONWORDFIRST_PATTERN = "^\\W+\\w+$";
    private static final String NONWORDMIDDLE_PATTERN = "^\\w+\\W+\\w+$";
    private static final String NONWORDEND_PATTERN = "^\\w+\\W+$";
    private static final String WORDMIDDLE_PATTERN = "^\\W+\\w+\\W+$";

    public SentenceParser() {
    }

    @Override
    public TextComposite parse(String initialString) {
        String[] splitted = initialString.split(SPACE_PATTERN);

        TextComposite sentence = new Sentence();

        String[] words;
        String[] punctuationMarks;

        for(int i = 0; i < splitted.length; i++) {
            if(splitted[i].matches(WORDSTRING_PATTERN)) {
                sentence.addElement(new Word(splitted[i]));
            } else

            if(splitted[i].matches(NONWORDSTRING_PATTERN)) {
                sentence.addElement(new PunctuationMark(splitted[i]));
            } else

            if(splitted[i].matches(NONWORDMIDDLE_PATTERN)) {
                words = splitted[i].split(NONWORD_PATTERN);
                punctuationMarks = splitted[i].split(WORD_PATTERN);
                sentence.addElement(new Word(words[0]));
                sentence.addElement(new PunctuationMark(punctuationMarks[1]));
                sentence.addElement(new Word(words[1]));
            } else

            if(splitted[i].matches(WORDMIDDLE_PATTERN)) {
                words = splitted[i].split(NONWORD_PATTERN);
                punctuationMarks = splitted[i].split(WORD_PATTERN);
                sentence.addElement(new PunctuationMark(punctuationMarks[0]));
                sentence.addElement(new Word(words[1]));
                sentence.addElement(new PunctuationMark(punctuationMarks[1]));
            } else

            if(splitted[i].matches((NONWORDFIRST_PATTERN))) {
                words = splitted[i].split(NONWORD_PATTERN);
                punctuationMarks = splitted[i].split(WORD_PATTERN);
                sentence.addElement(new PunctuationMark(punctuationMarks[0]));
                sentence.addElement(new Word(words[1]));
            } else

            if(splitted[i].matches(NONWORDEND_PATTERN)) {
                words = splitted[i].split(NONWORD_PATTERN);
                punctuationMarks = splitted[i].split(WORD_PATTERN);
                sentence.addElement(new Word(words[0]));
                sentence.addElement(new PunctuationMark(punctuationMarks[1]));
            }

            if(i < splitted.length - 1) {
                sentence.addElement(new PunctuationMark(" "));
            }
        }

        return sentence;
    }
}
