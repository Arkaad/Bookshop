package com.bookshop.common;

import java.awt.*;

public class GUIUtility {

    public static void center(Container container) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = container.getWidth();
        int height = container.getHeight();
        container.setBounds((screenSize.width - width) / 2, (screenSize.height - height) / 2, width, height);
    }

    public static void fullScreen(Container container) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight() - 25;
        container.setBounds(0, 0, width, height);
    }
}
