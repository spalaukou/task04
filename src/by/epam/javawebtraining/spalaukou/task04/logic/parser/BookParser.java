package by.epam.javawebtraining.spalaukou.task04.logic.parser;

import by.epam.javawebtraining.spalaukou.task04.model.entity.Book;
import by.epam.javawebtraining.spalaukou.task04.model.entity.CodeBlock;

/**
 * @author Stanislau Palaukou on 21.03.2019
 * @project WordsCalculator
 */

public class BookParser {
    private static final String PARAGRAPH_PATTERN = "^[A-Z](.+)(([.])|([\\w])|([:]))$|(^[-].+$)";

    public static Book parse(String initialText) {
        String[] splitted = initialText.split("\n");

        Book book = new Book();

        for(String string: splitted) {
            if(string.matches(PARAGRAPH_PATTERN)) {
                book.addComponent(ParagraphParser.parse(string));
            } else {
                book.addComponent(new CodeBlock(string));
            }
        }

        return book;
    }
}
