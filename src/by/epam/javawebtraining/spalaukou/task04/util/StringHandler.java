package by.epam.javawebtraining.spalaukou.task04.util;

import java.util.Arrays;

/**
 * @author Stanislau Palaukou on 15.03.2019
 * @project WordsCalculator
 */

public class StringHandler {

    public void sortStrings(String string) {

        String[] splitted = string.split("\n");

        StringsComparator stringsComparator = new StringsComparator();

        Arrays.sort(splitted, stringsComparator);

        System.out.println(Arrays.toString(splitted));
    }
}
