package org.awakenedpoeclicker.service;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.awakenedpoeclicker.service.Service.*;

public class CurrencyClickerService {
    private static final Logger logger = Logger.getLogger(CurrencyClickerService.class.getName());
    private static final int CLICKER_DELAY = 3000;
    private static final int ROBOT_DELAY = 150;

    public static void runCurrencyClicker() {
        logger.log(Level.INFO, "Currency clicker started");
        try{
            Point coordinate;
            Robot currencyRobot = new Robot();
            currencyRobot.delay(CLICKER_DELAY);

            while(true) {
                coordinate = MouseInfo.getPointerInfo().getLocation();
                for (int i = 0; i < 10; i++) {
                    Color color = currencyRobot.getPixelColor((int) coordinate.getX()  + 20, (int) coordinate.getY() + i);
                    if ((color.getRed() == 231 && color.getGreen() == 180 && color.getBlue() == 119)) {
                        System.out.println("yellow(231,180,119) FOUND");
                        System.exit(1);
                    }
                }
                mouseLeftClick();
                currencyRobot.delay(ROBOT_DELAY);
            }
        } catch (AWTException e) {
            logger.log(Level.SEVERE, "Currency clicker failed");
        }
        logger.log(Level.INFO, "Currency clicker finished");
    }
}
