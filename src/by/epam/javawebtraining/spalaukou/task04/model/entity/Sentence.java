package by.epam.javawebtraining.spalaukou.task04.model.entity;

import by.epam.javawebtraining.spalaukou.task04.model.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class Sentence implements Text {
    private List<Text> elements = new ArrayList<>();

    public void addComponent(Text component) {
        elements.add(component);
    }

    public void removeComponent(Text component) {
        elements.remove(component);
    }

    @Override
    public void write() {
        for(Text component : elements) {
            component.write();
        }
    }
}
