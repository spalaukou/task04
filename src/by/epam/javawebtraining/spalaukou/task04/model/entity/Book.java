package by.epam.javawebtraining.spalaukou.task04.model.entity;

import by.epam.javawebtraining.spalaukou.task04.model.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class Book implements Text {
    private List<Text> paragraphs = new ArrayList<>();

    public void addComponent(Text component) {
        paragraphs.add(component);
    }

    public void removeComponent(Text component) {
        paragraphs.remove(component);
    }

    @Override
    public void write() {
        for(Text component : paragraphs) {
            component.write();
        }
    }
}
