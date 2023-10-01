package org.awakenedpoeclicker.service;

import java.awt.*;
import java.awt.event.InputEvent;

public class Service {
    public static Robot serviceBot;

    static {
        try {
            serviceBot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    public static void mouseLeftClick() throws AWTException {
        serviceBot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        serviceBot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public static void mouseRightClick() {
        serviceBot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        serviceBot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    }
}
