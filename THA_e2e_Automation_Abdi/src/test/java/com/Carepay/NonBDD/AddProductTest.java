package com.Carepay.NonBDD;

import com.Carepay.Base.BaseClass;
import com.Carepay.pageObject.AddProduct;
import com.Carepay.pageObject.DeleteProduct;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AddProductTest extends BaseClass {
 AddProduct product = new AddProduct();
 DeleteProduct deleteProduct = new DeleteProduct();
    @BeforeSuite
    public void StartBrowser(){
        openBrowser();
        SetUp();
    }

     @Test(priority = 0)
    public void  ClickAllProduct() throws InterruptedException {
        product.ClickAllProduct(driver);
    }
    @Test(priority = 1)
    public void FilterElectronicProduct(){
        product.ClickElectronic(driver);

    }
    @Test(priority = 2)
    public void AddElectronicProductToCarte(){
        product.AddToCarteSearchItem(driver);
    }

    @Test(priority = 3)
public void ClickAllProductForClearing() throws InterruptedException {
    product.ClickAllProduct(driver);
}

    @Test(priority = 4)
    public void ClickSearchInput(){
        product.ClickSearchBox(driver);
    }
    @Test(priority = 5)
    public void ClearSearch(){
        product.ClearSearch(driver);
    }
    @Test(priority = 6)
    public void SearchAndAddToCarteMultipleProduct() throws InterruptedException {
        product.SearchProduct(driver,"Mens Cotton");

    }

    @Test(priority = 7)
    public void AddSearchedProductToCarte(){
        product.AddToCarteSearchItem(driver);
    }

    @Test(priority = 8)
public void clickCarteIcon(){
        deleteProduct.ClickCarteIcon(driver);
}

@Test(priority = 9)
public void RemoveSingleProduct(){
        deleteProduct.RemoveOneProduct(driver);
}

@Test(priority = 10)
public void RemoveAllProduct(){
        deleteProduct.RemoveAllProduct(driver);
}



}
