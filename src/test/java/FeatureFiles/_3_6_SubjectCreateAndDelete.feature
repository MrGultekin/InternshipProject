Feature: subject create functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    When Navigate to Education Page
      | educationButton |
      | setUpEducation  |
      | subjectsButton  |

  Scenario: Create a Subject
    And click on the element in the Subject Class
      | addSubjectButton |
    Then User sending the keys to create a subject
      | nameInput | Hallo|
      | codeInput | Subject |
    And  click on the element in the Subject Class
      | addSubjectCategoryButton |
    Then User sending the keys to create a subject
      | subjectCategorynameInput | selam|
      | subjectCategorycodeInput | kelam|
    And  click on the element in the Subject Class
     | subjectCategorysaveButton     |
      | SubjectCategoryDropDownButton |
    And  click on the wanted element in the Subject Class
  |SubjectCategoryList  |selam|
    And  click on the element in the Subject Class
      | saveButton  |
  Scenario: Delete a Subject
    When User sending the keys to search
      | SearchNameInput | Hallo|
    And  click on the element in the Subject Class
      | SearchGeneral |
      | deleteButton |
      | yesButton      |
    And success or error message should  be displayed
      |  msjContainer| success |
