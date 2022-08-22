package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Locale;

public class ProductDetailsPage extends Utils {

    By _addToWishlist = By.xpath("//a[normalize-space()='Add to wishlist']");
    By _colorBox = By.id("color_14");
    By _successMsg = By.xpath("//p[contains(text(),'Added to your wishlist.')]");
    By _clickOnClose = By.xpath("//a[@title='Close']");

    public void verify_url(){
        driverWaitUrlToBe("http://automationpractice.com/index.php?id_product=5&controller=product#/size-s/color-blue",5);
    }

    public void verifyColorBox(String exColor){
       String acColor= getAttributeValue(_colorBox,"name");
        Assert.assertEquals(acColor.toLowerCase(),exColor.toLowerCase(),"Color is not matched");
    }

    public void click_add_to_wishlist(){
        driverClickOnElement(_addToWishlist);
    }
    public  void verify_success_message(){
        String actText = gettext(_successMsg);
        String expText = "Added to your wishlist.";
        Assert.assertEquals(actText,expText,"Success Message does not matched");
    }
    public void click_close_Btn(){
        driverClickOnElement(_clickOnClose);
    }

}
