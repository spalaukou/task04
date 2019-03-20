package by.epam.javawebtraining.spalaukou.task04.model.entity;

import by.epam.javawebtraining.spalaukou.task04.model.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislau Palaukou on 20.03.2019
 * @project task04
 */

public class PunctuationMark implements Text {
  private List<Character> marks = new ArrayList<>();

  public void addComponent(Character component) {
    marks.add(component);
  }

  public void removeComponent(Character component) {
    marks.remove(component);
  }

  @Override
  public void write() {
    for (Character component : marks) {
      System.out.print(component);
    }
  }
}
