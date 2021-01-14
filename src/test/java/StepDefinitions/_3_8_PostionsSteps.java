package StepDefinitions;

import Pages.LeftNavigation;
import Pages.PositonSalaryContent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class _3_8_PostionsSteps {

    LeftNavigation leftNavigationPositonSalary=new LeftNavigation();
    PositonSalaryContent positonSalary =new PositonSalaryContent();


    @Then("^user navigate to go positions page$")
    public void userNavigateToGoPositionsPage() {
        leftNavigationPositonSalary.findElementAndClickFunction("positionBtn");

    }


    @And("^user want to add positions name as \"([^\"]*)\" and short name as \"([^\"]*)\"\\.$")
    public void userWantToAddPositionsNameAsAndShortNameAs(String name, String shortName)  {

        positonSalary.findElementAndClickFunction("addPosSlryButton");
        positonSalary.findElementAndSendKeysFunction("PositionNameInput",name);
        positonSalary.findElementAndSendKeysFunction("PositionShotnameInput",shortName);

        positonSalary.findElementAndClickFunction("SalarySaveBtn");
    }
}
