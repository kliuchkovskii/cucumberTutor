package com.cucumberTest.page;

import com.cucumberTest.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver webDriver;

    public BasePage(){
        webDriver = DriverManager.getInstance();
        PageFactory.initElements(webDriver,this);
    }
}
