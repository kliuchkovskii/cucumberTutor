package com.cucumberTest.page;

import com.cucumberTest.driver.DriverManager;
import com.cucumberTest.model.SEX;
import com.cucumberTest.utils.PropertyLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    @FindBy(xpath = "//input[@name=\"firstname\"]")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@name=\"lastname\"]")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@name=\"reg_email__\"]")
    private WebElement emailOrPhoneField;

    @FindBy(xpath = "//input[@name=\"birthday_year\"]")
    private WebElement DoBYEARDropList;

    @FindBy(xpath = "//input[@name=\"birthday_month\"]")
    private WebElement DoBMONTHDropList;

    @FindBy(xpath = "//input[@name=\"birthday_day\"]")
    private WebElement DoBDAYDropList;

    @FindBy(xpath = "//input[@name=\"reg_passwd__\"]")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@name=\"sex\"&&@value=2]")
    private WebElement maleRadio;

    @FindBy(xpath = "//input[@name=\"sex\"&&@value=1]")
    private WebElement femaleRadio;

    public void goToHomePage(){
        webDriver.get(PropertyLoader.getProperty(PropertyLoader.HOME_PAGE));
    }

    public String getTitle(){
        return webDriver.getTitle();
    }

    public void setFirstNameField(String firstName){
        firstNameField.sendKeys(firstName);
    }

    public void setLastNameField(String lastName){
        lastNameField.sendKeys(lastName);
    }

    public void setEmailOrPhoneField(String emailOrPhone){
        emailOrPhoneField.sendKeys(emailOrPhone);
    }

    public void setDoB(String doB){
        String[] dobArr = doB.split("/");
        DoBYEARDropList.click();
        webDriver.findElement(By.xpath("//input[@name=birthday_year]/option[test()=" + dobArr[2] + "]"));
        DoBMONTHDropList.click();
        webDriver.findElement(By.xpath("//input[@name=birthday_month]/option[test()=" + dobArr[1] + "]"));
        DoBDAYDropList.click();
        webDriver.findElement(By.xpath("//input[@name=birthday_day]/option[test()=" + dobArr[0] + "]"));
    }

    public void setPassword(String password){
        passwordField.sendKeys(password);
    }

    public void setSEX(SEX sex){
        if(sex==SEX.MALE)
            maleRadio.click();
        else
            femaleRadio.click();
    }
}
