Feature: Excel Template create edit delete functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    When Navigate to Reports Page
      | reportsButton |
      | setUpReports  |
      | excelTemplateButton  |
  Scenario: Create a Excel Template
    And click on the element
      | addExcelTemplateButton |
    Then User sending the keys to create
      | nameInput |Hallo|
    | periodCountInput | Excel |
    And click on the element
      | saveButton |
   Then User sending the keys to create
      | columnSizeInput | 50 |
      | rowSizeInput | 10|
    And click on the element
      | addVersionButton |
      | saveButton |
      | CloseButton |
    And success or error message should  be displayed
  |  msjContainer| success |

  Scenario:Edit a Excel Template
    When User sending the keys to search
      | SearchNameInput |Hallo|
    And  click on the element in the Subject Class
      | SearchGeneral |
      | editButton |
    Then User sending the keys to create
      | nameInput |Merhaba|
      | periodCountInput |  207 |
    And  click on the element in the Subject Class
      | saveButton  |
     | CloseButton |
    And success or error message should  be displayed
      |  msjContainer| success |

  Scenario: Delete a Excel Template
    When User sending the keys to search
      | SearchNameInput | Merhaba|
    And click on the element
      | SearchGeneral |
      | deleteButton |
      | yesButton      |
    And success or error message should  be displayed
      |  msjContainer| delete |