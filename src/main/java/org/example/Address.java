package org.example;

import org.openqa.selenium.By;

public class Address extends Utils{
    By _proceedToCheckoutBtn3 = By.xpath("//button[@name='processAddress']//span");

    //Address page Checkout button
   public void click_checkout3(){
       driverWaitsUntilClick(_proceedToCheckoutBtn3,5);
   }
}
