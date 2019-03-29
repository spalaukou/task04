package by.epam.javawebtraining.spalaukou.task04.model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislau Palaukou on 29.03.2019
 * @project task04
 */

public abstract class AbstractTextComposite implements TextComposite {
    private List<SimpleTextElement> simpleTextElements;

    AbstractTextComposite() {
        simpleTextElements = new ArrayList<>();
    }

    public void setSimpleTextElements(List<SimpleTextElement> simpleTextElements) {
        this.simpleTextElements = simpleTextElements;
    }

    @Override
    public List<SimpleTextElement> getChildren() {
        return simpleTextElements;
    }

    @Override
    public void addElement(SimpleTextElement element) {
        if (element != null) {
            simpleTextElements.add(element);
        }
    }

    @Override
    public void removeElement(SimpleTextElement element) {
        if (element != null) {
            simpleTextElements.remove(element);
        }
    }
}
