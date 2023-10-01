package org.awakenedpoeclicker.service;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.awakenedpoeclicker.service.Service.*;

public class SextantClickerService {
    private static final int STONE_X_COORDINATE = 980;
    private static final int STONE_Y_COORDINATE = 928;
    private static final Logger logger = Logger.getLogger(SextantClickerService.class.getName());

    public static void runSextantClicker() throws AWTException, InterruptedException {
        logger.log(Level.INFO, "Sextant clicker started");
        Robot sextantRobot = new Robot();

        int xSextantCoordinate = 1300;
        int ySextantCoordinate = 610;

        int xCompassCoordinate = 1350;
        int yCompassCoordinate = 610;

        int xItemCoordinate = 1400;
        int yItemCoordinate = 610;

        int counter = 0;
        for (int i = 0; i < 5;) {
            sextantRobot.mouseMove(xSextantCoordinate, ySextantCoordinate); //sextants -> compasses
            sextantRobot.delay(125);
            mouseRightClick();
            sextantRobot.delay(125);
            sextantRobot.mouseMove(STONE_X_COORDINATE, STONE_Y_COORDINATE);
            sextantRobot.delay(125);
            mouseLeftClick();
            sextantRobot.delay(125);

            sextantRobot.mouseMove(xCompassCoordinate, yCompassCoordinate);
            sextantRobot.delay(125);
            mouseRightClick();
            sextantRobot.delay(125);
            sextantRobot.mouseMove(STONE_X_COORDINATE, STONE_Y_COORDINATE);
            sextantRobot.delay(125);
            mouseLeftClick();
            sextantRobot.delay(125);

            sextantRobot.mouseMove(xItemCoordinate, yItemCoordinate);
            sextantRobot.delay(125);
            mouseLeftClick();
            sextantRobot.delay(125);

            counter += 1;
            if (counter % 10 == 0){
                xItemCoordinate = 1400;
                ySextantCoordinate += 50;
                yCompassCoordinate += 50;
                yItemCoordinate += 50;
                i++;
            } else {
                xItemCoordinate += 53;
            }
            if (counter == 50) {
                break;
            }
        }
        logger.log(Level.INFO, "Sextant clicker finished");
    }
}
