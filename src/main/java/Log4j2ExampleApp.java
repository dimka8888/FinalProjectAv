

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2ExampleApp {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.info("Log4j2ExampleApp started.");
        logger.warn("Something to warn");
    }
}