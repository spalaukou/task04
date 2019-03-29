package by.epam.javawebtraining.spalaukou.task04.model.entity;

import java.util.List;
import java.util.Objects;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class Paragraph extends AbstractTextComposite {

    public Paragraph() {
        super();
    }

    public Paragraph(List<SimpleTextElement> simpleTextElements) {
        if (simpleTextElements != null) {
            super.setSimpleTextElements(simpleTextElements);
        }
    }

    public Paragraph(Paragraph paragraph) {
        if (paragraph != null) {
            super.setSimpleTextElements(paragraph.getChildren());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Paragraph paragraph = (Paragraph) o;
        return Objects.equals(super.getChildren(), paragraph.getChildren());
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
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}
