package by.epam.javawebtraining.spalaukou.task04.logic;

import by.epam.javawebtraining.spalaukou.task04.model.entity.*;

import java.util.*;


/**
 * @author Stanislau Palaukou on 23.03.2019
 * @project WordsCalculator
 */

public class SentenceSorter {

    public static List<SimpleTextElement> sortByAscending(TextComposite book) {
        List<SimpleTextElement> allSentences = getSentences(book);
        allSentences.sort(new SentenceLengthComparator());
//        for(SimpleTextElement sentence : allSentences) {
//            System.out.println(sentence.toString().trim());
//        }
        return allSentences;
    }

    public static List<SimpleTextElement> sortByDescending(TextComposite book) {
        List<SimpleTextElement> allSentences = getSentences(book);
        allSentences.sort(new SentenceLengthComparator().reversed());
//        for(SimpleTextElement sentence : allSentences) {
//            System.out.println(sentence.toString().trim());
//        }
        return allSentences;
    }

    public static List<SimpleTextElement> sortByWordsByAscending(TextComposite book) {
        List<SimpleTextElement> allSentences = SentenceSorter.getSentences(book);
        List<SimpleTextElement> sentencesInWords = new ArrayList<>();
        for(SimpleTextElement simpleTextElement : allSentences) {
            List<SimpleTextElement> words = new ArrayList<>();
            for(SimpleTextElement word : ((Sentence) simpleTextElement).getChildren())
                if(word instanceof Word) {
                    words.add(word);
                }
            System.out.println(words);
        }
        return allSentences;
    }

    public static List<SimpleTextElement> getSentences(TextComposite book) {
        List<SimpleTextElement> allSentences = new ArrayList<>();
        for (SimpleTextElement line : book.getChildren()) {
            if (line instanceof Paragraph) {
                allSentences.addAll(((TextComposite) line).getChildren());
            }
        }
        return allSentences;
    }

    public static class SentenceLengthComparator implements Comparator<SimpleTextElement> {
        @Override
        public int compare(SimpleTextElement o1, SimpleTextElement o2) {
            return o1.toString().length() - o2.toString().length();
        }
    }
}
