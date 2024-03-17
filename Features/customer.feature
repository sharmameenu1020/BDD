Feature: Customer


  Scenario: Add new Customer

    Given user Launch Chrome Browser
    When User opens url "https://admin-demo.nopcommerce.com/login"
    And  User enter Email as "admin@yourstore.com" and Password as "admin"
    And  Click on Login
    When User click on customer Menu
    And  click on customer Menu item
    And  click on Add new button
    Then User can view Add new customer page
    When user enter customer page
    And  click on save button
    And  close browser
