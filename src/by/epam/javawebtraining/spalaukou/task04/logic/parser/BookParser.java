package by.epam.javawebtraining.spalaukou.task04.logic.parser;

import by.epam.javawebtraining.spalaukou.task04.model.TextComposite;
import by.epam.javawebtraining.spalaukou.task04.model.entity.Book;
import by.epam.javawebtraining.spalaukou.task04.model.entity.CodeBlock;
import by.epam.javawebtraining.spalaukou.task04.model.entity.Paragraph;

import java.util.Arrays;

/**
 * @author Stanislau Palaukou on 21.03.2019
 * @project WordsCalculator
 */

public class BookParser {
    private static final String NEWLINE_PATTERN = "\n";
    private static final String PARAGRAPH_PATTERN = "^[A-Z](.+)(([.])|([\\w])|([:]))$|(^[-].+$)";

    public static TextComposite parse(String initialString) {
        String[] splitted = initialString.split(NEWLINE_PATTERN);

        TextComposite book = new Book();

        for(String string: splitted) {
            if(string.matches(PARAGRAPH_PATTERN)) {
                book.addElement(ParagraphParser.parse(string));
            } else {
                book.addElement(new CodeBlock(string));
            }
        }
        return book;
    }
}
