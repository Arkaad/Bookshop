package com.bookshop.common;

public class Validation {

    public static boolean isValidJavaVersion() {
        try {
            boolean isOk = true;
            String version = System.getProperty("java.version");
            System.out.println("System's Java Version:" + version);
            int pos = version.indexOf('.');
            pos = version.indexOf('.', pos + 1);
            if(Double.parseDouble(version.substring(0, pos)) < 1.8)
                isOk = false;
            return isOk;
        } catch (Exception ex) {
            throw ex;
        }
    }

//    public static boolean isDatabaseAvailable()
//    {
//        try
//        {
//            boolean available = false;
//
//            return available;
//        }
////        catch ()
//    }
}
