package by.epam.javawebtraining.spalaukou.task04.controller;

import by.epam.javawebtraining.spalaukou.task04.logic.reader.DataReader;
import by.epam.javawebtraining.spalaukou.task04.logic.creator.BookCreator;
import by.epam.javawebtraining.spalaukou.task04.logic.sorter.*;
import by.epam.javawebtraining.spalaukou.task04.model.entity.TextComposite;
import by.epam.javawebtraining.spalaukou.task04.model.exception.TechnicalException;
import by.epam.javawebtraining.spalaukou.task04.view.Printable;
import by.epam.javawebtraining.spalaukou.task04.view.PrinterCreator;
import org.apache.log4j.Logger;

/**
 * @author Stanislau Palaukou on 15.03.2019
 * @project WordsCalculator
 */

public class Main {
    private static final Logger logger = Logger.getRootLogger();

    public static void main(String[] args) {
        logger.trace("App has been launched.");

        //Initializing printer
        Printable printer = PrinterCreator.create(PrinterCreator.printerType.CONSOLE);
        logger.trace("Printer has been created.");

        //Reading text from file
        String initialText = "";
        try {
            initialText = DataReader.readFile("input\\inputData.txt");
            logger.trace("File has been read successfully.");
        } catch (TechnicalException e) {
            e.printStackTrace();
        }

        //Creating book in Composite
        TextComposite book = BookCreator.create(initialText);
        logger.trace("Book has been created.");

        //Extracting Book
        //printer.print(book);

        //Sorting book
        SentenceSorter sentenceSorter = new SentenceSorter();
        logger.trace("Sorter has been created.");

        sentenceSorter.setSortingBehavior(new LengthByAscendingBehavior());
        sentenceSorter.sort(book);

        sentenceSorter.setSortingBehavior(new LengthByDescendingBehavior());
        sentenceSorter.sort(book);

        sentenceSorter.setSortingBehavior(new WordsByAscendingBehavior());
        sentenceSorter.sort(book);

        sentenceSorter.setSortingBehavior(new WordsByDescendingBehavior());
        sentenceSorter.sort(book);

        logger.trace("App has been finished.");

    }
}