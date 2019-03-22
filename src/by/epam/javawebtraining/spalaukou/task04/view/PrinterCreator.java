package by.epam.javawebtraining.spalaukou.task04.view;

/**
 * @author Stanislau Palaukou on 22.03.2019
 * @project task04
 */

public class PrinterCreator {

  public enum printerType {
    CONSOLE,
    FILE,
    LOG
  }

  public static Printable create(PrinterCreator.printerType printerType) {
    Printable printer;

    switch (printerType) {
      case FILE:
        printer = new FilePrinter();
        break;
      case CONSOLE:
      default:
        printer = new ConsolePrinter();
        break;
    }
    return printer;
  }
}
