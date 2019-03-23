package by.epam.javawebtraining.spalaukou.task04.model.exception;

/**
 * @author Stanislau Palaukou on 23.03.2019
 * @project WordsCalculator
 */

public class TechnicalException extends WordsTaskException {
    public TechnicalException() {
        super();
    }

    public TechnicalException(String message) {
        super(message);
    }

    public TechnicalException(String message, Throwable cause) {
        super(message, cause);
    }

    public TechnicalException(Throwable cause) {
        super(cause);
    }
}
