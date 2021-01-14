Feature: country functionality
  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    When navigate to country page

  Scenario: create a country
    Then create a country
      | nameInput | selmm|
      | codeInput | bismi |
    And  click on the element
      | saveButton  |
    And success or error message should  be displayed
      |  msjContainer| success |

  Scenario: Delete the created a country
    When User sending the keys to create
      | nameInputforSearch |  selmm|
    And  click on the element
      | SearchGeneral |
      | deleteButton |
      | yesButton    |
    And success or error message should  be displayed
      |  msjContainer| success |



