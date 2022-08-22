package org.example;

import org.openqa.selenium.By;

public class Homepage extends Utils {

    By _signInBtn = By.xpath("//a[contains(@title,\"Log in\")]");

    public void click_on_Sign_in_btn(){
        //Click on Sign in Btn
        driverWaitsUntilClick(_signInBtn,5);
    }
}
