package by.epam.javawebtraining.spalaukou.task04.model.entity;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * @author Stanislau Palaukou on 25.03.2019
 * @project task04
 */

public class WordTest {
  private Word expected;

  @BeforeMethod
  public void setUp() {
    expected = new Word("Hello");
  }

  @Test
  public void testDefaultConstructor() {
    Word expected = new Word();
    Word actual = new Word();

    assertEquals(expected, actual);
  }

  @Test
  public void testCopyConstructor() {
    Word actual = new Word(this.expected);

    assertEquals(expected, actual);
  }

  @Test
  public void testGetTextElementName() {
    String expected = "Word";
    String actual = this.expected.getTextElementName();

    assertEquals(expected, actual);
  }

  @Test
  public void testGetValue() {
    String expected = "Hello";
    String actual = this.expected.getValue();

    assertEquals(expected, actual);
  }

  @Test
  public void testSetValue() {
    String expected = "New";
    this.expected.setValue(expected);
    String actual = this.expected.getValue();

    assertEquals(expected, actual);
  }

  @Test
  public void testEquals() {
    Word actual = new Word("Hello");

    assertEquals(actual, expected);
  }

  @Test
  public void testHashCode() {
    Word actual = new Word("Hello");

    assertEquals(expected.hashCode(), actual.hashCode());
  }

  @Test
  public void testToString() {
    String expected = "Hello";
    String actual = this.expected.toString();

    assertEquals(expected, actual);
  }
}