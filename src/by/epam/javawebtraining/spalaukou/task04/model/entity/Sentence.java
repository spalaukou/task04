package by.epam.javawebtraining.spalaukou.task04.model.entity;

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
        for(SimpleTextElement simpleTextElement : simpleTextElements) {
            stringBuilder.append(simpleTextElement);
        }
        stringBuilder.append("\r\n");
        return stringBuilder.toString();
    }
}
