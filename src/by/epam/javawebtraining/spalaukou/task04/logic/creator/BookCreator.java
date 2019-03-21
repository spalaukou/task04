package by.epam.javawebtraining.spalaukou.task04.logic.creator;

import by.epam.javawebtraining.spalaukou.task04.logic.parser.BookParser;
import by.epam.javawebtraining.spalaukou.task04.model.entity.Book;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class BookCreator {
    public static Book create(String initialText) {

        return BookParser.parse(initialText);
    }
}
