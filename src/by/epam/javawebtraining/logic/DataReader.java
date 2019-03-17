package by.epam.javawebtraining.logic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Stanislau Palaukou on 15.03.2019
 * @project WordsCalculator
 */

public class DataReader {

    String fileName = "input\\inputData.txt";

    public String readFile() {
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                stringBuilder.append(currentLine).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception." + e);
        } catch (IOException e) {
            System.out.println("General I/O exception." + e);
        }

        return stringBuilder.toString();
    }

}
