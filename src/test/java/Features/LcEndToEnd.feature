@UserEndToEnd
Feature: A Registered User does logins, add Bluz product to basket and checks product details

  @SuccessfulCase
  Scenario Outline: User logins website and clicks login button
    When  User skips home page ad
    When  User clicks Giris Yap button on Layout Section
    And   User enters "<loginEmail>" email
    And   User enters "<loginPassword>" password
    And   User clicks Giris Yap button
    And   User clicks Categories button on Layout Section
    And   User clicks Giyim section
    And   User clicks Bluz product
    Then  User should see product list visible
    When  User clicks Filtre button
    And   User clicks Renk button
    And   User writes "<colorBlack>" color to search input
    And   User clicks filtered color
    And   User clicks Uygula button
    When  User clicks Sonuclari Listele button
    When  User clicks listed product
    And   User clicks product details overlay
    When  User clicks medium size of product
    When  User clicks Sepete Ekle button
    When  User clicks close product page button
    When  User clicks Sepetim on Layout Section
    Then  User should see product image
    Then  User should see product title
    Then  User should see "<mediumSizeTxt>" product size
    Then  User should see product color
    Then  User should see product quantity
    When  User clicks Odeme Adimina Gec button
    Then  User should see "<deliveryMethod>" Teslimat yontemi text
    Then  User should see Siparis Ozeti container

    Examples:
      |loginEmail|loginPassword|colorBlack|mediumSizeTxt|deliveryMethod|
      |ikincimail61@gmail.com   |yd998snn13             |siyah|M|1. Teslimat yönteminizi seçiniz.|
