package by.epam.javawebtraining.spalaukou.task04.logic.parser;

import by.epam.javawebtraining.spalaukou.task04.model.entity.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BookParserTest {

    private TextComposite book;
    private TextComposite sentence1;
    private String initialString;

    @BeforeTest
    public void setUp() {
        initialString = "Simple Sentence is here.";

        SimpleTextElement s1 = new Word("Simple");
        SimpleTextElement s2 = new Word("Sentence");
        SimpleTextElement s3 = new Word("is");
        SimpleTextElement s4 = new Word("here");
        SimpleTextElement space = new PunctuationMark(" ");
        SimpleTextElement point = new PunctuationMark(".");

        sentence1 = new Sentence();
        sentence1.addElement(s1);
        sentence1.addElement(space);
        sentence1.addElement(s2);
        sentence1.addElement(space);
        sentence1.addElement(s3);
        sentence1.addElement(space);
        sentence1.addElement(s4);
        sentence1.addElement(point);

        TextComposite paragraph = new Paragraph();
        paragraph.addElement(sentence1);

        book = new Book();
        book.addElement(paragraph);
    }

    @Test
    public void testParse() {
        TextParser bp = ChainParserCreator.create();
        TextComposite book2 = bp.parse(initialString);

        assertEquals(book, book2);
    }
}