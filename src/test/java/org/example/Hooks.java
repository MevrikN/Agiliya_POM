package org.example;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks extends Utils {

    DriverManager driverManager = new DriverManager();

    @BeforeMethod
    public void set_Up() {
        //Open Browser
        driverManager.open_Browser();
    }

    @AfterMethod
    public void tearDown(ITestResult result){
        //If Test case fail , It takes a screenshot of that page
        if (!result.isSuccess()){
            takeScreenshot(result.getName());
        }
        //Close browser
        //driverManager.close_Browser();
    }
}

