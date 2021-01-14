package StepDefinitions;

import Pages.LeftNavigation;

import Pages.PositonSalaryContent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _3_8_PositionSalarySteps {
    LeftNavigation leftNavigationPositonSalary=new LeftNavigation();
    PositonSalaryContent positonSalary=new PositonSalaryContent();

    @Then("^user navigate to go position salary page$")
    public void userNavigateToGoPositionSalaryPage() {
        leftNavigationPositonSalary.findElementAndClickFunction("posSalryBtn");

    }

//    @And("^user want to add position Salary$")
//    public void userWantToAddPositionSalary() {
//        positonSalary.findElementAndClickFunction("addPosSlryButton");
//        positonSalary.findElementAndSendKeysFunction("SalarynameInput","Mr.Gultekin");
//        positonSalary.findElementAndClickFunction("SalarySaveBtn");
//
//    }


    @And("^user want to add position Salary name as \"([^\"]*)\"$")
    public void userWantToAddPositionSalary(String postionSalary) {
        positonSalary.findElementAndClickFunction("addPosSlryButton");
        positonSalary.findElementAndSendKeysFunction("SalarynameInput",postionSalary);
        positonSalary.findElementAndClickFunction("SalarySaveBtn");

    }



    @And("^user want to edit \"([^\"]*)\" data in the table$")
    public void userEditsJustCreatedExistingPosition1(String postionSalary) {

        positonSalary.findElementAndEditFunction(postionSalary);
    }

//    @And("^user edits just created existing position$")
//    public void userEditsJustCreatedExistingPosition() {
//
//
//         positonSalary.findElementAndClickFunction("SalaryEditBtn");
//    }


    @When("^user want to delete \"([^\"]*)\" data in the table$")
    public void userWantToDeletePositionSalaryNameAs(String positionSalary) {

        positonSalary.findElementAndDeleteFunction(positionSalary);
        positonSalary.findElementAndClickFunction("yesBtninSM");
    }

    @When("^Navigate to DashBoard$")
    public void navigateToDashBoard() {
        positonSalary.findElementAndClickFunction("DashboardBtn");

    }
}
