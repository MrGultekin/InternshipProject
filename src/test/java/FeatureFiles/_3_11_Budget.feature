Feature: Budget Account functionality
  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button



  Scenario: create a Budget Accounts Categories
    When navigate to Budget Account
    Then create a Budget Account Categories
    When navigate to Budget Account
    Then edit a Budget Account
    When navigate to Budget Account
    Then delete a Budget Account
    And success    message should  be displayed