package by.epam.javawebtraining.spalaukou.task04.logic.creator;

import by.epam.javawebtraining.spalaukou.task04.logic.parser.ChainParserCreator;
import by.epam.javawebtraining.spalaukou.task04.model.entity.TextComposite;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class BookCreator {
    public static TextComposite create(String initialText) {
        return ChainParserCreator.create().parse(initialText);
    }
}
