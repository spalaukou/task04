package by.epam.javawebtraining.spalaukou.task04.model.entity;

import by.epam.javawebtraining.spalaukou.task04.model.TextComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class Sentence implements TextComponent {
    private List<TextComponent> simpleTextElements = new ArrayList<>();

    @Override
    public void addComponent(TextComponent component) {
        simpleTextElements.add(component);
    }

    @Override
    public void removeComponent(TextComponent component) {
        simpleTextElements.remove(component);
    }

    @Override
    public String toString() {
        return simpleTextElements.toString();
    }
}
