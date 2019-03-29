package by.epam.javawebtraining.spalaukou.task04.model.entity;

import java.util.List;
import java.util.Objects;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class Book extends AbstractTextComposite {

    public Book() {
        super();
    }

    public Book(List<SimpleTextElement> simpleTextElements) {
        if (simpleTextElements != null) {
            super.setSimpleTextElements(simpleTextElements);
        }
    }

    public Book(TextComposite book) {
        if (book != null) {
            super.setSimpleTextElements(book.getChildren());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Book book = (Book) o;
        return Objects.equals(super.getChildren(), book.getChildren());
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
        stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        return stringBuilder.toString();
    }
}
