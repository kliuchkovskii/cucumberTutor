package com.cucumberTest.bo;

import com.cucumberTest.page.HomePage;


public class HomeBO extends BaseBO{
    private HomePage homePage;

    public HomeBO(){
        homePage = new HomePage();
    }

    public String navigateToHomePage(){
        homePage.goToHomePage();
        return homePage.getTitle();
    }

    public void setFirstAndLastName(String firstName, String lastName){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        homePage.setFirstNameField(firstName);
        homePage.setLastNameField(lastName);
    }




}
