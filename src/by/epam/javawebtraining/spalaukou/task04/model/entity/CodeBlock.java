package by.epam.javawebtraining.spalaukou.task04.model.entity;

import by.epam.javawebtraining.spalaukou.task04.model.SimpleTextElement;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class CodeBlock implements SimpleTextElement {
    private static final String NAME = "Code Block";
    private String value;

    public CodeBlock(String value) {
        this.value = value;
    }

    @Override
    public String getTextElementName() {
        return NAME;
    }

    @Override
    public String toString() {
        return value + "\r\n";
    }

}
