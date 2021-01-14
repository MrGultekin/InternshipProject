package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavigation;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _3_5_SubjectCategoriesSteps {
    DialogContent dialogcontent = new DialogContent();
    LeftNavigation leftNavigation1 = new LeftNavigation();


    @When("^navigate to Subject Categories$")
    public void navigateToSubjectCategories() {
        leftNavigation1.findElementAndClickFunction("educationButton");
        leftNavigation1.findElementAndClickFunction("setupButton");
        leftNavigation1.findElementAndClickFunction("subjectCatogeriesButton");

    }

    @Then("^create a Subject Categories$")
 public void createASubjectCategories() {
      dialogcontent.findElementAndClickFunction("addButton");

      dialogcontent.findElementAndSendKeysFunction("nameInput", "group8");

       dialogcontent.findElementAndSendKeysFunction("codeInput", "837583792");
       dialogcontent.findElementAndClickFunction("saveButton");
    }



    @Then("^delete a Subject Categories$")
    public void deleteASubjectCategories() {

        dialogcontent.findElementAndSendKeysFunction("nameInputforSearch", "group8");
        dialogcontent.findElementAndClickFunction("searchButton");
        dialogcontent.findElementAndClickFunction("deleteButton");
        dialogcontent.findElementAndClickFunction("yesButton");
    }


}



