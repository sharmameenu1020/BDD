Feature: LOGIN


  Scenario : Verify User is able to login with correct credentials
    Given user Launch Chrome Browser
    When User opens url "https://admin-demo.nopcommerce.com/login"
    And  User enter Email as "admin@yourstore.com" and Password as "admin1"
    And  Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on the log out link
    And  Close the Browser

