package by.epam.javawebtraining.spalaukou.task04.model.entity;

import by.epam.javawebtraining.spalaukou.task04.model.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class Paragraph implements Text {
    private List<String> sentences = new ArrayList<>();

    public void addComponent(String sentence) {
        sentences.add(sentence);
    }

    public void removeComponent(String sentence) {
        sentences.remove(sentence);
    }

    @Override
    public void write() {
        for(String sentence : sentences) {
            System.out.println(sentence);
        }
    }
}
