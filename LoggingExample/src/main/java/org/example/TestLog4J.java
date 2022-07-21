package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileReader;

public class TestLog4J {

    public static Logger LOGGER = LogManager.getLogger();

    public static void logMessage(String message) {
        LOGGER.info(message);
        LOGGER.warn("This is a last warning");
        LOGGER.fatal("The program seems to have exploded.");

        try {
            int z = 10 / 2;
            var fr = new FileReader("x.txt");
        } catch (Exception e) {
            LOGGER.debug(e.getStackTrace());
            LOGGER.error(e.getMessage());
            LOGGER.catching(e);
        }
    }


}
