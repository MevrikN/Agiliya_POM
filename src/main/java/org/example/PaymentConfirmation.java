package org.example;

import org.openqa.selenium.By;

public class PaymentConfirmation extends Utils{

    By _clickConformBtn = By.xpath("//button[@type='submit']//span[text()='I confirm my order'] ");

    //Click Confirm button
    public void clickConformBtn(){
        driverClickOnElement(_clickConformBtn);
    }
}
