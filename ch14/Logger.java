package gr.aueb.cf.ch14;

import static java.lang.System.currentTimeMillis;

public class Logger {
    private static Logger logger = null;

    private Logger() {}

    public static Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void logMessage(String message) {
        System.err.println(message);
        System.out.println(currentTimeMillis());


    }
}
