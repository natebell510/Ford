package com.ford.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties = new Properties();

    static {
        try {
            //String file = "config.properties";
            FileInputStream file = new FileInputStream("config.properties");
            properties.load(file);
            file.close();


        } catch (IOException e) {
            System.out.println("config.properties has issues!");
            e.printStackTrace();
        }
    }
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }


}
