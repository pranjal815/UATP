Feature: Testing Happy Path testing for Demoblaze app
  Scenario: Validate User can signup with Demoblaze application
    Given I click on Signup on the page
    And I enter username
    And I enter password
    And I click Sign up button
    Then I should received a "Sign up successful." popup message

   Scenario: Validate User can place successful order with Demoblaze application
    Given I can login successfully into the application
    When I select the product from Product Store page
    And I click Add to cart button
    Then I should received Product added popup message
    When I click Cart button from the navbar menu
    And I click Place Order
    And I enter name as "Pranjal"
    And I enter country as "Mexico"
    And I enter city as "Huixquilucan"
    And I enter credit card as "4747474747474747"
    And I enter month as "1"
    And I enter year as "2023"
    And I click Purchase button
    Then I should see "Thank you for your purchase!" popup message
    When I click Ok button
    Then I should be redirected to Product Page