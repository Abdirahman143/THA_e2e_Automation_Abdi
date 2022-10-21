package com.Carepay.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddProduct {
public static WebDriver driver;
    By filterElectron = By.xpath("/html/body/app-root/app-products/div[1]/div/div[2]/a/h6");
    By searchItem = By.xpath("/html/body/app-root/app-header/header/div/div/div/input");
    By allProduct = By.xpath("/html/body/app-root/app-products/div[1]/div/div[1]/a/h6");
    By addToCartTwoTBDisk =By.xpath("/html/body/app-root/app-products/div[2]/div/div[1]/button");
    By addToCartToSearchProduct =By.xpath("/html/body/app-root/app-products/div[2]/div/div/button");



    public void ClickAllProduct(WebDriver driver) throws InterruptedException {
        driver.findElement(allProduct).click();
        Thread.sleep(2000);
    }

    public void ClickElectronic(WebDriver driver){
        driver.findElement(filterElectron).click();

    }

    public void AddCarteToFilteredProduct(WebDriver driver){
        driver.findElement(addToCartTwoTBDisk).click();
    }

    public void ClickSearchBox(WebDriver driver){
        driver.findElement(searchItem).click();

    }
    public void ClearSearch(WebDriver driver){
        driver.findElement(searchItem).clear();
    }

    public void SearchProduct(WebDriver driver,String productName){

        driver.findElement(searchItem).sendKeys(productName);
    }

    public void AddToCarteSearchItem(WebDriver driver){
        driver.findElement(addToCartToSearchProduct).click();
    }


}
