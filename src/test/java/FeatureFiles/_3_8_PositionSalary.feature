Feature: Position Salary Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button

  Scenario: Position salary

    Then Navigate to HumenResorces setup page
    Then user navigate to go position salary page
    And user want to add position Salary name as "Mr.Gultekin"
    Then success message should  be displayed
    And user want to edit "Mr.Gultekin" data in the table
    And user click save Button
      | saveButton |

  Scenario: Delete of position Salary

    Then Navigate to HumenResorces setup page
    Then user navigate to go position salary page
    When user want to delete "Mr.Gultekin" data in the table



