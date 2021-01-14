Feature: country functionality
  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  Scenario: create a country
    When navigate to country page
    Then create a countryN
    And success message should  be displayed
    Then delete a country
    And success message should  be displayed

