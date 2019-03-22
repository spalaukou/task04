package by.epam.javawebtraining.spalaukou.task04.model.entity;

import by.epam.javawebtraining.spalaukou.task04.model.SimpleTextElement;
import by.epam.javawebtraining.spalaukou.task04.model.TextComposite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class Sentence implements TextComposite {
    private static final String NAME = "Sentence";
    private List<SimpleTextElement> simpleTextElements = new ArrayList<>();

    @Override
    public String getTextElementName() {
        return NAME;
    }

    @Override
    public void addElement(SimpleTextElement element) {
        simpleTextElements.add(element);
    }

    @Override
    public void removeElement(SimpleTextElement element) {
        simpleTextElements.remove(element);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < simpleTextElements.size(); i++) {
            stringBuilder.append(simpleTextElements.get(i));
            if(i == simpleTextElements.size() - 1) {
                stringBuilder.append("\r\n");
            }
        }
        return stringBuilder.toString();
    }
}
