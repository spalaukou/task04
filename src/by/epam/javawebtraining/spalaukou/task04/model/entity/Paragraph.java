package by.epam.javawebtraining.spalaukou.task04.model.entity;

import by.epam.javawebtraining.spalaukou.task04.model.SimpleTextElement;
import by.epam.javawebtraining.spalaukou.task04.model.TextComposite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class Paragraph implements TextComposite {
    private static final String NAME = "Paragraph";
    private List<SimpleTextElement> sentences = new ArrayList<>();

    @Override
    public String getTextElementName() {
        return NAME;
    }

    @Override
    public void addElement(SimpleTextElement element) {
        sentences.add(element);
    }

    @Override
    public void removeElement(SimpleTextElement element) {
        sentences.add(element);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(SimpleTextElement simpleTextElement : sentences) {
            stringBuilder.append(simpleTextElement);
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}
