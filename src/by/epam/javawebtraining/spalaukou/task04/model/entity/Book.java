package by.epam.javawebtraining.spalaukou.task04.model.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class Book implements TextComposite {
    private static final String NAME = "Book";
    private List<SimpleTextElement> lines = new ArrayList<>();

    public Book() {}

    public Book(List<SimpleTextElement> lines) {
        if(lines != null) {
            this.lines = lines;
        }
    }

    public Book(TextComposite book) {
        if (book != null) {
            this.lines = ((Book) book).getChildren();
        }
    }

    @Override
    public List<SimpleTextElement> getChildren() {
        return lines;
    }

    public void setLines(List<SimpleTextElement> lines) {
        if(lines != null) {
            this.lines = lines;
        }
    }

    @Override
    public String getTextElementName() {
        return NAME;
    }

    @Override
    public void addElement(SimpleTextElement element) {
        if (element != null) {
            lines.add(element);
        }
    }

    @Override
    public void removeElement(SimpleTextElement element) {
        if(element != null) {
            lines.remove(element);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Book book = (Book) o;
        return lines.equals(book.lines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lines);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(SimpleTextElement simpleTextElement : lines) {
            stringBuilder.append(simpleTextElement);
        }
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        return stringBuilder.toString();
    }
}
