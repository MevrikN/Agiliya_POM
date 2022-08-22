package org.example;

import org.testng.annotations.Test;

public class TestSuit extends Hooks{

    Homepage homepage = new Homepage();
    RegSignInPage regSignInPage = new RegSignInPage();
    RegistartionDetails registartionDetails = new RegistartionDetails();
    RegistrationSuccess registrationSuccess = new RegistrationSuccess();
    LoadProp loadProp = new LoadProp();
    SearchItemList searchItemList = new SearchItemList();
    ProductDetailsPageBlue productDetailsPageBlue = new ProductDetailsPageBlue();
    T_Shirt t_shirt = new T_Shirt();
    ProductCheckOutProcessStart productCheckOutProcessStart = new ProductCheckOutProcessStart();
    SoppingCartSummery soppingCartSummery = new SoppingCartSummery();
    Address address = new Address();
    Shipingtype shipingtype = new Shipingtype();
    Payment payment = new Payment();
    PaymentConfirmation paymentConfirmation = new PaymentConfirmation();
    PaymentConformationMessge paymentConformationMessge = new PaymentConformationMessge();



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
        homepage.click_on_Sign_in_btn();
        regSignInPage.verify_Registration_Pg_Url();
        regSignInPage.verify_Login_Pg_Title("Login - My Store");
        regSignInPage.login_EmailID();
        regSignInPage.login_password(loadProp.getProperty("password"));
        regSignInPage.login_Btn();
        regSignInPage.verify_Login_Pg_Title("My account - My Store");

        registrationSuccess.search_Item("Blue Summer Dress");
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
        searchItemList.verify_Page_Title("Search - My Store");
        searchItemList.store_items_in_list("Summer Dress");
        searchItemList.click_on_blue_on_product();
        productDetailsPageBlue.verify_url();
        productDetailsPageBlue.verifyColorBox("Blue");
        productDetailsPageBlue.click_add_to_wishlist();
        productDetailsPageBlue.verify_success_message();
        productDetailsPageBlue.click_close_Btn();

    }

    @Test
    public void user_should_able_to_buy_product(){
        homepage.click_on_Sign_in_btn();
        regSignInPage.verify_Registration_Pg_Url();
        regSignInPage.verify_Login_Pg_Title("Login - My Store");
        regSignInPage.login_EmailID();
        regSignInPage.login_password(loadProp.getProperty("password"));
        regSignInPage.login_Btn();
        regSignInPage.verify_Login_Pg_Title("My account - My Store");
        registrationSuccess.women_category();
        t_shirt.verify_t_shirt_page();
        t_shirt.click_on_product_name();
        t_shirt.add_product_in_cart();
        t_shirt.get_price();
        productCheckOutProcessStart.click_proceed_to_checkout1();
        soppingCartSummery.verify_cart_product_name("Faded Short Sleeve T-shirts");
        soppingCartSummery.verify_total_product_price("$16.51");
        soppingCartSummery.shiping_cost();
        soppingCartSummery.total_price();
        soppingCartSummery.proceed_to_checkout2();
        address.click_checkout3();

        shipingtype.select_check_box();
        shipingtype.click_proceed_to_checkout3();
        payment.selectPaymentWire();
        paymentConfirmation.clickConformBtn();
        paymentConformationMessge.verify_payment_conformation_message();
    }


}
