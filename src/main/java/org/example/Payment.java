package org.example;

import org.openqa.selenium.By;

public class Payment extends Utils{

    By _wirePaymentType = By.xpath("//a[@class='bankwire']");

    //Select Wire Payment
    public void selectPaymentWire(){
        driverClickOnElement(_wirePaymentType);
    }
}
