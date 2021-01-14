package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavigation;
import Utilities.ExcelUtility;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _3_7_SubjectCategoriesSteps {

    _0_0_LoginSteps loginSteps = new _0_0_LoginSteps();
    LeftNavigation leftNavigation = new LeftNavigation();
    DialogContent dialogContent = new DialogContent();

    DataTable test1;
    DataTable test2;

    String removeSubject;
    long startTime = System.currentTimeMillis();


    @When("^Navigate to SubjectCategories$")
    public void navigateToSubjectCategories(DataTable elements) {
        test1 = elements;
        List<String> elementsToClick = elements.asList(String.class);
        for (int i = 0; i < elementsToClick.size(); i++) {
            leftNavigation.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @Then("^Create SubjectCategories if it doesnt$")
    public void subjectCategoriesCreateIfItDoesnt() {

        HashMap<Integer, ArrayList<String>> list =
                ExcelUtility.getListData("src/main/resources/ApacheExcel1.xlsx", "testCitizen", 2);
        removeSubject = list.get(0).get(0);


        for (Integer i : list.keySet()) {

            if (dialogContent.searchElement(list.get(i).get(0)) == -1) {
                dialogContent.findElementAndClickFunction("addButton");
                dialogContent.findElementAndSendKeysFunction("nameInput", list.get(i).get(0));
                removeSubject = list.get(i).get(0);
                dialogContent.findElementAndSendKeysFunction("codeInput", list.get(i).get(1));
                dialogContent.findElementAndClickFunction("saveButton");
                dialogContent.waitUntilInvisible("msjContainer");
                System.out.println("It has added...");
            }
        }
        System.out.println("adim 1....");
    }

    @And("^Navigate to Subjects$")
    public void navigateToSubjects() {
        leftNavigation.findElementAndClickFunction("subject");

    }

        @Then("^Create Subjects if it doesnt$")
        public void createSubjectsIfItDoesnt(DataTable elements) {
            test2 = elements;
           try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<List<String>> listDeleteSubject = elements.asLists(String.class);

        for (int i = 0; i < listDeleteSubject.size(); i++) {


            if (dialogContent.searchElement(listDeleteSubject.get(i).get(0)) == -1) {
                dialogContent.findElementAndClickFunction("addButton");
                dialogContent.findElementAndSendKeysFunction("nameInput", listDeleteSubject.get(i).get(0));
                dialogContent.findElementAndSendKeysFunction("codeInput", listDeleteSubject.get(i).get(1));
                dialogContent.findElementAndClickFunction("scClick");
                dialogContent.findElementAndClickFunction("dropList", removeSubject);//scOptionList
                dialogContent.findElementAndClickFunction("subjectStyle");
                dialogContent.findElementAndClickFunction("dropList", "subsDEN");//subjectStyleOption
                dialogContent.findElementAndClickFunction("saveButton");
                dialogContent.waitUntilInvisible("msjContainer");
                System.out.println("It has added...");
            }
        }
        System.out.println("adim 2....");

        //leftNavigation.findElementAndClickFunction("eduSetup");
        leftNavigation.findElementAndClickFunction("eduSubCategories");
        System.out.println("adim 3e geciyor...");
    }

    @Then("^Remove SubjectCategory \"([^\"]*)\"$")
    public void removeSubjectCategory(String remove) {
        //remove=removeSubject;
        if (dialogContent.searchElement(remove) != -1) {
            dialogContent.deleteElement("deleteList2",remove);
            dialogContent.findElementAndClickFunction("yesButton");
        }
        System.out.println("adim 3....");

    }

    @And("^Not removing should be displayed$")
    public void notRemovingShouldBeDisplayed() {
        System.out.println("adim 4....");
        dialogContent.findElementAndVerifyContainsText("msjContainer", "Error");

    }



    @And("^Repeat all scenario times$")
    public void repeatAllScenarioTimes(DataTable element) {
        List<String> test = element.asList(String.class);

        System.out.println("*************** Test-1 bitti... ********************");
        int numOfTest = Integer.parseInt(test.get(0));

        for (int i = 0; i < numOfTest - 1; i++) {
            loginSteps.navigate_to_basqar();
            loginSteps.enter_username_and_password_and_click_Login_button();

            navigateToSubjectCategories(test1);
            subjectCategoriesCreateIfItDoesnt();
            navigateToSubjects();
            createSubjectsIfItDoesnt(test2);

            System.out.println("***********  Test-" + (i + 2) + " bitti....   *****************");

        }
        System.out.println();
        System.out.println("=================================================================");
        System.out.println(" "+dialogContent.getBrowserName().toUpperCase()+" BROWSER");

        System.out.println(" ISTEGINIZ " + numOfTest + " TEST BASARIYLA TAMAMLANMISTIR... ");
        long stopTime = System.currentTimeMillis();
        double timeDuration = (double) ((stopTime - startTime) / 1000 + 10) / 60;
        System.out.printf(" Toplam " + numOfTest + " Test \"%-5.2f\" dakika sürecinde tamamlanmistir...  ", timeDuration);
        System.out.println("\n================================================================");
    }



}
