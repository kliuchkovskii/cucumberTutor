package com.cucumberTest.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyLoader {

    public final static String BROWSER = "browser";
    public final static String HOME_PAGE = "home_page";
    public final static String REPORT_CONFIG_PATH = "report_config_path";


    private static Properties properties = new Properties();

    public static String getProperty(String key){
        String value = null;
        try(InputStream inputStream = new FileInputStream("src/main/resources/taf_config.properties")){
            properties.load(inputStream);
            value = properties.getProperty(key);
        }catch (IOException e){
            e.printStackTrace();
        }
        return value;
    }
}
