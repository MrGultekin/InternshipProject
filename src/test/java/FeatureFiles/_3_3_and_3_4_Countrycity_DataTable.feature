Feature: Countrycity DataTable together Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  Scenario: create a country for a city and delete a country and city


    And user navigate to the wanted page
    |setUpGeneral|
    |parameterButton|
    |citiesButton   |
    Then user want to create a city with a country
    |addCityButton|
    |addCountryinCityBtn|
    And user send names to create
    |nameInputinCity|Denemeulkesi|
    |codeInput      |111111      |
    Then user click save Button
    |saveBtnCountryinCity|
    And success message should  be displayed

    Then user select one country to create a city
    |countryiesBtn|
    Then user select country name
    |Denemeulkesi|
    And user send names to create
    |nameInput|DenemeSehri|
    Then user click save Button
    |saveButton|
    And success message should  be displayed
    And user navigate to the wanted page
    |countryButton|
    Then user search a country or city
    |nameInputforSearch|Denemeulkesi|
    And user want to delete a country or city
    |searchBtn|
    And user click delete button
    |Denemeulkesi|
    And user want to delete a country or city
    |yesBtn      |
     And error message should  be displayed
    Then user navigate to the wanted page
    |citiesButton|
    Then user search a country or city
    |nameInputforSearch|DenemeSehri|
    And user want to delete a country or city
    |searchBtn|
    |deleteBtn|
    |yesBtn   |
    Then success message should  be displayed
    And user navigate to the wanted page
      |countryButton|
    Then user search a country or city
      |nameInputforSearch|Denemeulkesi|
    And user want to delete a country or city
      |searchBtn|
    And user click delete button
      |Denemeulkesi|
    And user want to delete a country or city
      |yesBtn      |
    Then success message should  be displayed
