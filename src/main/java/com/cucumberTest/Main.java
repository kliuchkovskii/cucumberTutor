package com.cucumberTest;

import com.cucumberTest.bo.HomeBO;
import com.cucumberTest.utils.PropertyLoader;

public class Main {
    public static void main(String[] args) {
        HomeBO homeBO = new HomeBO();
        System.out.println(homeBO.navigateToHomePage());

    }
}
