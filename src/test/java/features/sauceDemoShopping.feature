Feature: sauceDemo Shopping

  @shoppingDemo
  Scenario: Login with valid username and password
    Given I am at saucedemo homepage
    And I enter valid username
    And I enter valid password
    When I click on Login button
    Then I should be able to login successfully
    And I sort the items lowest price sort
    When I added two items to the shopping cart
    Then I visit the shopping cart
    And I assert that the items that I added are in the cart
    Then I remove an item and then continue shopping
    And I add another item
    Then I do checkout
    And I assert that I am purchasing the correct items
    And I assert the total price
    When I click on finish button
    Then I finish checkout



