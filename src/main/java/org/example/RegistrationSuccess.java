package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class RegistrationSuccess extends Utils{

    By _logoutBtn = By.xpath("//a[contains(text(),'Sign out') and @class='logout']");
    By _searchBox = By.xpath("//input[@id='search_query_top']");
    By _searchBtn = By.xpath("//button[contains(@name,\"submit_search\")]");
    By _womenTab = By.xpath("//a[text()='Women']");
    By _womenTopsTShirts = By.xpath("//li[1]//li/a[@title='Tops']//following-sibling::ul/li[1]/a[@title='T-shirts']");

    public void search_Item(String itemName ){
        driverSendKeys(_searchBox,itemName);
        driverClickOnElement(_searchBtn);
    }


    public void verify_Registration_Success(){
        driverWaitUrlToBe("http://automationpractice.com/index.php?controller=my-account",5);
        String actitle=titleOfPage();
        String expTitle = "My account - My Store";
        Assert.assertEquals(actitle,expTitle,"Title does not matched");
    }

    public void click_Logout_Btn(){
        //Logout button
        driverClickOnElement(_logoutBtn);
    }

    public void women_category(){
        Actions actions = new Actions(driver);
        Action hoverOverWomenCategory = actions.moveToElement(driver.findElement(_womenTab))
               .moveToElement(driver.findElement(_womenTopsTShirts)).click().build();

        hoverOverWomenCategory.perform();
    }

}
