package by.epam.javawebtraining.spalaukou.task04.model.exception;

/**
 * @author Stanislau Palaukou on 23.03.2019
 * @project WordsCalculator
 */

public class LogicalException extends WordsTaskException {
    public LogicalException() {
        super();
    }

    public LogicalException(String message) {
        super(message);
    }

    public LogicalException(String message, Throwable cause) {
        super(message, cause);
    }

    public LogicalException(Throwable cause) {
        super(cause);
    }
}
