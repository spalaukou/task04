package by.epam.javawebtraining.spalaukou.task04.logic;

import by.epam.javawebtraining.spalaukou.task04.model.entity.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Stanislau Palaukou on 23.03.2019
 * @project WordsCalculator
 */

public class SentenceSorter {

    public static TextComposite sortIncrease(TextComposite book) {
        var newBook = new Book(book);

        List<SimpleTextElement> paragraphs = newBook.getTextBlocks();
//        System.out.println(Arrays.toString(paragraphs));
//        for (SimpleTextElement paragraph : paragraphs) {
//            System.out.println(paragraph);
//        }
//
//        List<SimpleTextElement> sentences = new ArrayList<>();
//
//        for (SimpleTextElement simpleTextElement : paragraphs){
//            if (simpleTextElement instanceof Paragraph) {
//                for (SimpleTextElement sentence : ((Paragraph) simpleTextElement).getSentences())
//                sentences.add(sentence);
//            }
//        }

//        return newBook;
        return book;
    }
}
