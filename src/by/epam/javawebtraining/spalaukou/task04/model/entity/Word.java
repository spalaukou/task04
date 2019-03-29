package by.epam.javawebtraining.spalaukou.task04.model.entity;

import java.util.Objects;

/**
 * @author Stanislau Palaukou on 20.03.2019
 * @project WordsCalculator
 */

public class Word extends AbstractTextElement {

    public Word() {
        super();
    }

    public Word(String value) {
        if(value != null) {
            super.setValue(value);
        }
    }

    public Word(Word word) {
        if(word != null) {
            super.setValue(word.getValue());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Word word = (Word) o;
        return Objects.equals(super.getValue(), word.getValue());
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