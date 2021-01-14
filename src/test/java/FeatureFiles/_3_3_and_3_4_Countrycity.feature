Feature: Countrycity together Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  Scenario: create a country for a city and delete a country and city


    And navigate to parameter page
    Then navigate to cities page
    Then create a city with a country
    And success message should  be displayed
    Then navigate to country page and delete a country
    And error message should  be displayed
    Then navigate to cities page
    And delete a cityN
    Then success message should  be displayed
    Then navigate to country page and delete a country
    Then success message should  be displayed


