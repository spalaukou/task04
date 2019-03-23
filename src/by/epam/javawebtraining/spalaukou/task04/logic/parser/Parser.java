package by.epam.javawebtraining.spalaukou.task04.logic.parser;

import by.epam.javawebtraining.spalaukou.task04.model.entity.TextComposite;

/**
 * @author Stanislau Palaukou on 22.03.2019
 * @project WordsCalculator
 */

public interface Parser {
    TextComposite parse(String initialString);
}
