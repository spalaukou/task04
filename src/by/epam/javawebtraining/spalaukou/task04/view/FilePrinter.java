package by.epam.javawebtraining.spalaukou.task04.view;

import java.io.*;

/**
 * @author Stanislau Palaukou on 22.03.2019
 * @project task04
 */

public class FilePrinter implements Printable {

  @Override
  public void print(Object o) {
    String fileName = "output/outputData.txt";

    try (Writer bufferedWriter = new BufferedWriter(new OutputStreamWriter(
            new FileOutputStream(new File(fileName))))) {

      bufferedWriter.write(o.toString() + "\n");

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
