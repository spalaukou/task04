package by.epam.javawebtraining.spalaukou.task04.model.entity;

import by.epam.javawebtraining.spalaukou.task04.model.SimpleTextElement;

/**
 * @author Stanislau Palaukou on 20.03.2019
 * @project WordsCalculator
 */

public class Word implements SimpleTextElement {
    private static final String NAME = "Word";
    private String value;

    public Word(String value) {
        this.value = value;
    }

    @Override
    public String getTextElementName() {
        return NAME;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}