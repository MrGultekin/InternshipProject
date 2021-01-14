Feature: Salary Modifier and Constants Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  Scenario: create a salary modifier and Constants and delete them

    Then Navigate to HumenResorces setup page
    And Navigate to salary Modifier page
    Then User wants to add Salary Modifier
    And success message should  be displayed
    And Navigate to HumenResorces setup page
    And Navigate to salary Modifier page
    Then User want to edit Salary Modifier
    And success message should  be displayed
    And Navigate to HumenResorces setup page
    And Navigate to salary Modifier page
    Then  User want to delete Salary Modifier
    And success message should  be displayed

    Scenario: create a salary constant then edit and delete them

    Then Navigate to HumenResorces setup page
    Then Navigate to salary Constant page
    And User wants to add Salary Constant
    And success message should  be displayed
    Then user want to edit Salary Constant
    And success message should  be displayed
    Then user want to delete Salary Constant
    And success message should  be displayed


