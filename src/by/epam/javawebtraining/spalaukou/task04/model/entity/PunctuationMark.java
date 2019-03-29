package by.epam.javawebtraining.spalaukou.task04.model.entity;

import java.util.Objects;

/**
 * @author Stanislau Palaukou on 21.03.2019
 * @project WordsCalculator
 */

public class PunctuationMark extends AbstractTextElement {

    public PunctuationMark() {
        super();
    }

    public PunctuationMark(String value) {
        if(value != null) {
            super.setValue(value);
        }
    }

    public PunctuationMark(PunctuationMark punctuationMark) {
        if (punctuationMark != null) {
            super.setValue(punctuationMark.getValue());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        PunctuationMark pm = (PunctuationMark) o;
        return Objects.equals(super.getValue(), pm.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getValue());
    }

    @Override
    public String toString() {
        return super.getValue();
    }
}

