package by.epam.javawebtraining.spalaukou.task04.model.entity;

/**
 * @author Stanislau Palaukou on 29.03.2019
 * @project task04
 */

public abstract class AbstractTextElement implements SimpleTextElement {
    private String value;

    AbstractTextElement() {
        value = "";
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
