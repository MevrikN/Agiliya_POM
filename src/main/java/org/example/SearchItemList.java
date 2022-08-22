package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchItemList extends Utils{

    By _listOfProductNamesElements = By.xpath("//div[@class='right-block']//a[@class='product-name']");
    By _color= By.xpath("//li[1]//a[@style='background:#5D9CEC;']");

    public void verify_Page_Title(String expTitle){
        titleOfPage().contains(expTitle);
    }

    public void store_items_in_list(String searchText){
        //Store String name of product titles
        ArrayList<String> products = new ArrayList<>();

        //List of WebElements to get test
        List<WebElement> productLocators = driver.findElements(_listOfProductNamesElements);
        for (WebElement e : productLocators){
            products.add(e.getText());
        }
        System.out.println(products);
    }

    public void click_on_blue_on_product(){
    String color = driver.findElement(_color).getCssValue("background-color");
    if (color.equalsIgnoreCase("rgba(93, 156, 236, 1)")){
        driver.findElement(_color).click();
    }else {
        System.out.println("can't click on color");
    }
        String[] numbers = color.replace("rgba(", "").replace(")", "").split(",");
        int r = Integer.parseInt(numbers[0].trim());
        int g = Integer.parseInt(numbers[1].trim());
        int b = Integer.parseInt(numbers[2].trim());
        System.out.println(" r: " + r + " g: " + g + " b: " + b);

        String hex = "#" + Integer.toHexString(r) + Integer.toHexString(g) + Integer.toHexString(b);

        driver.findElement(_color).click();
        System.out.println(hex);
        System.out.println(color);
    }
}
