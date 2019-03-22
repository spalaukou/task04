package by.epam.javawebtraining.spalaukou.task04.view;

/**
 * @author Stanislau Palaukou on 22.03.2019
 * @project task04
 */

public class ConsolePrinter implements Printable {

  @Override
  public void print(Object o) {
    System.out.println(o);
  }
}
