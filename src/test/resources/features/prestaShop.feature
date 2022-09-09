Feature: PrestaShop

  Background:
    Given user is on "http://prestashop.qatestlab.com.ua/en/" page
    And the browser is maximized

  Scenario: User can login with valid credential
    And click on Sign In button
    And fill in the email "olgatester2020@gmail.com"
    And fill in the password "Qwerty12345"
    And click on Signin button
    Then My account page is opened
    And click on Women button
    And Product page is opened
    Then user click on checkbox suits
    And product suite appears on the Product page
    Then user click on Add To Cart button
    And click on Cart field
    And check that the product added to cart
    Then user change quantity of product to "2"
    And check that quantity of product equals "2"
    Then user click on Proceed to checkout button
    And Checkout Page is opened
    Then user fill in LastName "Strukova"
    And fill in Address "My Home"
    And fill in Zip code "12345"
    And fill in City "Minsk"
    And fill in HomePhone "123456789"
    And selects the value of State dropdown Oklahoma
    And fill in Please assign an address title for future reference "zzz"
    And click on Save button
    Then user can see error message "There is 1 error, firstname is required."
    Then user fill in FirstName "Olga"
    Then user fill in LastName "Strukova"
    And fill in Address "My Home"
    And fill in Zip code "12345"
    And fill in City "Minsk"
    And fill in HomePhone "123456789"
    And selects the value of State dropdown Oklahoma
    And fill in Please assign an address title for future reference "zzz"
    And click on Save button
    And MyAddresses is opened






