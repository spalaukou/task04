package by.epam.javawebtraining.spalaukou.task04.logic;

import by.epam.javawebtraining.spalaukou.task04.model.entity.*;

import java.util.*;


/**
 * @author Stanislau Palaukou on 23.03.2019
 * @project WordsCalculator
 */

public class SentenceSorter {

    public static List<SimpleTextElement> sortByAscending(TextComposite book) {

        List<SimpleTextElement> allSentences = new ArrayList<>();

        for (SimpleTextElement line : book.getChildren()) {
            if (line instanceof Paragraph) {
                allSentences.addAll(((TextComposite) line).getChildren());
            }
        }

        Collections.sort(allSentences, new SentenceLengthComparator());

        for(SimpleTextElement sentence : allSentences) {
            System.out.println(sentence);
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
















































//        List<SimpleTextElement> paragraphs = new ArrayList<>();
//        for(SimpleTextElement line : lines) {
//            if(line instanceof Paragraph) {
//                paragraphs.add(line);
//            }
//        }
////        All paragraphs
////        System.out.println(paragraphs);
//
//        List<SimpleTextElement> sentences = new ArrayList<>();
//        for(SimpleTextElement paragraph : paragraphs) {
//            System.out.println(((Paragraph) paragraph).getSentences());
//
//        }



































//        //getting lines
//        for (SimpleTextElement line : ((Book) book).getLines()) {
//            // - all book here
////            System.out.print(line);
//
//            //getting paragraphs
//            if (line instanceof Paragraph) {
//                // - paragraphs here
////                System.out.print(line);
//                for (SimpleTextElement paragraph : ((Paragraph) line).getSentences()) {
//                        for (SimpleTextElement sentence : ((Sentence) paragraph).getSimpleTextElements()) {
//                            System.out.print(sentence);
//                    }
//                }
//            }
//        }





        //---------------------------------------------------------------------

//        List<SimpleTextElement> paragraphs = ((Book) newBook).getSentences();
//
//        for(SimpleTextElement simpleTextElement : paragraphs) {
//            if(simpleTextElement instanceof Paragraph) {
//                System.out.print(simpleTextElement);
//            }
//        }

        //---------------------------------------------------------------------

//        System.out.println(Arrays.toString(paragraphs));
//        for (SimpleTextElement paragraph : paragraphs) {
//            System.out.println(paragraph);
//        }
//
//        List<SimpleTextElement> sentences = new ArrayList<>();
//
//        for (SimpleTextElement simpleTextElement : paragraphs){
//            if (simpleTextElement instanceof Paragraph) {
//                for (SimpleTextElement sentence : ((Paragraph) simpleTextElement).getSentences())
//                sentences.add(sentence);
//            }
//        }

//        return newBook;
//        return null;
//    }
//}
