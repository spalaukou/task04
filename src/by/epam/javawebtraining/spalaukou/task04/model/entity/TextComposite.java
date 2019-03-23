package by.epam.javawebtraining.spalaukou.task04.model.entity;

/**
 * @author Stanislau Palaukou on 19.03.2019
 * @project WordsCalculator
 */

public interface TextComposite extends SimpleTextElement {
    void addElement(SimpleTextElement element);
    void removeElement(SimpleTextElement element);
}
