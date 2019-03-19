package by.epam.javawebtraining.spalaukou.task04.logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Stanislau Palaukou on 15.03.2019
 * @project WordsCalculator
 */

public class DataReader {

    public static String readFile(String filePath) {
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                stringBuilder.append(currentLine).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringBuilder.toString();
    }

}
