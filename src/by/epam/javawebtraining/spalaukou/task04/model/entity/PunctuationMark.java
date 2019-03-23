package by.epam.javawebtraining.spalaukou.task04.model.entity;

/**
 * @author Stanislau Palaukou on 21.03.2019
 * @project WordsCalculator
 */

public class PunctuationMark implements SimpleTextElement {
    private static final String NAME = "Punctuation Mark";
    private String value;

    public PunctuationMark(String value) {
        this.value = value;
    }

    @Override
    public String getTextElementName() {
        return NAME;
    }

    @Override
    public String toString() {
        return value;
    }
}

