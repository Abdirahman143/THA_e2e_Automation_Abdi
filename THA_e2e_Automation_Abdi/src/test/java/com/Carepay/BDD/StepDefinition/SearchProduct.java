package com.Carepay.BDD.StepDefinition;

import com.Carepay.Base.BaseClass;
import com.Carepay.pageObject.AddProduct;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.annotations.BeforeSuite;

public class SearchProduct extends BaseClass {
AddProduct searchProduct = new AddProduct();
    @Given("You are on the catalogue product Page")
    public void you_are_on_the_catalogue_product_page() throws InterruptedException {
        searchProduct.ClickAllProduct(driver);
    }

    @And("Click all product Icon")
    public void click_all_product_menu() throws InterruptedException {
       searchProduct.ClickAllProduct(driver);
    }
    @And("click on Search Input")
    public void click_on_search_input() {
        searchProduct.ClickSearchBox(driver);
    }
    @Given("Clear on the Search input")
    public void clear_on_the_search_input() {
       searchProduct.ClearSearch(driver);
    }
    @And("Search product by typing <ProductName>")
    public void search_product_by_typing_product_name() {
        searchProduct.SearchProduct(driver,"Mens Cotton");
    }

    @Then("Click Add searched product to Carte")
    public void click_add_to_carte() {
       searchProduct.AddToCarteSearchItem(driver);
    }
}
