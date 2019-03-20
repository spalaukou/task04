package by.epam.javawebtraining.spalaukou.task04.controller;

import by.epam.javawebtraining.spalaukou.task04.logic.reader.DataReader;
import by.epam.javawebtraining.spalaukou.task04.logic.creator.BookCreator;
import by.epam.javawebtraining.spalaukou.task04.model.entity.Book;

/**
 * @author Stanislau Palaukou on 15.03.2019
 * @project WordsCalculator
 */

public class Main {
    public static void main(String[] args) {
        //Reading text from file
        String initialText = DataReader.readFile("input\\inputData.txt");

        //Creating book in memory
        Book book = BookCreator.create(initialText);

        //Extracting Book to console/file
        book.write();
    }
}
