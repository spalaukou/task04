package by.epam.javawebtraining.spalaukou.task04.model.entity;

import by.epam.javawebtraining.spalaukou.task04.model.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class Paragraph implements Text {
    private List<Text> sentences = new ArrayList<>();

    public void addComponent(Text component) {
        sentences.add(component);
    }

    public void removeComponent(Text component) {
        sentences.remove(component);
    }

    @Override
    public void write() {
        for(Text component : sentences) {
            component.write();
        }
    }
}
