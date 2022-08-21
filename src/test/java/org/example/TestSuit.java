package org.example;

import org.testng.annotations.Test;

public class TestSuit extends Hooks{

    Homepage homepage = new Homepage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistartionDetails registartionDetails = new RegistartionDetails();
    RegistrationSuccess registrationSuccess = new RegistrationSuccess();




    @Test
    public void RegistrationSuccess() {
        homepage.click_on_Sign_in_btn();
        registrationPage.verify_Registration_Pg_Url();
        registrationPage.enter_Email_Address();
        registrationPage.verify_Login_Pg_Title("Login - My Store");
        registrationPage.click_Create_Account_Btn();
        registartionDetails.verify_Registration_Details_Url();
        registartionDetails.getPageTitle("Login - My Store");
        registartionDetails.fill_all_details();
        registartionDetails.click_Register_Btn();
        registrationSuccess.verify_Registration_Success();
        registrationSuccess.click_Logout_Btn();
        registrationPage.verify_Login_Pg_Title("Login - My Store");
    }


}
