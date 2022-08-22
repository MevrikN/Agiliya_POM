package org.example;


import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager extends Utils{

    LoadProp loadProp = new LoadProp();


    public void open_Browser() {

        //Chrome Browser
        System.setProperty("webdriver.chrome.driver", "src/test/Drivers/chromedriver.exe");
        driver = new ChromeDriver(); // import chrome web-Driver dependency (In 'POM' file)

        //Implicitly Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Maximize The Window
        driver.manage().window().maximize();

        //Open WebPage
        driver.get(loadProp.getProperty("baseUrl"));

    }


    public void close_Browser(){
        driver.quit();
    }
}
