Feature: PrestaShop
  Scenario: User can login with valid credentials
    When user is on "http://prestashop.qatestlab.com.ua/en/"
    And click on Sign In button
    And fill in the register form and click on Signin button
    Then My account page is opened