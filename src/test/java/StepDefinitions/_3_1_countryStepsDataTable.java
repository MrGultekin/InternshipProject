package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavigation;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class _3_1_countryStepsDataTable {

    LeftNavigation leftNavigation = new LeftNavigation();
    DialogContent dialogContent = new DialogContent();

    @When("^navigate to country page$")
    public void navigateToCountryPage() {
        leftNavigation.findElementAndClickFunction("setUpGeneral");
        leftNavigation.findElementAndClickFunction("parameterButton");
        leftNavigation.findElementAndClickFunction("countryButton");

    }

    @Then("^create a country$")
    public void createACountry(DataTable elements) {
        dialogContent.findElementAndClickFunction("addButton");
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {
            System.out.println(elementsNameAndValue.get(i).get(0)); // elemanın adı
            System.out.println(elementsNameAndValue.get(i).get(1)); // elemanın gönderilecek değeri
            dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }}