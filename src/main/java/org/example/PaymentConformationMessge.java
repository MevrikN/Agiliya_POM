package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class PaymentConformationMessge extends Utils{

    public void verify_payment_conformation_message(){
       String actualText = gettext(By.xpath("//p[@class='cheque-indent']/strong"));
       String expectedText = "complete";

        Assert.assertTrue(actualText.contains(expectedText));
    }
}
