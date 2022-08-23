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

    //Get email from pre filed
    public String getEmailId (){
        String getEmail = driver.findElement(_getEmail).getDomAttribute("Value");
        System.out.println(getEmail);
        return getEmail;
    }

    //wait for URL
    public void verify_Registration_Details_Url() {
        try {
            urlContains("account-creation",10);

        }catch(Exception e){
            titleOfPage().equalsIgnoreCase("508 Resource Limit Is Reached");
            driver.navigate().refresh();
        }
    }

    //Get Page title
    public void getPageTitle(String exp_title) {
        String actualTitle = titleOfPage();
        Assert.assertEquals(actualTitle, exp_title, "Login - My Store");
    }

    //Radio button
    public void selectRedioBtn(){
        driverClickOnElement(_maleRadioBtn);
    }

    //First name
    public void fName(String firstName){
        driverSendKeys(_firstName,firstName);
    }

    //Last name
    public void lName(String lastName){
        driverSendKeys(_lastName, lastName);
    }

    //Password
    public void password(String password){
        driverSendKeys((_password),password);
    }

    //Day of birth
    public void dayOfBirth(int day){
        selectByIndex(By.id("days"),day);
    }

    //Day of Month
    public void monthOfBirth(int month){
        selectByIndex(By.id("months"),month);
    }

    //Day of Year
    public void yearOfBirth(String year){
        selectByValue(By.id("years"),year);
    }

    //Check boxes
    public void newsLatterBoxes(){

        //NewsLatter Check and un-Check
        driverClickOnElement(_newsLatter); //Check
        driverClickOnElement(_newsLatter); //Un check

        //Special Offers checkbox
        driverClickOnElement(_specialOffers); //Check
        driverClickOnElement(_specialOffers); //Un check
    }

    //Address line
    public void address(String address){
        driverSendKeys(_address1,address);
    }

    //City
    public void city(String cityName){
        driverSendKeys(_cityName,cityName);
    }

    //State
    public void state(String stateName){
        selectByVisibleText(_stateName,stateName);
    }

    //Zip Code
    public void zipCode(String zipCode){
        driverSendKeys(_zipCode,zipCode);
    }

    //Country
    public void country(){
        selectByIndex(_country,1);
    }

    //Additional information
    public void additionalInfo(String anyMassage){
        driverSendKeys(_other,anyMassage);
    }

    //Mobile Phone
    public void mobileNum(String mobileNumber){
        driverSendKeys(_mobileNumber,mobileNumber);
    }

    //Register button
    public void click_Register_Btn(){
        driverWaitsUntilClick(registerBtn,5);
    }

}
