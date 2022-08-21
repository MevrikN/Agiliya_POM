package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistartionDetails extends Utils {

    public String pssword = "abc@123";



    public void verify_Registration_Details_Url() {
        driverWaitUrlToBe("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation", 5);
    }

    public void getPageTitle(String exp_title) {
        String actualTitle = titleOfPage();
        Assert.assertEquals(actualTitle, exp_title, "Login - My Store");
    }

//    public String get_Email(){
//        //Email Check
//        String getEmail = driver.findElement(By.id("email")).getDomAttribute("value");
//        Assert.assertEquals(registrationPage.emailBuild,getEmail,"Email is not matched");
//        return getEmail;
//    }

    public void fill_all_details() {
        //Radio Button Male and Female Check
        driverClickOnElement(By.id("id_gender2"));

        //First name
        driverSendKeys(By.xpath("//input[@name=\"customer_firstname\"]"), "Mike");
        //Keyboard Actions

        //Last name
        driverSendKeys(By.id("customer_lastname"), "Tyson");
        //Keyboard Actions

        //Email Check
        String getEmail = driver.findElement(By.id("email")).getDomAttribute("value");
        System.out.println(getEmail);

        //Password
        driverSendKeys(By.id("passwd"),pssword);

        //Date Of Birth
        //Day   (By Index)
        selectByIndex(By.id("days"),9);
        //Month  (By Index)
        selectByIndex(By.id("months"),12);
        //Year   (by value)
        selectByValue(By.id("years"),"1996");

        //NewsLatter Check and un-Check
        driverClickOnElement(By.xpath("//input[contains(@name,\"newsletter\")]")); //Check
        driverClickOnElement(By.xpath("//input[contains(@name,\"newsletter\")]")); //Un check
        //Special Offers checkbox
        driverClickOnElement(By.cssSelector("#optin"));
        driverClickOnElement(By.cssSelector("#optin"));

        //@@@@@@@@@@@@@@@@@@@@@@@         Address Section     @@@@@@@@@@@@@@@@@@@@@@@@@@@@//

//        //First Name
//        driverSendKeys(By.xpath("//p[@class=\"required form-group\"]//child::input[@name='firstname']"),"Mike");
//
//        //Last Name
//        driverSendKeys(By.id("lastname"),"Tyson");

        //Address line 1
        driverSendKeys(By.name("address1"),"London AB109AB ");
        //City
        driverSendKeys(By.xpath("//p[@class=\"required form-group\"]//following::input[@name='city']"),"London");
        //State
        selectByVisibleText(By.id("id_state"),"Florida");

        //Zip Code
        driverSendKeys(By.id("postcode"),"01234");

        //Country
        selectByIndex(By.id("id_country"),1);

        //Additional information
        driverSendKeys(By.id("other"),"Enter any Text if you want.");

        //Mobile Phone
        driverSendKeys(By.id("phone_mobile"),"+44 1234567890");

    }

    public void click_Register_Btn(){
        driverWaitsUntilClick(By.xpath("//span[contains(text(),'Register')]"),5);
    }
}
