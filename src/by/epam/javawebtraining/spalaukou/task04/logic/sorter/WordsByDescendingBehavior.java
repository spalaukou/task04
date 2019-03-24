package by.epam.javawebtraining.spalaukou.task04.logic.sorter;

import by.epam.javawebtraining.spalaukou.task04.logic.comparator.SentenceWordsComparator;
import by.epam.javawebtraining.spalaukou.task04.model.entity.SimpleTextElement;
import by.epam.javawebtraining.spalaukou.task04.model.entity.TextComposite;

import java.util.List;

/**
 * @author Stanislau Palaukou on 25.03.2019
 * @project WordsCalculator
 */

public class WordsByDescendingBehavior implements SortingBehavior {

    @Override
    public List<SimpleTextElement> sort(TextComposite book) {
        List<SimpleTextElement> allSentences = SentencesGetter.getSentences(book);
        allSentences.sort(new SentenceWordsComparator().reversed());
        for(SimpleTextElement sentence : allSentences) {
            System.out.println(sentence.toString().trim());
        }
        return allSentences;
    }
}
