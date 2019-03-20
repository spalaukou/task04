package by.epam.javawebtraining.spalaukou.task04.logic.parser;

import by.epam.javawebtraining.spalaukou.task04.model.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public class ParagraphParser {
    private static final String SENTENCE_PATTERN =
            "(^[A-Z](.+)([\\w]|[.]|[:])(\\n))((^[-](.+)([;])(\\n))+)([-](.+)([.]))|(^[A-Z](.+)([\\w]|[.]|[:])$)";

    public static List<Text> parse(String paragraph){
        List<Text> components = new ArrayList<>();

        if(paragraph.matches(SENTENCE_PATTERN)) {
            //SentenceParser.parse(paragraph);
        } else {
            //CodeParser.parse(paragraph);
        }

        return null;
    }
}
