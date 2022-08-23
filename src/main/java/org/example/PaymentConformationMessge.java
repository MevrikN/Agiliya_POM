package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class PaymentConformationMessge extends Utils{

    By _getText = By.xpath("//p[@class='cheque-indent']/strong");

    //Verify payment page text
    public void verify_payment_conformation_message(){
       String actualText = gettext(_getText);
       String expectedText = "complete";
        Assert.assertTrue(actualText.contains(expectedText));
    }
}
