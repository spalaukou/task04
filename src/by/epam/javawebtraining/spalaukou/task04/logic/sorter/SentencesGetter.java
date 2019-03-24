package by.epam.javawebtraining.spalaukou.task04.logic.sorter;

import by.epam.javawebtraining.spalaukou.task04.model.entity.Paragraph;
import by.epam.javawebtraining.spalaukou.task04.model.entity.SimpleTextElement;
import by.epam.javawebtraining.spalaukou.task04.model.entity.TextComposite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislau Palaukou on 25.03.2019
 * @project WordsCalculator
 */

class SentencesGetter {
    static List<SimpleTextElement> getSentences(TextComposite book) {
        List<SimpleTextElement> allSentences = new ArrayList<>();
        for (SimpleTextElement line : book.getChildren()) {
            if (line instanceof Paragraph) {
                allSentences.addAll(((TextComposite) line).getChildren());
            }
        }
        return allSentences;
    }
}
