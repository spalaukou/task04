package by.epam.javawebtraining.spalaukou.task04.model.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class Paragraph implements TextComposite {
    private static final String NAME = "Paragraph";
    private List<SimpleTextElement> sentences = new ArrayList<>();

    public Paragraph() {}

    public Paragraph(List<SimpleTextElement> sentences) {
        this.sentences = sentences;
    }

    public Paragraph(Paragraph paragraph) {
        if (paragraph != null) {
            this.sentences = paragraph.getChildren();
        }
    }

    @Override
    public List<SimpleTextElement> getChildren() {
        return sentences;
    }

    @Override
    public String getTextElementName() {
        return NAME;
    }

    @Override
    public void addElement(SimpleTextElement element) {
        if (element != null) {
            sentences.add(element);
        }
    }

    @Override
    public void removeElement(SimpleTextElement element) {
        if (element != null) {
            sentences.add(element);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Paragraph paragraph = (Paragraph) o;
        return Objects.equals(sentences, paragraph.sentences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentences);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(SimpleTextElement simpleTextElement : sentences) {
            stringBuilder.append(simpleTextElement);
        }
        stringBuilder.append("\r\n");
        return stringBuilder.toString();
    }
}
