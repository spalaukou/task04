package by.epam.javawebtraining.spalaukou.task04.model.exception;

/**
 * @author Stanislau Palaukou on 23.03.2019
 * @project WordsCalculator
 */

public class WordsTaskException extends Exception {
    public WordsTaskException() {
        super();
    }

    public WordsTaskException(String message) {
        super(message);
    }

    public WordsTaskException(String message, Throwable cause) {
        super(message, cause);
    }

    public WordsTaskException(Throwable cause) {
        super(cause);
    }
}
