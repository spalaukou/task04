package by.epam.javawebtraining.spalaukou.task04.model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class Paragraph implements TextComposite {
    private static final String NAME = "Paragraph";

    private List<SimpleTextElement> sentences = new ArrayList<>();

    public List<SimpleTextElement> getSentences() {
        return sentences;
    }

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
            stringBuilder.append("\r");
        }
        stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        return stringBuilder.toString();
    }
}
