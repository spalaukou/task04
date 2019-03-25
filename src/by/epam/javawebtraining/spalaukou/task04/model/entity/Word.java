package by.epam.javawebtraining.spalaukou.task04.model.entity;

import java.util.Objects;

/**
 * @author Stanislau Palaukou on 20.03.2019
 * @project WordsCalculator
 */

public class Word implements SimpleTextElement {
    private static final String NAME = "Word";
    private String value;

    public Word() {
    }

    public Word(String value) {
        if(value != null) {
            this.value = value;
        }
    }

    public Word(Word word) {
        if(word != null) {
            this.value = word.getValue();
        }
    }

    @Override
    public String getTextElementName() {
        return NAME;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        if (value != null) {
            this.value = value;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Word word = (Word) o;
        return Objects.equals(value, word.value);
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