package by.epam.javawebtraining.spalaukou.task04.model.entity;

import by.epam.javawebtraining.spalaukou.task04.model.TextComponent;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class CodeBlock implements TextComponent {
    private String value;

    public CodeBlock(String value) {
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
