Feature: Test a product navigation as a visitor

  As a visitor
  I want to navigate to to the product
  So that I can view the item

  Scenario: View Product list using navigate to product

    Given I am a visitor
    When I navigate to product menu
    Then The View product list page will be displayed