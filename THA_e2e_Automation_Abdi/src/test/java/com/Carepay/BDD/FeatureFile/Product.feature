Feature: Product Catalogue
      @Filter @filterSearch @Smoke
  Scenario: Filter Product
    Given You are on catalogue page
    And Filter product by clicking all product Menu
    And Click Electronic Menu
    Then Click Add product to carte

          @SearchProduct @filterSearch @Smoke
    Scenario: Search Product on The product catalogue
      Given You are on the catalogue product Page
      And Click all product Icon
      And click on Search Input
      And Clear on the Search input
      And Search product by typing <ProductName>
      Then Click Add searched product to Carte


            @RemoveSingleProduct @Smoke
  Scenario: Remove Single Product on the Carte
    Given you are on the Landing Page
    And Click on the Carte Icon button
    Then Remove single product

              @RemoveAllProduct @Smoke
  Scenario: Remove Multiple product on the catalogue
    Given you are on the product catalogue page
    And Click on the Carte Icon
    Then click on Empty carte button




