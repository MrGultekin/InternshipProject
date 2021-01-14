package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class PositonSalaryContent extends _Parent {
    WebElement myElement;


    public PositonSalaryContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//ms-add-button//button")
    private WebElement addPosSlryButton;

    @FindBy (xpath = "//ms-text-field/input")
    private WebElement SalarynameInput;
    @FindBy (xpath = "//span[text()='Save']")
    private WebElement SalarySaveBtn;
    @FindBy (xpath = "//ms-edit-button/button")
    private WebElement SalaryEditBtn;
    @FindBy (xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement PositionNameInput;
    @FindBy (xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement PositionShotnameInput;





    //___________________________________//_____________-

    @FindBy (xpath = "//ms-add-button[contains(@tooltip,'CONSTANTS.TITLE')]//button")
    private WebElement addSalConsButton;



    @FindBy (xpath = "//input[@data-placeholder='Description']")
    private WebElement describtionInput;

    @FindBy (xpath = "//input[@data-placeholder='Variable']")
    private WebElement variableInput;

    @FindBy (xpath = "//mat-select[@formcontrolname='modifierType']")
    private WebElement modifierTypeSelect;

    @FindBy (className = "mat-option-text")
    private List<WebElement> modifierTypeList;

    @FindBy (xpath = "//input[@data-placeholder='Priority']")
    private WebElement priorityInput;

    @FindBy (xpath = "//input[@data-placeholder='Amount']")
    private WebElement amountInput;

    @FindBy (xpath = "(//tbody/tr)/td[6]")
    private List<WebElement> priorityList;

    @FindBy (xpath = "//ms-button[contains(@caption,'GENERAL')]")
    private WebElement newModButton;

    @FindBy (xpath = "//ms-save-button/button")
    private WebElement saveButtoninMod;

    @FindBy (xpath = "//input[@data-placeholder='Description']")
    private WebElement descriptionInput;

    @FindBy (xpath = "//span[text()=' Search ']")
    private WebElement searchInMod;

    @FindBy (tagName = "ms-edit-button")
    private List<WebElement> editBtnList;

    @FindBy (tagName ="ms-delete-button")
    private List<WebElement> deleteBtnList;

    @FindBy (xpath = "//tbody/tr/td[2]")
    private List<WebElement> nameList;

    @FindBy (xpath = "//span[text()=' Yes ']")
    private WebElement yesBtninSM;

    @FindBy (xpath = "//span[text()='Delete']")
    private WebElement deleteBtninSM;

    @FindBy (xpath = "//input[@formcontrolname='name']")
    private  WebElement salconstnameInput;

    @FindBy (xpath = "//mat-form-field/div/div/div/input/following-sibling::input")
    private WebElement valFromInput;

    @FindBy (xpath = "//ms-text-field[@formcontrolname='key']/input")
    private WebElement keyInput;

    @FindBy (xpath = "//ms-integer-field[@formcontrolname='value']/input")
    private WebElement valueInput;

    @FindBy (css = "div[class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-today']")
    private WebElement today;

    @FindBy (xpath = "//input[@data-placeholder='Name']")
    private WebElement nameInputinSalary;

    public void findElementAndEditFunction(String ElementName){
        for (int i=0; i<nameList.size();i++) {
            if (nameList.get(i).getText().equals(ElementName))
                clickFunction(editBtnList.get(i));
        }
    }
    public void findElementAndDeleteFunction(String ElementName){
        for (int i=0; i<nameList.size();i++) {
            if (nameList.get(i).getText().equals(ElementName))
                clickFunction(deleteBtnList.get(i));
        }
    }

    public String decidePriorityLevel(){
        int j;
        List<Integer> priorityintList=new ArrayList<>();
        for (WebElement webElement : priorityList) {
            priorityintList.add(Integer.parseInt(webElement.getText()));
        }
        for ( j = 0; j <100 ; j++) {
           if (!priorityintList.contains(j))
               break;
        }
        System.out.println(priorityintList);
        /*do{
             i=(int) (Math.random()*100);
        }while (priorityintList.contains(i));*/
        return Integer.toString(j);
    }

    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName){
            case "addPosSlryButton":
                myElement = addPosSlryButton;
                break;

            case "SalarySaveBtn":
                myElement = SalarySaveBtn;
                break;
            case "SalaryEditBtn":
                myElement = SalaryEditBtn;
                break;






           //________________________________//




            case "modifierTypeSelect":
                myElement = modifierTypeSelect;
                break;
            case "modifierTypeList":
                int i= (int) (Math.random()*modifierTypeList.size());
                myElement = modifierTypeList.get(i);
                break;
            case "newModButton":
                myElement = newModButton;
                break;
            case "saveButtoninMod":
                myElement = saveButtoninMod;
                break;
            case "searchInMod":
                myElement = searchInMod;
                break;
            case "deleteBtninSM":
                myElement = deleteBtninSM;
                break;
            case "yesBtninSM":
                myElement = yesBtninSM;
                break;
            case "addSalConsButton":
                myElement = addSalConsButton;
                break;
            case "valFromInput":
                myElement = valFromInput;
                break;
            case "today":
                myElement = today;
                break;

        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String ElememtName, String value) {



        switch (ElememtName) {

            case "SalarynameInput":
                myElement = SalarynameInput;
                break;


            case "PositionNameInput":
                myElement = PositionNameInput;
                break;
            case "PositionShotnameInput":
                myElement = PositionShotnameInput;
                break;










            case "describtionInput":
                myElement = describtionInput;
                break;
            case "variableInput":
                myElement = variableInput;
                break;
            case "priorityInput":
                myElement = priorityInput;
                break;
            case "amountInput":
                myElement = amountInput;
                break;
            case "descriptionInput":
                myElement = descriptionInput;
                break;
            case "salconstnameInput":
                myElement = salconstnameInput;
                break;
            case "valFromInput":
                myElement = valFromInput;
                break;
            case "keyInput":
                myElement = keyInput;
                break;
            case "valueInput":
                myElement = valueInput;
                break;
            case "nameInputinSalary":
                myElement = nameInputinSalary;
                break;

        }
        sendsKeysFunction(myElement, value);


    }

}
