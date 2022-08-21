package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationSuccess extends Utils{

    public void verify_Registration_Success(){
        driverWaitUrlToBe("http://automationpractice.com/index.php?controller=my-account",5);
        String actitle=titleOfPage();
        String expTitle = "My account - My Store";
        Assert.assertEquals(actitle,expTitle,"Title does not matched");
    }

    public void click_Logout_Btn(){
        //Logout button
        driverClickOnElement(By.xpath("//a[contains(text(),'Sign out') and @class='logout']"));
    }
}
