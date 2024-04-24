package lab5.logger;

import java.util.Calendar;

public class TimeStampingLogger extends LoggerDecorator {

    public TimeStampingLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String message) {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);

        logger.log("\n-----------------------" + "Date: " + day + "/" + month + "/" + year + "-----------------------"
                + "\n" + message);

    }

}
