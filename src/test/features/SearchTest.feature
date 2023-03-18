Feature: Search feature test

  As a user
  I can able to search product and view list of products

  @Search
  Scenario:Verify products are listed according to the search criteria

    Given I am on home page "https://www.amazon.co.uk/" with title ".co.uk"
    When I enter "Kids dress"
    And I click search
    Then I get redirected to products page with title "Kids dress"
