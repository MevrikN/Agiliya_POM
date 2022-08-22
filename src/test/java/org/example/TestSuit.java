package org.example;

import org.testng.annotations.Test;

public class TestSuit extends Hooks{

    Homepage homepage = new Homepage();
    RegSignInPage regSignInPage = new RegSignInPage();
    RegistartionDetails registartionDetails = new RegistartionDetails();
    RegistrationSuccess registrationSuccess = new RegistrationSuccess();
    LoadProp loadProp = new LoadProp();
    AccountDeshboard accountDeshboard = new AccountDeshboard();
    SearchItemList searchItemList = new SearchItemList();
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();


    @Test
    public void RegistrationSuccess() {
        homepage.click_on_Sign_in_btn();
        regSignInPage.verify_Registration_Pg_Url();
        regSignInPage.verify_Login_Pg_Title("Login - My Store");
        regSignInPage.enter_Email_Address();
        regSignInPage.click_Create_Account_Btn();
        registartionDetails.verify_Registration_Details_Url();
        registartionDetails.getPageTitle("Login - My Store");
        registartionDetails.selectRedioBtn();
        registartionDetails.fName(loadProp.getProperty("firstname"));
        registartionDetails.lName(loadProp.getProperty("lastname"));
        registartionDetails.getEmailId();//Included Assertion
        registartionDetails.password(loadProp.getProperty("password"));
        registartionDetails.dayOfBirth(Integer.parseInt(loadProp.getProperty("dobDay")));
        registartionDetails.monthOfBirth(Integer.parseInt(loadProp.getProperty("dobMonth")));
        registartionDetails.yearOfBirth(loadProp.getProperty("dobYear"));
        registartionDetails.newsLatterBoxes();
        registartionDetails.address(loadProp.getProperty("address"));
        registartionDetails.city(loadProp.getProperty("city"));
        registartionDetails.state(loadProp.getProperty("state"));
        registartionDetails.zipCode(loadProp.getProperty("zipcode"));
        registartionDetails.country();//Default United States
        registartionDetails.additionalInfo("I am happy to be Automated");
        registartionDetails.mobileNum(loadProp.getProperty("mobileNumber"));
        registartionDetails.click_Register_Btn();//explicitly wait 5 seconds
        registrationSuccess.verify_Registration_Success();
        registrationSuccess.click_Logout_Btn();
        regSignInPage.verify_Login_Pg_Title("Login - My Store");
    }
    @Test
    public void user_should_login_with_valid_credentials(){
        homepage.click_on_Sign_in_btn();
        regSignInPage.verify_Registration_Pg_Url();
        regSignInPage.verify_Login_Pg_Title("Login - My Store");
        regSignInPage.login_EmailID();
        regSignInPage.login_password(loadProp.getProperty("password"));
        regSignInPage.login_Btn();
        regSignInPage.verify_Login_Pg_Title("My account - My Store");
    }
    @Test
    public void registered_user_should_able_to_search_product(){
        user_should_login_with_valid_credentials();
        accountDeshboard.search_Item("Blue Summer Dress");
        searchItemList.verify_Page_Title("Search - My Store");
        searchItemList.store_items_in_list("Summer Dress");
    }
    @Test
    public void registered_user_can_add_product_into_wishlist(){
        homepage.click_on_Sign_in_btn();
        regSignInPage.verify_Registration_Pg_Url();
        regSignInPage.verify_Login_Pg_Title("Login - My Store");
        regSignInPage.login_EmailID();
        regSignInPage.login_password(loadProp.getProperty("password"));
        regSignInPage.login_Btn();
        regSignInPage.verify_Login_Pg_Title("My account - My Store");
        accountDeshboard.search_Item("Blue Summer Dress");
        searchItemList.verify_Page_Title("Search - My Store");
        searchItemList.store_items_in_list("Summer Dress");
        searchItemList.click_on_blue_on_product();
        productDetailsPage.verify_url();
        productDetailsPage.verifyColorBox("Blue");
        productDetailsPage.click_add_to_wishlist();
        productDetailsPage.verify_success_message();
        productDetailsPage.click_close_Btn();

    }



}
