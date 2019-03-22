package by.epam.javawebtraining.spalaukou.task04.logic.parser;

/**
 * @author Stanislau Palaukou on 22.03.2019
 * @project WordsCalculator
 */

public class ChainParserCreator {

    public static TextParser create() {
        return new BookParser(new ParagraphParser(new SentenceParser()));
    }
}
