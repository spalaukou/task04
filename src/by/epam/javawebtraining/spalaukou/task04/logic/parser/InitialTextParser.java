package by.epam.javawebtraining.spalaukou.task04.logic.parser;

/**
 * @author Stanislau Palaukou on 20.03.2019
 * @project task04
 */

public class InitialTextParser {
  private static final String NEWLINE_PATTERN = "\n";

  public static String[] parse(String initialText) {
    String[] strings = initialText.split(NEWLINE_PATTERN);
    return strings;
  }
}
