package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homepage extends Utils {


    public void click_on_Sign_in_btn(){
        //Click on Sign in Btn
        driverWaitsUntilClick(By.xpath("//a[contains(@title,\"Log in\")]"),5);
    }




}
