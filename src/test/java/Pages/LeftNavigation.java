package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNavigation extends _Parent {
    WebElement myElement;


    public LeftNavigation() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setUpGeneral;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameterButton;

    @FindBy(xpath ="(//span[text()='Countries'])[1]")
    private  WebElement countryButton;

    @FindBy(xpath = "(//span[text()='Cities'])[1]")
    private WebElement citiesButton;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement HumanResButton;

    @FindBy (xpath = "(//span[text()='Setup'])[3]")
    private WebElement setUpHR;

    @FindBy (xpath = "//span[text()='Salary Modifiers']")
    private WebElement SalaryModButton;

    @FindBy (xpath = "(//span[text()='Salary Constants'])[1]")
    private WebElement salaryConstButton;

    //-----------Nalan Hoca
    @FindBy(xpath = "//span[text()='Education']" )
    private WebElement educationButton;

    @FindBy(xpath = "(//span[text()='Setup'])[5]" )
    private WebElement setupButton;

    @FindBy(xpath = "//span[text()='Subject Categories']" )
    private WebElement subjectcatogeriesButton;

    @FindBy(css ="#ms-table-1_buttons > ms-table-toolbar > div > ms-add-button > div > button")
    private WebElement addnalanButton;

    @FindBy(xpath = "//span[text()='Budget']")
    private WebElement budgetButton;

    @FindBy(xpath = "//span[text()='Budget Accounts']")
    private WebElement budgetAccountsButton;

    //-------Lutfiye hoca-------------
    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private WebElement setUpEducation;

    @FindBy(xpath = " (//span[text()='Subjects'])[1]")
    private WebElement subjectsButton;
    @FindBy(xpath = "(//span[text()='Reports'])[4]")
    private WebElement reportsButton;
    @FindBy(xpath = "(//span[text()='Setup'])[7]")
    private WebElement setUpReports;
    @FindBy(xpath = "//span[text()='Excel Template']")
    private WebElement excelTemplateButton;

    //-----------Mustafa Hoca----
    @FindBy (xpath = "(//span[text()='Setup'])[6]")
    private WebElement budgetSetupBtn;

    @FindBy(xpath = "//span[text()='Cost Centers']")
    private WebElement costCenterBtn;

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private WebElement eduSetup;


    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement eduSubCategories;

    @FindBy(xpath = "//span[text()='Subjects']")
    private WebElement subject;

    @FindBy(xpath = "//span[text()='Budget']")
    private WebElement budget;

    @FindBy(xpath = "(//span[text()='Setup'])[6]")
    private WebElement budgetSetup;
    //
//
    @FindBy(xpath = "//a[@href='/cost-center']")
    private WebElement costCenters;

    //Mustafa Gültekin hoca
    @FindBy(xpath = "//span[text()='Position Salary']" )
    private WebElement posSalryBtn;

    @FindBy(xpath = "//span[text()='Positions']" )
    private WebElement positionBtn;

    @FindBy (xpath = "(//span[text()='Budget Projects'])[1]")
    private WebElement bugdgetProjects;

    //-------------------------

    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {
            case "setUpGeneral":
                myElement = setUpGeneral;
                break;

            case "parameterButton":
                myElement = parameterButton;
                break;
            case "countryButton":
                myElement = countryButton;
                break;
            case "citiesButton":
                myElement = citiesButton;
                break;
            case "HumanResButton":
                myElement = HumanResButton;
                break;
            case "setUpHR":
                myElement = setUpHR;
                break;
            case "SalaryModButton":
                myElement = SalaryModButton;
                break;
            case "salaryConstButton":
                myElement = salaryConstButton;
                break;
//----Nalan Hoca----------------
            case "educationButton":
                myElement = educationButton;
                break;

            case "setupButton":
                myElement = setupButton;
                break;
            case "subjectCatogeriesButton":
                myElement = subjectcatogeriesButton;
                break;

            case "addnalanButton":
                myElement=addnalanButton;
                break;

                case "budgetButton":
                myElement = budgetButton;
                break;

            case "budgetAccountsButton":
                myElement = budgetAccountsButton;
                break;
//--------------------------
            //----------Lutfiye hoca-------
            case "setUpEducation":
                myElement=setUpEducation;
                break;
            case "subjectsButton":
                myElement=subjectsButton;
                break;
            case "reportsButton":
                myElement=reportsButton;
                break;
            case "setUpReports":
                myElement=setUpReports;
                break;
            case "excelTemplateButton":
                myElement=excelTemplateButton;
                break;
//-------------Mustafa Hoca---
            case "budgetSetupBtn":
                myElement=budgetSetupBtn;
                break;
            case "costCenterBtn":
                myElement=costCenterBtn;
                break;
            case "education":
                myElement=education;
                break;
            case "eduSetup":
                myElement=eduSetup;
                break;
            case "eduSubCategories":
                myElement=eduSubCategories;
                break;
            case "subject":
                myElement=subject;
                break;
            case "budget":
                myElement=budget;
                break;
            case "budgetSetup":
                myElement=budgetSetup;
                break;
            case "costCenters":
                myElement=costCenters;
                break;
            case "bugdgetProjects":
                myElement=bugdgetProjects;
                break;




//-----------------Mustafa Gültekin Hoca
            case "posSalryBtn":
                myElement = posSalryBtn;
                break;
            case "positionBtn":
                myElement = positionBtn;
                break;

                //------Mustafa hoca


        }
        clickFunction(myElement);


    }
}


