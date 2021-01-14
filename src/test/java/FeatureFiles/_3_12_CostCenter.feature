Feature: Cost Center Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button

  @SmokeTest

  Scenario:  Edit and delete a Cost Center

    When Navigate to Cost Centers
      | budget      |
      | budgetSetup |
      | costCenters |

    And create a Cost Center


    Then Edit and Delete Cost Centers


    And Repeat all scenario cost centers
      | 1      |
