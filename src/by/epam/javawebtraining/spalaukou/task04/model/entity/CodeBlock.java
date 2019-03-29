package by.epam.javawebtraining.spalaukou.task04.model.entity;

import java.util.Objects;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class CodeBlock extends AbstractTextElement {

    public CodeBlock() {
        super();
    }

    public CodeBlock(String value) {
        if (value != null) {
            super.setValue(value);
        }
    }

    public CodeBlock(CodeBlock codeBlock) {
        if (codeBlock != null) {
            super.setValue(codeBlock.getValue());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        CodeBlock codeBlock = (CodeBlock) o;
        return Objects.equals(super.getValue(), codeBlock.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getValue());
    }

    @Override
    public String toString() {
        return super.getValue() + "\n";
    }

}
