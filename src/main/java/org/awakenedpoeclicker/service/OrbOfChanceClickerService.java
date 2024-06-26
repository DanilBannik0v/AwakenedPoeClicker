package org.awakenedpoeclicker.service;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.awakenedpoeclicker.service.Service.mouseLeftClick;
import static org.awakenedpoeclicker.service.Service.mouseRightClick;

public class OrbOfChanceClickerService {
    private static final int SCOURING_X_COORDINATE = 436;
    private static final int SCOURING_Y_COORDINATE = 509;
    private static final int CHANCE_X_COORDINATE = 221;
    private static final int CHANCE_Y_COORDINATE = 259;
    private static final int ITEM_X_COORDINATE = 330;
    private static final int ITEM_Y_COORDINATE = 462;
    private static final Logger logger = Logger.getLogger(SextantClickerService.class.getName());
    private static final int ROBOT_DELAY = 100;

    public static void runOrbOfChaneClicker() throws AWTException, InterruptedException {
        logger.log(Level.INFO, "Orb of chance clicker started");
        Robot orbOfChanceRobot = new Robot();
        orbOfChanceRobot.delay(3000);

        int numberOfChances = 200;
        for (int i = 0; i < numberOfChances; i++) {
            orbOfChanceRobot.mouseMove(SCOURING_X_COORDINATE, SCOURING_Y_COORDINATE);
            orbOfChanceRobot.delay(ROBOT_DELAY);
            mouseRightClick();
            orbOfChanceRobot.delay(ROBOT_DELAY);

            orbOfChanceRobot.mouseMove(ITEM_X_COORDINATE, ITEM_Y_COORDINATE);
            orbOfChanceRobot.delay(ROBOT_DELAY);
            mouseLeftClick();
            orbOfChanceRobot.delay(ROBOT_DELAY);

            orbOfChanceRobot.mouseMove(CHANCE_X_COORDINATE, CHANCE_Y_COORDINATE);
            orbOfChanceRobot.delay(ROBOT_DELAY);
            mouseRightClick();
            orbOfChanceRobot.delay(ROBOT_DELAY);

            orbOfChanceRobot.mouseMove(ITEM_X_COORDINATE, ITEM_Y_COORDINATE);
            orbOfChanceRobot.delay(ROBOT_DELAY);
            mouseLeftClick();
            orbOfChanceRobot.delay(ROBOT_DELAY);
        }
        logger.log(Level.INFO, "Orb of chance clicker finished");
    }
}
