Feature: country functionality
  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


    Scenario: create a Subject Categories
      When navigate to Subject Categories
      Then create a Subject Categories
      And success message should  be displayed
      Then delete a Subject Categories
      And success message should  be displayed

