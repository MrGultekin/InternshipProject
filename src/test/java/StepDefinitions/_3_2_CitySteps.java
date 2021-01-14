package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavigation;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _3_2_CitySteps {
    LeftNavigation leftNavigation=new LeftNavigation();
    DialogContent dialogContent= new DialogContent();

    @When("^navigate to city page$")
    public void navigateToCityPage() {
        leftNavigation.findElementAndClickFunction("setUpGeneral");
        leftNavigation.findElementAndClickFunction("parameterButton");
        leftNavigation.findElementAndClickFunction("citiesButton");
    }

    @Then("^create a city$")
    public void createACity() {
        dialogContent.findElementAndClickFunction("addButton");
        dialogContent.findElementAndClickFunction("countryClick");
        dialogContent.findElementAndClickFunction("landWahl");
        dialogContent.findElementAndSendKeysFunction("cityNameInput", "Bischkek");
        dialogContent.findElementAndClickFunction("saveButton");
    }

    @Then("^delete a city$")
    public void deleteACity() {
        dialogContent.findElementAndSendKeysFunction("citySearchInput", "Bischkek");
        dialogContent.findElementAndClickFunction("searchButton");
        dialogContent.findElementAndClickFunction("deleteButton");
        dialogContent.findElementAndClickFunction("yesButton");

    }
}
