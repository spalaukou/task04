package by.epam.javawebtraining.spalaukou.task04.controller;

import by.epam.javawebtraining.spalaukou.task04.logic.parser.BookParser;
import by.epam.javawebtraining.spalaukou.task04.logic.parser.ParagraphParser;
import by.epam.javawebtraining.spalaukou.task04.logic.parser.SentenceParser;
import by.epam.javawebtraining.spalaukou.task04.logic.parser.TextParser;
import by.epam.javawebtraining.spalaukou.task04.logic.reader.DataReader;
import by.epam.javawebtraining.spalaukou.task04.logic.creator.BookCreator;
import by.epam.javawebtraining.spalaukou.task04.model.TextComposite;
import by.epam.javawebtraining.spalaukou.task04.view.Printable;
import by.epam.javawebtraining.spalaukou.task04.view.PrinterCreator;

/**
 * @author Stanislau Palaukou on 15.03.2019
 * @project WordsCalculator
 */

public class Main {
    public static void main(String[] args) {



        //Reading text from file
        String initialText = DataReader.readFile("input\\inputData.txt");

        //Creating book in Composite
        TextComposite book = BookCreator.create(initialText);

        //Extracting Book
        Printable printer = PrinterCreator.create(PrinterCreator.printerType.FILE);
        printer.print(book);

    }
}
