package com.Carepay.BDD.StepDefinition;

import com.Carepay.Base.BaseClass;
import com.Carepay.pageObject.AddProduct;
import com.Carepay.pageObject.DeleteProduct;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.hu.De;

public class RemoveMultipleProduct extends BaseClass {
DeleteProduct deleteProduct =new DeleteProduct();
AddProduct addProduct = new AddProduct();
    @Given("you are on the product catalogue page")
    public void you_are_on_the_product_catalogue_page() throws InterruptedException {
//          addProduct.ClickAllProduct(driver);
    }
    @Then("Click on the Carte Icon")
    public void click_on_the_carte_icon() {
//         deleteProduct.ClickCarteIcon(driver);
    }
    @Then("click on Empty carte button")
    public void click_on_empty_carte_button() {
      deleteProduct.RemoveAllProduct(driver);
    }


}
