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
    private List<SimpleTextElement> textBlocks = new ArrayList<>();

    public Book() {}

    public Book(TextComposite book) {
        if (book != null && book.getTextElementName().equals(Book.NAME)) {
            this.textBlocks = ((Book) book).getTextBlocks();
        }
    }

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

    public List<SimpleTextElement> getTextBlocks() {
        return textBlocks;
    }

    public void setTextBlocks(List<SimpleTextElement> textBlocks) {
        this.textBlocks = textBlocks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return textBlocks.equals(book.textBlocks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(textBlocks);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(SimpleTextElement simpleTextElement : textBlocks) {
            stringBuilder.append(simpleTextElement);
        }
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        return stringBuilder.toString();
    }
}
