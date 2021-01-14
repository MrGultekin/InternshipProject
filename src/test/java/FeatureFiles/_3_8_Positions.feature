Feature: Position Salary Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button

  Scenario: Position salary

    Then Navigate to HumenResorces setup page
    Then user navigate to go positions page
    And user want to add positions name as "Assistant" and short name as "Asst".
    Then success message should  be displayed


    And user want to edit "Assistant" data in the table


    And user click save Button
      | saveButton |

    Scenario: Delete of positions

    Then Navigate to HumenResorces setup page
    Then user navigate to go positions page
      And user want to delete "Assistant" data in the table







