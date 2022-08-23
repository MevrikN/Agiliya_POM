package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class T_Shirt extends Utils{
    By _itemName = By.xpath("//a[normalize-space()='Faded Short Sleeve T-shirts']");
    By _addToCartBtn = By.name("Submit");
    By _itemPrice = By.id("our_price_display");

    //Verify product page url
    public void verify_t_shirt_page(){
        String itemName = gettext(_itemName);
        Assert.assertTrue(itemName.equalsIgnoreCase("Faded Short Sleeve T-shirts"),"Item name is not matching");
    }

    //Click on product name
    public void click_on_product_name(){
        driverClickOnElement(_itemName);
    }

    //Add to cart button
    public void add_product_in_cart(){
        driverWaitsUntilClick(_addToCartBtn,5);
    }

    //Get Price
    public void get_price(){
      String price = gettext(_itemPrice);
        System.out.println("Price of product: "+price);
    }
}
