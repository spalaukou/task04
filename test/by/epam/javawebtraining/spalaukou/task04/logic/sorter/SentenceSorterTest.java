package by.epam.javawebtraining.spalaukou.task04.logic.sorter;

import by.epam.javawebtraining.spalaukou.task04.model.entity.*;
import by.epam.javawebtraining.spalaukou.task04.model.exception.LogicalException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

/**
 * @author Stanislau Palaukou on 25.03.2019
 * @project WordsCalculator
 */

public class SentenceSorterTest {

    private TextComposite book;
    private TextComposite sentence1;
    private TextComposite sentence2;
    private TextComposite sentence3;
    private TextComposite sentence4;

    @BeforeTest
    public void setUp() {
        SimpleTextElement s1 = new Word("Autoboxing");
        SimpleTextElement s2 = new Word("and");
        SimpleTextElement s3 = new Word("AutoUnboxing");
        SimpleTextElement s4 = new Word("I");
        SimpleTextElement s5 = new Word("Hello");
        SimpleTextElement s6 = new Word("World");
        SimpleTextElement s7 = new Word("Simple");
        SimpleTextElement s8 = new Word("Sentence");
        SimpleTextElement s9 = new Word("is");
        SimpleTextElement s10 = new Word("here");
        SimpleTextElement space = new PunctuationMark(" ");

        sentence1 = new Sentence();
        sentence1.addElement(s1);
        sentence1.addElement(space);
        sentence1.addElement(s2);
        sentence1.addElement(space);
        sentence1.addElement(s3);

        sentence2 = new Sentence();
        sentence2.addElement(s4);

        sentence3 = new Sentence();
        sentence3.addElement(s5);
        sentence3.addElement(space);
        sentence3.addElement(s6);

        sentence4 = new Sentence();
        sentence4.addElement(s7);
        sentence4.addElement(space);
        sentence4.addElement(s8);
        sentence4.addElement(space);
        sentence4.addElement(s9);
        sentence4.addElement(space);
        sentence4.addElement(s10);

        TextComposite paragraph = new Paragraph();
        paragraph.addElement(sentence1);
        paragraph.addElement(sentence2);
        paragraph.addElement(sentence3);
        paragraph.addElement(sentence4);

        book = new Book();
        book.addElement(paragraph);
    }

    @Test
    public void testSetSortingBehavior() {
        SentenceSorter sentenceSorter = new SentenceSorter();
        sentenceSorter.setSortingBehavior(new LengthByAscendingBehavior());
    }

    @Test
    public void testSortByLengthByAscending() throws LogicalException {
        SentenceSorter sentenceSorter = new SentenceSorter();
        sentenceSorter.setSortingBehavior(new LengthByAscendingBehavior());

        List<SimpleTextElement> expected = new ArrayList<>();
        expected.add(sentence2);
        expected.add(sentence3);
        expected.add(sentence4);
        expected.add(sentence1);

        assertEquals(expected, sentenceSorter.sort(book));
    }

    @Test
    public void testSortByLengthByDescending() throws LogicalException {
        SentenceSorter sentenceSorter = new SentenceSorter();
        sentenceSorter.setSortingBehavior(new LengthByDescendingBehavior());

        List<SimpleTextElement> expected = new ArrayList<>();
        expected.add(sentence1);
        expected.add(sentence4);
        expected.add(sentence3);
        expected.add(sentence2);

        assertEquals(expected, sentenceSorter.sort(book));
    }

    @Test
    public void testSortByWordsByAscending() throws LogicalException {
        SentenceSorter sentenceSorter = new SentenceSorter();
        sentenceSorter.setSortingBehavior(new WordsByAscendingBehavior());

        List<SimpleTextElement> expected = new ArrayList<>();
        expected.add(sentence2);
        expected.add(sentence3);
        expected.add(sentence1);
        expected.add(sentence4);

        assertEquals(expected, sentenceSorter.sort(book));
    }

    @Test
    public void testSortByWordsByDescending() throws LogicalException {
        SentenceSorter sentenceSorter = new SentenceSorter();
        sentenceSorter.setSortingBehavior(new WordsByDescendingBehavior());

        List<SimpleTextElement> expected = new ArrayList<>();
        expected.add(sentence4);
        expected.add(sentence1);
        expected.add(sentence3);
        expected.add(sentence2);

        assertEquals(expected, sentenceSorter.sort(book));
    }

    @Test(expectedExceptions = LogicalException.class)
    public void testSortNull() throws LogicalException {
        SentenceSorter sentenceSorter = new SentenceSorter();
        sentenceSorter.sort(null);
    }
}
