package by.epam.javawebtraining.spalaukou.task04.model.entity;

import by.epam.javawebtraining.spalaukou.task04.model.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislau Palaukou on 20.03.2019
 * @project task04
 */

public class Word implements Text {
  private List<String> words = new ArrayList<>();

  public void addComponent(String component) {
    words.add(component);
  }

  public void removeComponent(String component) {
    words.remove(component);
  }

  @Override
  public void write() {
    for(String component : words) {
      System.out.print(component);
    }
  }
}
