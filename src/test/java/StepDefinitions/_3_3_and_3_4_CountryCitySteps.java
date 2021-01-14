package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavigation;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class _3_3_and_3_4_CountryCitySteps {
    LeftNavigation leftNavigation=new LeftNavigation();
    DialogContent dialogContent=new DialogContent();

    @And("^navigate to parameter page$")
    public void navigateToParameterPage() {
        leftNavigation.findElementAndClickFunction("setUpGeneral");
        leftNavigation.findElementAndClickFunction("parameterButton");
    }

    @Then("^navigate to cities page$")
    public void navigateToCitiesPage() {


        leftNavigation.findElementAndClickFunction("citiesButton");
           }


    @Then("^create a city with a country$")
    public void createACityWithACountry()  {

        dialogContent.findElementAndClickFunction("addCityButton");
        dialogContent.findElementAndClickFunction("addCountryinCityBtn");
        dialogContent.findElementAndSendKeysFunction("nameInputinCity","Denemeulkesi");
        dialogContent.findElementAndSendKeysFunction("codeInput","111111");
        dialogContent.findElementAndClickFunction("saveBtnCountryinCity");
        dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
        dialogContent.findElementAndClickFunction("countryiesBtn");
        dialogContent.findElementandSelectFunction("Denemeulkesi");
        dialogContent.findElementAndSendKeysFunction("nameInput", "DenemeSehri");
        dialogContent.findElementAndClickFunction("saveButton");
        dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
    }

    @Then("^navigate to country page and delete a country$")
    public void navigateToCountryPageAndDeleteACountry() {
        leftNavigation.findElementAndClickFunction("countryButton");
     //   dialogContent.findElementAndClickFunction("pageSelectBtn");
     //   dialogContent.findElementAndClickFunction("maxElementBtn");
        dialogContent.findElementAndSendKeysFunction("nameInputforSearch","Denemeulkesi");
        dialogContent.findElementAndClickFunction("searchBtn");

        dialogContent.findElementAndDeleteFunction("Denemeulkesi");
       // dialogContent.findElementAndClickFunction("deleteBtn");
        dialogContent.findElementAndClickFunction("yesBtn");


    }

    @And("^error message should  be displayed$")
    public void errorMessageShouldBeDisplayed() {
        dialogContent.findElementAndVerifyContainsText("msjContainer","Error");

    }

    @And("^delete a cityN$")
    public void deleteACity() {
        dialogContent.findElementAndSendKeysFunction("nameInputforSearch","DenemeSehri");
        dialogContent.findElementAndClickFunction("searchBtn");
        dialogContent.findElementAndClickFunction("deleteBtn");
        dialogContent.findElementAndClickFunction("yesBtn");
         }


}
