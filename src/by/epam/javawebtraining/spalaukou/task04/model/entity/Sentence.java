package by.epam.javawebtraining.spalaukou.task04.model.entity;

import java.util.List;
import java.util.Objects;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class Sentence extends AbstractTextComposite {

    public Sentence() {
        super();
    }

    public Sentence(List<SimpleTextElement> simpleTextElements) {
        if (simpleTextElements != null) {
            super.setSimpleTextElements(simpleTextElements);
        }
    }

    public Sentence(Sentence sentence) {
        if (sentence != null) {
            super.setSimpleTextElements(sentence.getChildren());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Sentence sentence = (Sentence) o;
        return Objects.equals(super.getChildren(), sentence.getChildren());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getChildren());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(SimpleTextElement simpleTextElement : super.getChildren()) {
            stringBuilder.append(simpleTextElement);
        }
        return stringBuilder.toString();
    }
}
