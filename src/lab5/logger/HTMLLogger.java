package lab5.logger;

public class HTMLLogger extends LoggerDecorator {

    public HTMLLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String message) {
        logger.log("<html><body><p> " + message + " </p></body></html>");
    }

}
