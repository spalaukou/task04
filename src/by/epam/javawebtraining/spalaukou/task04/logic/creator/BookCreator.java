package by.epam.javawebtraining.spalaukou.task04.logic.creator;

import by.epam.javawebtraining.spalaukou.task04.logic.parser.InitialTextParser;
import by.epam.javawebtraining.spalaukou.task04.model.entity.Book;
import by.epam.javawebtraining.spalaukou.task04.model.entity.Paragraph;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class BookCreator {
    public static Book create(String initialText) {

        String[] strings = InitialTextParser.parse(initialText);

        Book book = new Book();

        for(String string : strings) {
            Paragraph paragraph = new Paragraph();

            //returns List of elements that will be added to paragraph
            //paragraph.addComponent(ParagraphParser.parse(string));
            book.addComponent(paragraph);
        }

        return book;
    }
}
