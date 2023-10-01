package org.awakenedpoeclicker;

import java.awt.*;
import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import static org.awakenedpoeclicker.service.SextantClickerService.runSextantClicker;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try {
            LogManager.getLogManager().readConfiguration(Main.class.getResourceAsStream("/logging.properties"));
        } catch (IOException e) {
            System.err.println("Could not set up logger configuration: " + e);
        }

        logger.info("Application started");
        try {
            runSextantClicker();
        } catch (AWTException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        logger.info("Application finished");
    }
}