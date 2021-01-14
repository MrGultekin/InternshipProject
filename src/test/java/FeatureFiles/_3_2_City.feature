Feature: city functionality
  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button

  Scenario: create a city
    When navigate to city page
    Then create a city
    And success message should  be displayed
    Then delete a city
    And success message should  be displayed