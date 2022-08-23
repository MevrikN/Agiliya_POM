package org.example;

import org.openqa.selenium.By;

public class Homepage extends Utils {

    By _signInBtn = By.xpath("//a[contains(@title,\"Log in\")]");

    //Click on Sign in Btn
    public void click_on_Sign_in_btn(){
        driverWaitsUntilClick(_signInBtn,5);
    }


}
