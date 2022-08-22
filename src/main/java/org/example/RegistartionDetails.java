package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistartionDetails extends Utils {


    By _maleRadioBtn = By.id("id_gender1");
    By _firstName = By.xpath("//input[@name=\"customer_firstname\"]");
    By _lastName = By.id("customer_lastname");
    By _getEmail = By.id("email");
    By _password = By.id("passwd");
    By _newsLatter = By.xpath("//input[contains(@name,\"newsletter\")]");
    By _specialOffers = By.cssSelector("#optin");
    By _address1 = By.name("address1");
    By _cityName = By.xpath("//p[@class=\"required form-group\"]//following::input[@name='city']");
    By _stateName =By.id("id_state");
    By _zipCode = By.id("postcode");
    By _country = By.id("id_country");
    By _other =By.id("other");
    By _mobileNumber = By.id("phone_mobile");
    By registerBtn = By.xpath("//span[contains(text(),'Register')]");

    public String getEmailId (){
        String getEmail = driver.findElement(_getEmail).getDomAttribute("Value");
        System.out.println(getEmail);
        return getEmail;
    }

    //wait for URL
    public void verify_Registration_Details_Url() {
        urlContains("my-account",5);
    }
    //Get Page title
    public void getPageTitle(String exp_title) {
        String actualTitle = titleOfPage();
        Assert.assertEquals(actualTitle, exp_title, "Login - My Store");
    }
    public void selectRedioBtn(){
        driverClickOnElement(_maleRadioBtn);
    }
    public void fName(String firstName){
        driverSendKeys(_firstName,firstName);
    }
    public void lName(String lastName){
        driverSendKeys(_lastName, lastName);
    }

    public void password(String password){
        driverSendKeys((_password),password);
    }
    public void dayOfBirth(int day){
        selectByIndex(By.id("days"),day);
    }
    public void monthOfBirth(int month){
        selectByIndex(By.id("months"),month);
    }
    public void yearOfBirth(String year){
        selectByValue(By.id("years"),year);
    }
    public void newsLatterBoxes(){
        //NewsLatter Check and un-Check
        driverClickOnElement(_newsLatter); //Check
        driverClickOnElement(_newsLatter); //Un check
        //Special Offers checkbox
        driverClickOnElement(_specialOffers); //Check
        driverClickOnElement(_specialOffers); //Un check
    }
    public void address(String address){
        //Address line
        driverSendKeys(_address1,address);
    }
    public void city(String cityName){
        //City
        driverSendKeys(_cityName,cityName);
    }
    public void state(String stateName){
        //State
        selectByVisibleText(_stateName,stateName);
    }
    public void zipCode(String zipCode){
        //Zip Code
        driverSendKeys(_zipCode,zipCode);
    }
    public void country(){
        //Country
        selectByIndex(_country,1);
    }
    public void additionalInfo(String anyMassage){
        //Additional information
        driverSendKeys(_other,anyMassage);
    }
    public void mobileNum(String mobileNumber){
        //Mobile Phone
        driverSendKeys(_mobileNumber,mobileNumber);
    }
    public void click_Register_Btn(){
        driverWaitsUntilClick(registerBtn,5);
    }

    public void fill_all_details() {
        //Radio Button Male and Female Check
       // driverClickOnElement(_maleRadioBtn);

        //First name
        //driverSendKeys(, "Mike");
        //Keyboard Actions

        //Last name
       // driverSendKeys(By.id("customer_lastname"), "Tyson");
        //Keyboard Actions

        //Email Check
//        String getEmail = driver.findElement(_getEmail).getDomAttribute("value");
//        System.out.println(getEmail);

        //Password
//        driverSendKeys(By.id("passwd"),password);

        //Date Of Birth
        //Day   (By Index)
//        selectByIndex(By.id("days"),9);
        //Month  (By Index)
//        selectByIndex(By.id("months"),12);
        //Year   (by value)
//        selectByValue(By.id("years"),"1996");

        //NewsLatter Check and un-Check
//        driverClickOnElement(By.xpath("//input[contains(@name,\"newsletter\")]")); //Check
//        driverClickOnElement(By.xpath("//input[contains(@name,\"newsletter\")]")); //Un check
        //Special Offers checkbox
//        driverClickOnElement(By.cssSelector("#optin"));
//        driverClickOnElement(By.cssSelector("#optin"));

        //@@@@@@@@@@@@@@@@@@@@@@@         Address Section     @@@@@@@@@@@@@@@@@@@@@@@@@@@@//

//        //First Name
//        driverSendKeys(By.xpath("//p[@class=\"required form-group\"]//child::input[@name='firstname']"),"Mike");
//
//        //Last Name
//        driverSendKeys(By.id("lastname"),"Tyson");

        //Address line 1
        //driverSendKeys(By.name("address1"),"London AB109AB ");
        //City
        //driverSendKeys(By.xpath("//p[@class=\"required form-group\"]//following::input[@name='city']"),"London");
        //State
        //selectByVisibleText(By.id("id_state"),"Florida");

        //Zip Code
       // driverSendKeys(By.id("postcode"),"01234");

//        //Country
//        selectByIndex(By.id("id_country"),1);

        //Additional information
      //  driverSendKeys(By.id("other"),"Enter any Text if you want.");

        //Mobile Phone
        //driverSendKeys(By.id("phone_mobile"),"+44 1234567890");

    }

}
