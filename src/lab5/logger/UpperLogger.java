package lab5.logger;

public class UpperLogger extends LoggerDecorator {

    public UpperLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String message) {
        logger.log(message.toUpperCase());
    }

}
