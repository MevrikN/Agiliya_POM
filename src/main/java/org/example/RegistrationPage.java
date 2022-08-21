package org.example;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils {


    public String emailBuild = "abc"+rendomdate()+"@gmail.com";


    public void verify_Registration_Pg_Url() {
        driverWaitUrlToBe("http://automationpractice.com/index.php?controller=authentication&back=my-account", 5);
    }

    public void enter_Email_Address() {

        driver.findElement(By.id("email_create")).sendKeys(emailBuild);
        System.out.println("Email address: " + emailBuild);
    }

    public void verify_Login_Pg_Title(String Exp_Title) {
        titleOfPage().contains(Exp_Title);
    }

    public void click_Create_Account_Btn() {
        driverWaitsUntilClick(By.id("SubmitCreate"), 0);

    }

    //Login email
//    public void enter_Login_Details() {
//        driverSendKeys(By.cssSelector("#email"),registartionDetails.get_Email());
//        System.out.println("Login page "+registartionDetails.get_Email());
//        driverSendKeys(By.name("passwd"), registartionDetails.pssword);
//    }

    //Click Login Button
    public void click_Login_Btn(){
        driverClickOnElement(By.id("SubmitLogin"));
    }
}
