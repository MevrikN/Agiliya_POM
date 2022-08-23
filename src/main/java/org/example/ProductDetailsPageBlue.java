package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductDetailsPageBlue extends Utils {

    By _addToWishlist = By.xpath("//a[normalize-space()='Add to wishlist']");
    By _colorBox = By.id("color_14");
    By _successMsg = By.xpath("//p[contains(text(),'Added to your wishlist.')]");
    By _clickOnClose = By.xpath("//a[@title='Close']");
    By _addToCartBtn = By.xpath("//p[@id='add_to_cart']//span[normalize-space()='Add to cart']");

    //Verify URL
    public void verify_url() {
        try {
            driverWaitUrlToBe("http://automationpractice.com/index.php?id_product=5&controller=product#/size-s/color-blue", 5);
        } catch (Exception e) {
            titleOfPage().equalsIgnoreCase("508 Resource Limit Is Reached");
            driver.navigate().refresh();
        }
    }

    //Verify color box
    public void verifyColorBox(String exColor){
       String acColor= getAttributeValue(_colorBox,"name");
        Assert.assertEquals(acColor.toLowerCase(),exColor.toLowerCase(),"Color is not matched");
    }

    //Add to wishlist button
    public void click_add_to_wishlist(){
        driverClickOnElement(_addToWishlist);
    }

    //Verify success message
    public  void verify_success_message(){
        String actText = gettext(_successMsg);
        String expText = "Added to your wishlist.";
        Assert.assertEquals(actText,expText,"Success Message does not matched");
    }

    //Close button
    public void click_close_Btn(){
        driverClickOnElement(_clickOnClose);
    }


}
