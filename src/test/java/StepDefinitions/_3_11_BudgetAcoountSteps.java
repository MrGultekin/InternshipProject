package StepDefinitions;

import Pages.DialogContent;

import Pages.LeftNavigation;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _3_11_BudgetAcoountSteps {
    LeftNavigation leftnavigationBudget=new LeftNavigation();
    DialogContent dialogContent=new DialogContent();
    @When("^navigate to Budget Account$")
    public void navigateToBudgetAccount() {
        leftnavigationBudget.findElementAndClickFunction("budgetButton");
        leftnavigationBudget.findElementAndClickFunction("budgetAccountsButton");

    }

    @Then("^create a Budget Account Categories$")
    public void createABudgetAccountCategories() {
        dialogContent.findElementAndClickFunction("addbudgetbutton");

       dialogContent.findElementAndSendKeysFunction("nameInput","nn4");
        dialogContent.findElementAndClickFunction("typeButton");
       dialogContent.findElementAndClickFunction("groupButton");
       dialogContent.findElementAndClickFunction("balanceTypeButton");
        dialogContent.findElementAndClickFunction("debitButton");
        dialogContent.findElementAndSendKeysFunction("codeInput","94");
        dialogContent.findElementAndClickFunction("saveButton");
    }

  // @And("^success  message should  be displayed$")
  //public void successMessageShouldBeDisplayed() {
    //dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");

  // }

    @Then("^edit a Budget Account$")
    public void editABudgetAccount()  {
        /*leftnavigationBudget.findElementAndClickFunction("budgetButton");
        leftnavigationBudget.findElementAndClickFunction("budgetAccountsButton");
        leftnavigationBudget.findElementAndClickFunction("budgetButton");
        leftnavigationBudget.findElementAndClickFunction("budgetAccountsButton");*/
        dialogContent.findElementAndClickFunction("typeButton");
        dialogContent.findElementAndClickFunction("groupButton");
        dialogContent.findElementAndSendKeysFunction("nameInputForSearch","nn4");
        dialogContent.findElementAndClickFunction("searchButton");
        dialogContent.findElementAndClickFunction("editButton");
        dialogContent.findElementAndSendKeysFunction("nameInput","nn4");
        dialogContent.findElementAndClickFunction("saveButton");


    }

    @Then("^delete a Budget Account$")
    public void deleteABudgetAccount() {
        /*dialogContent.findElementAndClickFunction("typeButton");
        dialogContent.findElementAndClickFunction("groupButton");*/
        dialogContent.findElementAndSendKeysFunction("nameInputForSearch","nn4");
        dialogContent.findElementAndClickFunction("deleteButton");
        dialogContent.findElementAndClickFunction("yesButton");
    }

    @And("^success    message should  be displayed$")
    public void successMessageShouldBeDisplayed1() {
        dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
    }


}
