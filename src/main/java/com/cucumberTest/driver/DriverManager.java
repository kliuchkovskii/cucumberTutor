package com.cucumberTest.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverManager {
    private static WebDriver webDriver;

    private DriverManager(){}

    public static WebDriver getInstance(){
        if(webDriver==null){
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();
        }
        return webDriver;
    }

    public static void close() {
        if(webDriver!=null) {
            webDriver.close();
            webDriver.quit();
        }else {
            throw new RuntimeException("Driver do not exist.");
        }
    }
}