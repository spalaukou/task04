package by.epam.javawebtraining.spalaukou.task04.controller;

import by.epam.javawebtraining.spalaukou.task04.logic.reader.DataReader;
import by.epam.javawebtraining.spalaukou.task04.logic.creator.BookCreator;
import by.epam.javawebtraining.spalaukou.task04.logic.sorter.*;
import by.epam.javawebtraining.spalaukou.task04.model.entity.TextComposite;
import by.epam.javawebtraining.spalaukou.task04.view.Printable;
import by.epam.javawebtraining.spalaukou.task04.view.PrinterCreator;

/**
 * @author Stanislau Palaukou on 15.03.2019
 * @project WordsCalculator
 */

public class Main {
    public static void main(String[] args) {
        //Initializing printer
        Printable printer = PrinterCreator.create(PrinterCreator.printerType.FILE);

        //Reading text from file
        String initialText = DataReader.readFile("input\\inputData.txt");

        //Creating book in Composite
        TextComposite book = BookCreator.create(initialText);

        //Extracting Book
        //printer.print(book);

        //Sorting book
        SentenceSorter sentenceSorter = new SentenceSorter();

        sentenceSorter.setSortingBehavior(new LengthByAscendingBehavior());
        sentenceSorter.sort(book);

        sentenceSorter.setSortingBehavior(new LengthByDescendingBehavior());
        sentenceSorter.sort(book);

        sentenceSorter.setSortingBehavior(new WordsByAscendingBehavior());
        sentenceSorter.sort(book);

        sentenceSorter.setSortingBehavior(new WordsByDescendingBehavior());
        sentenceSorter.sort(book);

    }
}