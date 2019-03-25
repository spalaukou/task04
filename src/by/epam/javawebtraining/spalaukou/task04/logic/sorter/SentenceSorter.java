package by.epam.javawebtraining.spalaukou.task04.logic.sorter;

import by.epam.javawebtraining.spalaukou.task04.model.entity.*;
import by.epam.javawebtraining.spalaukou.task04.model.exception.LogicalException;

import java.util.*;


/**
 * @author Stanislau Palaukou on 23.03.2019
 * @project WordsCalculator
 */

public class SentenceSorter implements SortingBehavior{
    private SortingBehavior sortingBehavior;

    public void setSortingBehavior(SortingBehavior sortingBehavior) {
        if (sortingBehavior != null) {
            this.sortingBehavior = sortingBehavior;
        }
    }

    @Override
    public List<SimpleTextElement> sort(TextComposite book) throws LogicalException {
        if (book != null) {
            return sortingBehavior.sort(book);
        }
        throw new LogicalException();
    }
}
