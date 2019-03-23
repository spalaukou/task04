package by.epam.javawebtraining.spalaukou.task04.model.entity;

import java.util.Objects;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class CodeBlock implements SimpleTextElement {
    private static final String NAME = "Code Block";
    private String value;

    public CodeBlock() {}

    public CodeBlock(String value) {
        this.value = value;
    }

    @Override
    public String getTextElementName() {
        return NAME;
    }

    public static String getNAME() {
        return NAME;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodeBlock codeBlock = (CodeBlock) o;
        return value.equals(codeBlock.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return value + "\r\n";
    }

}
