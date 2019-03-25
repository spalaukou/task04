package by.epam.javawebtraining.spalaukou.task04.model.entity;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

/**
 * @author Stanislau Palaukou on 25.03.2019
 * @project task04
 */

public class SentenceTest {
  private Sentence expected;
  private Sentence actual;
  private List<SimpleTextElement> expectedList;
  private List<SimpleTextElement> expectedList2;
  private List<SimpleTextElement> expectedList3;

  @BeforeMethod
  public void setUp() {
    expected = new Sentence();
    expected.addElement(new Word("Hello"));
    expected.addElement(new PunctuationMark(" "));
    expected.addElement(new Word("World"));
    expected.addElement(new PunctuationMark("!"));

    expectedList = expected.getChildren();

    expectedList2 = new ArrayList<>();
    expectedList2.add(new Word("Hello"));
    expectedList2.add(new PunctuationMark(" "));
    expectedList2.add(new Word("World"));
    expectedList2.add(new PunctuationMark("!"));
    expectedList2.add(new PunctuationMark("7"));

    expectedList3 = new ArrayList<>();
    expectedList3.add(new Word("Hello"));
    expectedList3.add(new PunctuationMark(" "));
    expectedList3.add(new Word("World"));

    actual = new Sentence();
    actual.addElement(new Word("Hello"));
    actual.addElement(new PunctuationMark(" "));
    actual.addElement(new Word("World"));
    actual.addElement(new PunctuationMark("!"));
  }

  @Test
  public void testDefaultConstructor() {
    Sentence expected = new Sentence();
    Sentence actual = new Sentence();

    assertEquals(expected, actual);
  }

  @Test
  public void testConstructor() {
    Sentence actual = new Sentence(expectedList);

    assertEquals(expected, actual);
  }

  @Test
  public void testCopyConstructor() {
    Sentence actual = new Sentence(expected);

    assertEquals(expected, actual);
  }

  @Test
  public void testGetTextElementName() {
    String expected = "Sentence";
    String actual = this.expected.getTextElementName();

    assertEquals(expected, actual);
  }

  @Test
  public void testGetChildren() {
    List<SimpleTextElement> expected = new ArrayList<>();
    expected.add(new Word("Hello"));
    expected.add(new PunctuationMark(" "));
    expected.add(new Word("World"));
    expected.add(new PunctuationMark("!"));

    assertEquals(expected, this.expected.getChildren());
  }

  @Test
  public void testAddElement() {
    expected.addElement(new PunctuationMark("7"));

    assertEquals(expected.getChildren(), expectedList2);
  }

  @Test
  public void testRemoveElement() {
    expected.removeElement(new PunctuationMark("!"));

    assertEquals(expected.getChildren(), expectedList3);
  }

  @Test
  public void testEquals() {
    assertEquals(expected, actual);
  }

  @Test
  public void testHashCode() {
    assertEquals(expected.hashCode(), actual.hashCode());

  }

  @Test
  public void testToString() {
    String expected = "Hello World!";

    assertEquals(expected, this.expected.toString());
  }
}