package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavigation;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class _3_9_ExcelTemplateSteps {

    LeftNavigation leftNavigation = new LeftNavigation();
    DialogContent dialogContent = new DialogContent();

    @When("^Navigate to Reports Page$")
    public void navigateToReportsPage(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            System.out.println(elementsToClick.get(i));
            leftNavigation.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @And("^click on the element$")
    public void clickOnTheElement(DataTable elements) {
//        dialogContent.findElementAndClickFunction("searchButton");
//        dialogContent.findElementAndClickFunction("deleteButton");
//        dialogContent.findElementAndClickFunction("yesButton");
        List<String> elementsToclick = elements.asList(String.class);
        for (int i = 0; i < elementsToclick.size(); i++)
        {
            dialogContent.waiting(200);
            dialogContent.findElementAndClickFunction(elementsToclick.get(i));
        }
    }

    @Then("^User sending the keys to create$")
    public void userSendingTheKeysToCreate(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);
        for (int i = 0; i < elementsNameAndValue.size(); i++) {
            dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }


    }

//    @Then("^User sending the keys to create a new  Excel Template$")
//    public void userSendingTheKeysToCreateANewExcelTemplate(DataTable elements) {
////        dialogContent.clickAndClearFunction("columnSizeInput");
////        dialogContent.clickAndClearFunction("rowSizeInput");
////        dialogContent.findElementAndSendKeysFunction("columnSizeInput","2");
////        dialogContent.findElementAndSendKeysFunction("rowSizeInput","2");
//        List<List<String>>elemntsNameandValue=elements.asLists(String.class);
//        for (int i = 0; i <elemntsNameandValue.size() ; i++) {
//            dialogContent.findElementAndSendKeysFunction(elemntsNameandValue.get(i).get(0), elemntsNameandValue.get(i).get(1));
//        }
//    }
//}
