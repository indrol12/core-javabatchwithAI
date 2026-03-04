Feature: Demoblaze add to cart

  Scenario: verify add to cart functionality of demoblaze
    Given demoblaze website should be launch
    When click on samsung phone
    And click on add to cart button
    And handle the alert message
    Then validate the outcome of demoblaze add to cart
