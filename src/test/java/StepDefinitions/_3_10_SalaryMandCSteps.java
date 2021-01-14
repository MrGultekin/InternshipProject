package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavigation;
import Pages.SalaryContent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class _3_10_SalaryMandCSteps {
    LeftNavigation leftNavigation =new LeftNavigation();
    SalaryContent salaryContent=new SalaryContent();
    DialogContent dialogContent=new DialogContent();

    @Then("^Navigate to HumenResorces setup page$")
    public void navigateToHumenResorcesSetupPage() {
        leftNavigation.findElementAndClickFunction("HumanResButton");
        leftNavigation.findElementAndClickFunction("setUpHR");
    }

    @And("^Navigate to salary Modifier page$")
    public void navigateToSalaryModifierPage() {
        leftNavigation.findElementAndClickFunction("SalaryModButton");
    }

    @Then("^User wants to add Salary Modifier$")
    public void userWantsToAddSalaryModifier() {
        String priorityLevel=salaryContent.decidePriorityLevel();
        salaryContent.findElementAndClickFunction("addSalModButton");
        salaryContent.findElementAndClickFunction("newModButton");
        salaryContent.findElementAndSendKeysFunction("describtionInput","New_Salary_Modifier");
        salaryContent.findElementAndSendKeysFunction("variableInput","New_Variable");
        salaryContent.findElementAndClickFunction("modifierTypeSelect");
        salaryContent.findElementAndClickFunction("modifierTypeList");
        salaryContent.findElementAndSendKeysFunction("priorityInput",priorityLevel);
        salaryContent.findElementAndSendKeysFunction("amountInput","10000");
        salaryContent.findElementAndClickFunction("saveButtoninMod");


    }

    @Then("^User want to edit Salary Modifier$")
    public void userWantToEditSalaryModifier() {
        salaryContent.findElementAndSendKeysFunction("descriptionInput","New_Salary_Modifier");
        salaryContent.findElementAndClickFunction("searchInMod");
        salaryContent.findElementAndEditFunction("New_Salary_Modifier");
        salaryContent.findElementAndSendKeysFunction("descriptionInput","New_Salary_Modifier2");
        salaryContent.findElementAndClickFunction("saveButtoninMod");
    }

    @Then("^User want to delete Salary Modifier$")
    public void userWantToDeleteSalaryModifier() {
        salaryContent.findElementAndSendKeysFunction("descriptionInput","New_Salary_Modifier2");
        salaryContent.findElementAndClickFunction("searchInMod");
        salaryContent.findElementAndDeleteFunction("New_Salary_Modifier2");
        salaryContent.findElementAndClickFunction("yesBtninSM");
       // salaryContent.findElementAndClickFunction("deleteBtninSM");



    }

    @Then("^Navigate to salary Constant page$")
    public void navigateToSalaryConstantPage() {
        leftNavigation.findElementAndClickFunction("salaryConstButton");
    }

    @And("^User wants to add Salary Constant$")
    public void userWantsToAddSalaryConstant() {
        salaryContent.findElementAndClickFunction("addSalConsButton");
        salaryContent.findElementAndSendKeysFunction("salconstnameInput","New_Salary_Constant1");

        salaryContent.findElementAndSendKeysFunction("keyInput","a1111");
        salaryContent.findElementAndSendKeysFunction("valueInput","10000");
        salaryContent.findElementAndClickFunction("valFromInput");
        salaryContent.findElementAndClickFunction("today");
        salaryContent.findElementAndClickFunction("saveButtoninMod");

    }

    @Then("^user want to edit Salary Constant$")
    public void userWantToEditSalaryConstant() {
        salaryContent.findElementAndSendKeysFunction("nameInputinSalary", "New_Salary_Constant1");
        salaryContent.findElementAndClickFunction("searchInMod");
        salaryContent.findElementAndEditFunction("New_Salary_Constant1");
        salaryContent.findElementAndSendKeysFunction("salconstnameInput","New_Salary_Constant2");
        salaryContent.findElementAndClickFunction("saveButtoninMod");
    }

    @Then("^user want to delete Salary Constant$")
    public void userWantToDeleteSalaryConstant() {
        salaryContent.findElementAndSendKeysFunction("nameInputinSalary", "New_Salary_Constant2");
        salaryContent.findElementAndClickFunction("searchInMod");
        salaryContent.findElementAndDeleteFunction("New_Salary_Constant2");
        salaryContent.findElementAndClickFunction("yesBtninSM");

    }
}
