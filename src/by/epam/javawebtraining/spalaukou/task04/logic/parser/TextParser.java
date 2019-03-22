package by.epam.javawebtraining.spalaukou.task04.logic.parser;


import by.epam.javawebtraining.spalaukou.task04.model.SimpleTextElement;

/**
 * @author Stanislau Palaukou on 22.03.2019
 * @project task04
 */

public abstract class TextParser {
  TextParser nextParser;

  void setNextParser(TextParser textParser){
    nextParser = textParser;
  }

  void start(String string) {
    parse(string);
    if(nextParser != null) {
      nextParser.start(string);
    }
  }

  abstract SimpleTextElement parse(String string);

}
