package org.example;

import org.openqa.selenium.By;

public class AccountDeshboard extends Utils{

    By _searchBox = By.xpath("//input[@id='search_query_top']");
    By _searchBtn = By.xpath("//button[contains(@name,\"submit_search\")]");



    public void search_Item(String itemName ){
        driverSendKeys(_searchBox,itemName);
        driverClickOnElement(_searchBtn);
    }
}
