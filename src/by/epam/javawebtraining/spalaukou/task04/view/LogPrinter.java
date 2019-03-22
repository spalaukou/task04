package by.epam.javawebtraining.spalaukou.task04.view;

import org.apache.log4j.Logger;

/**
 * @author Stanislau Palaukou on 22.03.2019
 * @project task04
 */

public class LogPrinter implements Printable {

  private static final Logger logger = Logger.getLogger(LogPrinter.class);

  @Override
  public void print(Object o) {
    logger.trace(o);
  }
}
