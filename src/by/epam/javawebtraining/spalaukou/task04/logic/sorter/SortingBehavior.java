package by.epam.javawebtraining.spalaukou.task04.logic.sorter;

import by.epam.javawebtraining.spalaukou.task04.model.entity.SimpleTextElement;
import by.epam.javawebtraining.spalaukou.task04.model.entity.TextComposite;
import by.epam.javawebtraining.spalaukou.task04.model.exception.LogicalException;

import java.util.List;

/**
 * @author Stanislau Palaukou on 25.03.2019
 * @project WordsCalculator
 */

public interface SortingBehavior {
    List<SimpleTextElement> sort(TextComposite book) throws LogicalException;
}
