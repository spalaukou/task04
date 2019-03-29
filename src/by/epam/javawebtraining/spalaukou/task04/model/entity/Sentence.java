package by.epam.javawebtraining.spalaukou.task04.model.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class Sentence implements TextComposite {
    private List<SimpleTextElement> simpleTextElements;

    public Sentence() {
        simpleTextElements = new ArrayList<>();
    }

    public Sentence(List<SimpleTextElement> simpleTextElements) {
        if (simpleTextElements != null) {
            this.simpleTextElements = simpleTextElements;
        }
    }

    public Sentence(Sentence sentence) {
        if (sentence != null) {
            this.simpleTextElements = sentence.getChildren();
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Sentence sentence = (Sentence) o;
        return Objects.equals(simpleTextElements, sentence.simpleTextElements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(simpleTextElements);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(SimpleTextElement simpleTextElement : simpleTextElements) {
            stringBuilder.append(simpleTextElement);
        }
        return stringBuilder.toString();
    }
}
