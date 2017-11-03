package com.bookshop.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {
    private static String path = "lib" + File.separator + "workbench.properties";
    private static Properties prop = null;

    public static void loadProperties() throws IOException {
        if (prop == null) {
            prop = new Properties();
        } else {
            prop.clear();
        }
        try (FileInputStream fis = new FileInputStream(path)) {
            prop.load(fis);
        }
    }
}
