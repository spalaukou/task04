package by.epam.javawebtraining.spalaukou.task04.logic.parser;

import by.epam.javawebtraining.spalaukou.task04.model.entity.TextComposite;

/**
 * @author Stanislau Palaukou on 22.03.2019
 * @project task04
 */

public abstract class TextParser implements Parser {
  TextParser next;

  TextParser(){}

  TextParser(TextParser next) {
    if(next != null) {
      this.next = next;
    }
  }

  @Override
  public abstract TextComposite parse(String initialString);
}
