package com.Carepay.BDD.StepDefinition;

import com.Carepay.Base.BaseClass;
import com.Carepay.pageObject.AddProduct;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Product;

public class FilterProduct extends BaseClass {
AddProduct filterProduct = new AddProduct();

    @Given("You are on catalogue page")
    public void you_are_on_catalogue_page() {
       openBrowser();
       SetUp();

    }
    @And("Filter product by clicking all product Menu")
    public void filter_product_by_clicking_all_product_menu() throws InterruptedException {
        filterProduct.ClickAllProduct(driver);

    }
    @And("Click Electronic Menu")
    public void click_electronic_menu() {
        filterProduct.ClickElectronic(driver);
    }

    @Then("Click Add product to carte")
    public void click_add_product_to_carte() {
        filterProduct.AddToCarteSearchItem(driver);
    }


}
