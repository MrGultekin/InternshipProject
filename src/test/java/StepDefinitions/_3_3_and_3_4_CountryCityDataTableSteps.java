package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavigation;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.util.List;

public class _3_3_and_3_4_CountryCityDataTableSteps {
    LeftNavigation leftNavigation=new LeftNavigation();
    DialogContent dialogContent=new DialogContent();

    @And("^user navigate to the wanted page$")
    public void userNavigateToTheWantedPage(DataTable elements) {
        List<String> elementsToClick=elements.asList(String.class);
        for (String s : elementsToClick) {
            leftNavigation.findElementAndClickFunction(s);
        }
    }

    @Then("^user want to create a city with a country$")
    public void userWantToCreateACityWithACountry(DataTable elements) {
        List<String> elementsToClick=elements.asList(String.class);
        for (String s : elementsToClick) {
            dialogContent.findElementAndClickFunction(s);
        }
    }

    @And("^user send names to create$")
    public void userSendNamesToCreate(DataTable elements) {
        List<List<String>> elementsNameAndValue=elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size() ; i++) {
            dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0),elementsNameAndValue.get(i).get(1));

        }
    }

    @Then("^user click save Button$")
    public void userClickSaveButton(DataTable elements) {
        List<String> elementsToClick=elements.asList(String.class);
        for (String s : elementsToClick) {
            dialogContent.findElementAndClickFunction(s);
        }
    }

    @Then("^user select one country to create a city$")
    public void userSelectOneCountryToCreateACity(DataTable elements) {
        List<String> elementsToClick=elements.asList(String.class);
        for (String s : elementsToClick) {
            dialogContent.findElementAndClickFunction(s);
        }
    }

    @Then("^user search a country or city$")
    public void userSearchACountryOrCity(DataTable elements) {
        List<List<String>> elementsNameAndValue=elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size() ; i++) {
            dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0),elementsNameAndValue.get(i).get(1));

        }
    }

    @And("^user want to delete a country or city$")
    public void userWantToDeleteACountryOrCity(DataTable elements) {
        List<String> elementsToClick=elements.asList(String.class);
        for (String s : elementsToClick) {
            dialogContent.findElementAndClickFunction(s);
        }
    }

    @And("^user click delete button$")
    public void userClickDeleteButton(DataTable elements) {
        List<String> elementsToDelete=elements.asList(String.class);
        for (String s : elementsToDelete) {
            dialogContent.findElementAndDeleteFunction(s);
        }
    }

    @Then("^user select country name$")
    public void userSelectCountryName(DataTable elements) {
        List<String> elementsToSelect=elements.asList(String.class);
        for (String s : elementsToSelect) {
            dialogContent.findElementandSelectFunction(s);
        }
    }
}
