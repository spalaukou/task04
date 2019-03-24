package by.epam.javawebtraining.spalaukou.task04.logic.comparator;

import by.epam.javawebtraining.spalaukou.task04.model.entity.Sentence;
import by.epam.javawebtraining.spalaukou.task04.model.entity.SimpleTextElement;
import by.epam.javawebtraining.spalaukou.task04.model.entity.Word;

import java.util.Comparator;

/**
 * @author Stanislau Palaukou on 25.03.2019
 * @project WordsCalculator
 */

public class SentenceWordsComparator implements Comparator<SimpleTextElement> {
    @Override
    public int compare(SimpleTextElement o1, SimpleTextElement o2) {
        int count1 = 0;
        int count2 = 0;
        for (SimpleTextElement simpleTextElement : ((Sentence) o1).getChildren()) {
            if(simpleTextElement instanceof Word) {
                count1++;
            }
        }
        for (SimpleTextElement simpleTextElement : ((Sentence) o2).getChildren()) {
            if(simpleTextElement instanceof Word) {
                count2++;
            }
        }
        return count1 - count2;
    }
}
