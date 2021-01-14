package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavigation;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class _3_12_CostCentersSteps {

    _0_0_LoginSteps loginSteps = new _0_0_LoginSteps();
    LeftNavigation leftNavigation = new LeftNavigation();
    DialogContent dialogContent = new DialogContent();
    int indexEdit;
    DataTable test1;
    DataTable test2;

    String removeSubject;
    long startTime = System.currentTimeMillis();

    @When("^Navigate to Cost Centers$")
    public void navigateToCostCenters(DataTable elements) {
        test1 = elements;
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {
            leftNavigation.findElementAndClickFunction(elementsToClick.get(i));
        }
        System.out.println("****************navigateToCostCenters***********");
    }

    @Then("^create a Cost Center$")
    public void createACostCenter() {
        dialogContent.findElementAndClickFunction("addButton");
        dialogContent.findElementAndSendKeysFunction("nameInput","NewCostCenter");
        dialogContent.findElementAndSendKeysFunction("codeInput", "11111");
        dialogContent.findElementAndClickFunction("typeButton");
        dialogContent.findElementAndClickFunction("dropList", "Personal");
        dialogContent.findElementAndClickFunction("orderNu1");
        dialogContent.findElementAndClickFunction("expenseAccountClick");
        dialogContent.findElementAndClickFunction("expenseAccountList");
        dialogContent.findElementAndClickFunction("saveButton");
        dialogContent.waitUntilInvisible("msjContainer");


    }
    @Then("^Edit and Delete Cost Centers$")
    public void editAndDeleteCostCenters() {

        leftNavigation.findElementAndClickFunction("bugdgetProjects");
        leftNavigation.findElementAndClickFunction("costCenters");

        dialogContent.findElementAndEditFunction1("NewCostCenter");
        dialogContent.findElementAndSendKeysFunction("nameInput","NewCostCenter2");
        dialogContent.findElementAndClickFunction("saveButton");
        dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
        dialogContent.waitUntilInvisible("msjContainer");
        System.out.println("**************It has edited...****************");

        leftNavigation.findElementAndClickFunction("bugdgetProjects");
        leftNavigation.findElementAndClickFunction("costCenters");

        dialogContent.findElementAndDeleteFunction("NewCostCenter2");
        dialogContent.findElementAndClickFunction("yesBtn");
        dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
        dialogContent.waitUntilInvisible("msjContainer");
        System.out.println("**************It has deleted...****************");


    }

    @And("^Repeat all scenario cost centers$")
    public void repeatAllScenarioCostCenters(DataTable element) {
        List<String> test = element.asList(String.class);

        System.out.println("*************** Test-1 bitti... ********************");
        int numOfTest = Integer.parseInt(test.get(0));

        for (int i = 0; i < numOfTest - 1; i++) {
            loginSteps.navigate_to_basqar();
            loginSteps.enter_username_and_password_and_click_Login_button();

            navigateToCostCenters(test1);
            editAndDeleteCostCenters();
            System.out.println("***********  Test-" + (i + 2) + " bitti....   *****************");

        }
        System.out.println();
        System.out.println("====================================================================");
        System.out.println(" " + dialogContent.getBrowserName().toUpperCase() + " BROWSER");// browser adi veriliyor

        System.out.println(" ISTEGINIZ " + numOfTest + " TEST BASARIYLA TAMAMLANMISTIR... ");
        long stopTime = System.currentTimeMillis();
        double timeDuration = (double) ((stopTime - startTime) / 1000 + 10) / 60;
        System.out.printf(" Toplam " + numOfTest + " Test \"%-5.2f\" dakika sürecinde tamamlanmistir...  ", timeDuration);
        System.out.println("\n===================================================================");
    }


}
