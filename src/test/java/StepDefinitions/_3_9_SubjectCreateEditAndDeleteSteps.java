package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavigation;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class _3_9_SubjectCreateEditAndDeleteSteps {
    LeftNavigation leftNavigation=new LeftNavigation();
    DialogContent dialogContent=new DialogContent();

    @When("^Navigate to Education Page$")
    public void navigateToEducationPage(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);
        for(int i=0;i<elementsToClick.size();i++) {
            System.out.println(   elementsToClick.get(i)   );
            leftNavigation.findElementAndClickFunction(elementsToClick.get(i));
        }
    }
@And("^click on the element in the Subject Class$")
public void clickOnTheElementInTheSubjectClass(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);
        for(int i=0;i<elementsToClick.size();i++)
        {
           dialogContent.waiting(200);
            dialogContent.findElementAndClickFunction(elementsToClick.get(i));
        }
}
    @Then("^User sending the keys to create a subject$")
    public void createASubject(DataTable elements) {
            List< List<String> >  elementsNameAndValue = elements.asLists(String.class);
            for(int i=0;i<elementsNameAndValue.size();i++) {
                dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
            }
        }

    @And("^click on the wanted element in the Subject Class$")
    public void clickOnTheWantedElementInTheSubjectClass(DataTable elements) {

        List< List<String> > listNameAndElement = elements.asLists(String.class);

        for(int i=0;i<listNameAndElement.size();i++) {
            dialogContent.findElementAndClickFunction(listNameAndElement.get(i).get(0), listNameAndElement.get(i).get(1));
        }}

    @Then("^success or error message should  be displayed$")
    public void successOrErrorMessageShouldBeDisplayed(DataTable elements) {
        List< List<String> > listNameAndElement = elements.asLists(String.class);
        for(int i=0;i<listNameAndElement.size();i++) {
            dialogContent.findElementAndVerifyContainsText(listNameAndElement.get(i).get(0), listNameAndElement.get(i).get(1));
        }}
    @Then("^User sending the keys to search$")
    public void userSendingTheKeysToSearch(DataTable elements) {
        List< List<String> >  elementsNameAndValue = elements.asLists(String.class);
        for(int i=0;i<elementsNameAndValue.size();i++) {
            dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0),elementsNameAndValue.get(i).get(1));
        }
    }

    @And("^click to editOrDelete Subject$")
    public void clickToEditOrDeleteSubject() throws InterruptedException {

//        List<String> elementstoclick = elements.asList(String.class);
//        System.out.println("geldii");
//        for (int i = 0; i < elementstoclick.size(); i++) {
//            dialogContent.findElementAndClickFunction(elementstoclick.get(i));

        dialogContent.findElementAndClickFunction("SearchGeneral");
        Thread.sleep(1000);
        dialogContent.findElementAndClickFunction("deleteButton");
        dialogContent.findElementAndClickFunction("yesButton");

        }

    }













