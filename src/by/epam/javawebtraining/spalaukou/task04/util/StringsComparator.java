package by.epam.javawebtraining.spalaukou.task04.util;

import java.util.Comparator;

/**
 * @author Stanislau Palaukou on 15.03.2019
 * @project WordsCalculator
 */

public class StringsComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return o1.toString().length() - o2.toString().length();
    }
}
