package by.epam.javawebtraining.spalaukou.task04.model.entity;

import by.epam.javawebtraining.spalaukou.task04.model.TextComponent;

/**
 * @author Stanislau Palaukou on 21.03.2019
 * @project WordsCalculator
 */

public class PunctuationMark implements TextComponent {
    private String value;

    public PunctuationMark(String value) {
        this.value = value;
    }

    @Override
    public void addComponent(TextComponent component) {
    }

    @Override
    public void removeComponent(TextComponent component) {
    }

    @Override
    public String toString() {
        return value.toString();
    }
}

