package by.epam.javawebtraining.spalaukou.task04.logic.creator;

import by.epam.javawebtraining.spalaukou.task04.model.entity.Book;
import by.epam.javawebtraining.spalaukou.task04.model.entity.Paragraph;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class BookCreator {
    public static Book create(String initialText) {

        String[] strings = initialText.split("\n");

        Book book = new Book();

        for(String string : strings) {
            Paragraph paragraph = new Paragraph();
            paragraph.addComponent(string);
            book.addComponent(paragraph);
        }

        return book;
    }
}
