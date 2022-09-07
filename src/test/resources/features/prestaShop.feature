Feature: PrestaShop

  Background:
    Given user is on "http://prestashop.qatestlab.com.ua/en/" page

  Scenario: User can login with valid credential
    And click on Sign In button
    And fill in the email "olgatester2020@gmail.com"
    And fill in the password "Qwerty12345"
    And click on Signin button
    Then My account page is opened
    And click on T-SHIRTS button
    And Product page is opened




