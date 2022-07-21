package org.example;

import java.io.FileReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLogger {
    public static void main(String[] args) {
        var LOGGER = LogManager.getLogger();
        LOGGER.info("adding INFO logs");
        LOGGER.warn("This is warning");
        LOGGER.fatal("This is fatal must be fixed");
        //LOGGER.catching(Exception e);
        try {
            var z = 10 / 2;
            var fr = new FileReader("y.txt");
        } catch (Exception e) {
            LOGGER.debug(e.getStackTrace());
            LOGGER.error(e.getMessage());
            LOGGER.catching(e);
        }
    }

}
