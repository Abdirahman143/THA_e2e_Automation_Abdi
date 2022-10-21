package com.Carepay.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteProduct {

    By allProduct = By.xpath("/html/body/app-root/app-products/div[1]/div/div[1]/a/h6");
    By removeOneProduct =By.xpath("/html/body/app-root/app-cart/div/div/div/table/tbody/tr[1]/td[7]/button");
    By emptyCart  =By.xpath("/html/body/app-root/app-cart/div/div/div/table/tbody/tr[2]/td[2]/button\n");
    By cartIcon =By.xpath("/html/body/app-root/app-header/header/div/button");
     By Logo = By.xpath("/html/body/app-root/app-header/header/div/div/i");

    public void ClickCarteIcon(WebDriver driver){
        driver.findElement(cartIcon).click();
    }


    public void RemoveOneProduct(WebDriver driver){

        driver.findElement(removeOneProduct).click();

    }

    public void RemoveAllProduct(WebDriver driver){
        driver.findElement(emptyCart).click();
    }

public  Boolean verifyLogo(WebDriver driver){
       return  driver.findElement(Logo).isDisplayed();
}

}
