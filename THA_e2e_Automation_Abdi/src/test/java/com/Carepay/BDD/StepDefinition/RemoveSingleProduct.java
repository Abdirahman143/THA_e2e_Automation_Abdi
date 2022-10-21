package com.Carepay.BDD.StepDefinition;

import com.Carepay.Base.BaseClass;
import com.Carepay.pageObject.AddProduct;
import com.Carepay.pageObject.DeleteProduct;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class RemoveSingleProduct extends BaseClass {

AddProduct removeProduct = new AddProduct();
DeleteProduct deleteProduct = new DeleteProduct();
    @Given("you are on the Landing Page")
    public void you_are_on_the_landing_page() throws InterruptedException {
      //removeProduct.ClickAllProduct(driver);
      boolean flag =deleteProduct.verifyLogo(driver);
        Assert.assertTrue(flag);
    }
    @Then("Click on the Carte Icon button")
    public void click_on_the_carte_icon_button() {
        deleteProduct.ClickCarteIcon(driver);
    }
    @Then("Remove single product")
    public void remove_single_product() {
       deleteProduct.RemoveOneProduct(driver);
    }
}
