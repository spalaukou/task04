package by.epam.javawebtraining.controller;


import by.epam.javawebtraining.logic.DataReader;
import by.epam.javawebtraining.logic.StringHandler;

/**
 * @author Stanislau Palaukou on 15.03.2019
 * @project WordsCalculator
 */

public class Main {
    public static void main(String[] args) {

        DataReader dataReader = new DataReader();
        String readedString = dataReader.readFile();

        StringHandler stringHandler = new StringHandler();
        stringHandler.sortStrings(readedString);
    }
}
