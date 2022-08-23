package org.example;

import org.openqa.selenium.By;

public class ProductCheckOutProcessStart extends Utils{
    By _proceedCheckOutBtn1 = By.xpath("//a[@class='btn btn-default button button-medium']//span");

    //Verify url
    public void verify_url(){
        driverWaitUrlToBe("http://automationpractice.com/index.php?id_product=1&controller=product",5);
    }

    //continue to checkout 1
    public void click_proceed_to_checkout1(){
        driverWaitsUntilClick(_proceedCheckOutBtn1,20);
    }
}
