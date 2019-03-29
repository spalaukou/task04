package by.epam.javawebtraining.spalaukou.task04.model.entity;

import java.util.Objects;

/**
 * @author Stanislau Palaukou on 21.03.2019
 * @project WordsCalculator
 */

public class PunctuationMark implements SimpleTextElement {
    private String value;

    public PunctuationMark() {
    }

    public PunctuationMark(String value) {
        if(value != null) {
            this.value = value;
        }
    }

    public PunctuationMark(PunctuationMark punctuationMark) {
        if (punctuationMark != null) {
            this.value = punctuationMark.getValue();
        }
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        if(value != null) {
            this.value = value;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        PunctuationMark that = (PunctuationMark) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return value;
    }
}

