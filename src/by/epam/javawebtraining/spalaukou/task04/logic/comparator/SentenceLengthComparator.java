package by.epam.javawebtraining.spalaukou.task04.logic.comparator;

import by.epam.javawebtraining.spalaukou.task04.model.entity.SimpleTextElement;

import java.util.Comparator;

/**
 * @author Stanislau Palaukou on 25.03.2019
 * @project WordsCalculator
 */

public class SentenceLengthComparator implements Comparator<SimpleTextElement> {
    @Override
    public int compare(SimpleTextElement o1, SimpleTextElement o2) {
        return o1.toString().length() - o2.toString().length();
    }
}
