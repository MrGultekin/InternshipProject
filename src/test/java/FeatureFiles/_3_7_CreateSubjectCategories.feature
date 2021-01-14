Feature: SubjectCategories Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button

  @RegressionTest
  Scenario Outline:  Create a SubjectCategories

    When Navigate to SubjectCategories
      | education        |
      | eduSetup         |
      | eduSubCategories |

    Then Create SubjectCategories if it doesnt

    When Navigate to Subjects

    Then Create Subjects if it doesnt
     | subsDEN |  codesden|

    Then Remove SubjectCategory "<remove>"

    And Repeat all scenario times
      | 1      |
    Examples:
      | remove       |
      | Chemistry4 |


