package by.epam.javawebtraining.spalaukou.task04.model.entity;

import by.epam.javawebtraining.spalaukou.task04.model.SimpleTextElement;
import by.epam.javawebtraining.spalaukou.task04.model.TextComposite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class Book implements TextComposite {
    private static final String NAME = "Book";
    private List<SimpleTextElement> textBlocks = new ArrayList<>();

    @Override
    public String getTextElementName() {
        return NAME;
    }

    @Override
    public void addElement(SimpleTextElement element) {
        textBlocks.add(element);
    }

    @Override
    public void removeElement(SimpleTextElement element) {
        textBlocks.remove(element);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(SimpleTextElement simpleTextElement : textBlocks) {
            stringBuilder.append(simpleTextElement);
        }
        stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        return stringBuilder.toString();
    }
}
