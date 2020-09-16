Feature: Test a product navigation as a visitor

  As a visitor
  I want to navigate to the product list page
  So that I can view the product list

  Scenario: View product list using navigate to product

    Given I am a visitor
    When I navigate to product menu
    Then The view product list page will be displayed