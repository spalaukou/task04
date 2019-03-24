package by.epam.javawebtraining.spalaukou.task04.logic.sorter;

import by.epam.javawebtraining.spalaukou.task04.model.entity.*;

import java.util.*;


/**
 * @author Stanislau Palaukou on 23.03.2019
 * @project WordsCalculator
 */

public class SentenceSorter implements SortingBehavior{
    private SortingBehavior sortingBehavior;

    public void setSortingBehavior(SortingBehavior sortingBehavior) {
        this.sortingBehavior = sortingBehavior;
    }

    @Override
    public List<SimpleTextElement> sort(TextComposite book) {
        return sortingBehavior.sort(book);
    }
}
