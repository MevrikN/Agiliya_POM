package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks extends Utils{

    DriverManager driverManager = new DriverManager();

    @BeforeMethod
    public void set_Up(){
        driverManager.open_Browser();
    }

//    @AfterMethod
//    public void tear_Down(){
//        driverManager.close_Browser();
    }

