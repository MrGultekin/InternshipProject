package Pages;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;
import java.util.Random;
import java.util.Set;


public class DialogContent extends _Parent {
    WebElement myElement;
    List<WebElement> myElementList;
    static String dressName;

    public DialogContent() {
        PageFactory.initElements(driver, this);
    }

// Login Elements---------------
    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(linkText = "Got it!")
    private WebElement gotItBtn;

    @FindAll({
            @FindBy(linkText = "Got it!")
    })
    private List<WebElement> gotItBtns;
//----------------------------
// Country Page Elements

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    //----------------------

    // General Mesaj Containers

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindBy (xpath = "//div[@role='alertdialog']")
    private WebElement msjContainer2;

    //-----------------------


   @FindBy (xpath = "//ms-add-button//button/span")
    private WebElement addCityButton;

    @FindBy(xpath = "(//ms-add-button/div/span/following-sibling::button)[2]")
    private WebElement addCountryinCityBtn;

    @FindBy(xpath = "(//ms-text-field[@formcontrolname='name']/input)[2]")
    private WebElement nameInputinCity;

    @FindBy(xpath = "(//ms-save-button//button)[2]")
    private WebElement saveBtnCountryinCity;

    @FindBy(xpath = "(//mat-select/div/div/span)[3]")
    private WebElement countryiesBtn;

    @FindBy (xpath = "//span[@class='mat-option-text']")
    private List<WebElement> countrylist;

    @FindBy (tagName = "ms-delete-button")
    private List<WebElement> deleteBtnlist;

    @FindBy (xpath = "//tbody/tr/td[2]")
    private List<WebElement> nameList;

//--- general page max eleman select buttons

   @FindBy (css = "mat-select[role='combobox']")
    private WebElement pageSelectBtn;

    @FindBy (xpath = "//span[text()=' 1000 ']")
    private WebElement maxElementBtn;
//---------------------------------
    @FindBy (xpath = "//ms-edit-button/button")
    private List<WebElement> editBtnList;

    @FindBy (xpath ="//ms-delete-button/button")
    private List<WebElement> deleteBtnList;

    @FindBy (xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    private WebElement nameInputforSearch;

    @FindBy (xpath = "//span[text()=' Search ']")
    private WebElement searchBtn;

    @FindBy (tagName = "ms-delete-button")
    private WebElement deleteBtn;

    @FindBy (xpath = "//span[text()=' Yes ']")
    private WebElement yesBtn;
    //-------------------------------------Nalan--Hoca-----------------

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'GENERAL.BUTTON.ADD')]")
    private WebElement addBudgetButton;

    @FindBy (xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    private WebElement nameInputForSearch;

    @FindBy(xpath = "//span[text()='Type']")
    private WebElement typeButton;
    @FindBy(xpath = "//span[text()=' Group ']")
    private  WebElement groupButton;
    @FindBy(xpath = "//span[text()='Balance Type']")
    private WebElement balanceTypeButton;
    @FindBy(xpath="//span[text()=' Debit ']")
    private WebElement debitButton;
    @FindBy(xpath = "//span[text()='Category']")
    private WebElement categoryButton;
    /*@FindBy(xpath = "//ms-save-button/button")
    private WebElement saveButton;*/
    @FindBy (xpath = "//span[text()=' Search ']")
    private WebElement searchButton;
    @FindBy(xpath = "//ms-edit-button/button")
    private WebElement editButton;
    @FindBy(xpath= "//ms-delete-button/button")
    private WebElement deleteButton;
    @FindBy (xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;

    //---Aykut Hoca
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement cityNameInput;

    @FindBy(xpath = "//mat-select[@formcontrolname='id']")
    private WebElement countryClick;

    @FindBy(xpath = "//span[text()=' Kazakhstan ']")
    private WebElement landWahl;

    @FindBy (xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    private WebElement citySearchInput;




    //-------------------------------------

    //-----Elements for 3.9----
    @FindBy(xpath = "//span[@class='mat-option-text']")
    public List<WebElement> SubjectCategoryList;

    //-------------------------------------------------------------------
    //---Elements Lutfiye hoca---
    @FindBy(xpath = "//ms-add-button[@tooltip=\"SUBJECTS.TITLE.ADD\"]//button")
    private WebElement addSubjectButton;
    @FindBy(xpath = "//ms-add-button[@fontsize=\"20px\"]//button")
    private WebElement addSubjectCategoryButton;
    @FindBy(xpath = "(//ms-text-field[@formcontrolname='name']/input)[2]")
    private WebElement subjectCategorynameInput;
    @FindBy(xpath = "(//ms-text-field[@formcontrolname='code']/input)[2]")
    private WebElement subjectCategorycodeInput;
    @FindBy(xpath = "(//span[text()='Save'])[2]")
    private WebElement subjectCategorysaveButton;
    @FindBy(xpath = "//span[text()='Subject Category']")
    private WebElement SubjectCategoryDropDownButton;
    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    private WebElement SearchNameInput;
    @FindBy(xpath = "(//div[@fxlayout='row'])[8]//button")
    private WebElement SearchGeneral;
    @FindBy(xpath = " //ms-add-button[@tooltip='BUDGET_EXCEL_TEMPLATE.FIELD.ADD']//button")
    private WebElement addExcelTemplateButton;
    @FindBy(xpath = " //ms-integer-field[@formcontrolname='periodCount']/input")
    private WebElement periodCountInput;
    @FindBy(xpath = "//ms-integer-field[contains(@placeholder,'FIELD.ROW_SIZE')]//input")
    private WebElement rowSizeInput;
    @FindBy(xpath = "//ms-integer-field[contains(@placeholder,'FIELD.COLUMN_SIZE')]//input")
    private WebElement columnSizeInput;
    @FindBy(xpath = "//span[text()='Add Version']")
    private WebElement addVersionButton;
    //---------------------
//Elements of Mustafa Hoca
    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    private WebElement searchName;

    @FindBy(xpath = "//span[text()=' Search ']")
    private WebElement nameSearchClick;


    @FindBy(xpath = "//table/tbody/tr/td[2]")
//css = "td.mat-cell.cdk-cell.cdk-column-name.mat-column-name.ng-tns-c348-45.ng-star-inserted")
    // #ms-table-1_name  table/tbody/tr/td[2]")
    private List<WebElement> searchList;


    @FindBy(xpath = "//table/tbody/tr/td[4]//ms-delete-button")
    private List<WebElement> deleteList1;

    @FindBy(xpath = "//table/tbody/tr/td[5]//ms-delete-button")
    private List<WebElement> deleteList2;


    @FindBy(xpath = "//button[@color='warn']")
    private List<WebElement> deleteListCostCenter;


    @FindBy(xpath = "(//button[@type='button'])[3]")
    private WebElement forwardButton;

    @FindBy(css = "div[class='mat-paginator-range-label']")
    private WebElement pages;

    @FindBy(xpath = "//*[@id='mat-select-value-11']/span")
    private WebElement subjectCategoryInput;

    @FindBy(xpath = "//mat-form-field[@formgroupname='subjectCategory']//div//div")
    private WebElement scClick;

    @FindBy(xpath = "//div[@role='listbox']/mat-option")
    //*[@class='cdk-overlay-pane'])[2]//div//mat-option") //span[@class='mat-option-text']") //
    private List<WebElement> dropList;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[4]")
    private WebElement subjectStyle;

    @FindBy(xpath = "(//*[@role='listbox']/mat-option[@role='option'])[1]") // (//*[@role='listbox']/mat-option")
    private WebElement subjectStyleOption;

    @FindBy(xpath = "//button[@color='accent']") //span[@class='mat-option-text']") //
    private List<WebElement> editBtn;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[2]")
    private WebElement type;

    @FindBy(css = "ms-text-field[type='number']")
    private WebElement orderNu1;

    @FindBy(css = "ms-text-field[type='number']")
    private WebElement orderNu2;

    @FindBy(xpath = "//div[@role='listbox']/mat-option")
    private List<WebElement> expenseAccountList;


    @FindBy(css = "div.mat-chip-list-wrapper")
    private WebElement expenseAccountClick;
//------------------------------------------------------------

    public void findElementandSelectFunction(String countryName) {
        for (WebElement country : countrylist) {
            if (country.getText().contains(countryName))
                clickFunction(country);
        }

    }

    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName){
        case "loginButton":
        myElement = loginButton;
        break;

        case "gotItBtn":
        if (gotItBtns.size() == 0)
        return;

        myElement = gotItBtn;
        break;

        case "addButton":
        myElement = addButton;
        break;

        case "saveButton":
        myElement = saveButton;
        break;

        case "addCityButton":
        myElement = addCityButton;
        break;

        case "addCountryinCityBtn":
        myElement = addCountryinCityBtn;
        break;

        case "saveBtnCountryinCity":
        myElement = saveBtnCountryinCity;
        break;

        case "countryiesBtn":
        myElement = countryiesBtn;
        break;

        case "pageSelectBtn":
        myElement = pageSelectBtn;
        break;

        case "maxElementBtn":
        myElement = maxElementBtn;
        break;

            case "deleteBtn":
                myElement = deleteBtn;
                break;


            case "searchBtn":
                myElement = searchBtn;
                break;

            case "yesBtn":
                myElement = yesBtn;
                break;
                //------Nalan---Hoca----
            case "addbudgetbutton":
                myElement=addBudgetButton;
                break;
            case "groupButton" :
                myElement=groupButton;
                break;
            case "typeButton":
                myElement=typeButton;
                break;
            case "balanceTypeButton":
                myElement=balanceTypeButton;
                break;
            case "debitButton":
                myElement=debitButton;
                break;
            case "searchButton":
                myElement=searchButton;
                break;
            case "editButton":
                myElement=editButton;
                break;
            case "deleteButton":
                myElement=deleteButton;
                break;
            case "yesButton":
                myElement=yesButton;
                break;
            case "nameInputForSearch":
                myElement=nameInputForSearch;
                break;
                //------------------//
            //---Aykut Hoca
            case "countryClick":
                myElement=countryClick;
                break;
            case "landWahl":
                myElement=landWahl;
                break;
//-----Lutfiye Hoca----------
            case "addSubjectButton":
                myElement=addSubjectButton;
                break;
            case "addSubjectCategoryButton":
                myElement=addSubjectCategoryButton;
                break;
            case "subjectCategorysaveButton":
                myElement=subjectCategorysaveButton;
                break;
            case "SubjectCategoryDropDownButton":
                myElement=SubjectCategoryDropDownButton;
                break;
            case "SearchGeneral":
                myElement=SearchGeneral;
                break;
            case "addExcelTemplateButton":
                myElement=addExcelTemplateButton;
                break;
            case "addVersionButton":
                myElement=addVersionButton;
                break;
// Mustafa Hoca----------------
            case "nameSearchClick":
                myElement = nameSearchClick;
                break;

                case "subjectCategoryInput":
                myElement = subjectCategoryInput;

            case "scClick":
                myElement = scClick;
                break;

            case "subjectStyle":
                myElement = subjectStyle;
                break;

            case "subjectStyleOption":
                myElement = subjectStyleOption;
                break;
            case "type":
                myElement = type;
                break;

            case "orderNu1":
                myElement = orderNu1;
                break;
            case "expenseAccountClick":
                myElement = expenseAccountClick;
                break;
            case "expenseAccountList":
                int a=(int)(Math.random()*expenseAccountList.size());
                myElement = expenseAccountList.get(a);
                break;

                //-----------------------------



        }
        clickFunction(myElement);


    }



    public void findElementAndSendKeysFunction(String ElememtName, String value) {



        switch (ElememtName) {
            case "username":
                myElement = username;
                break;
            case "password":
                myElement = password;
                break;
            case "nameInput":
                myElement = nameInput;
                break;
            case "codeInput":
                myElement = codeInput;
                break;
            case "nameInputinCity":
                myElement = nameInputinCity;
                break;
            case "nameInputforSearch":
                myElement = nameInputforSearch;
                break;
                //----Nalan Hoca-----
            case "nameInputForSearch":
                myElement=nameInputForSearch;
                break;
//----------------
//------Aykut Hoca
            case "cityNameInput":
                myElement=cityNameInput;
                break;
            case "citySearchInput":
                myElement=citySearchInput;
                break;
 //----------------------
//---Lutfiye Hoca
            case "subjectCategorynameInput":
                myElement=subjectCategorynameInput;
                break;
            case "subjectCategorycodeInput":
                myElement=subjectCategorycodeInput;
                break;
            case "SearchNameInput":
                myElement=SearchNameInput;
                break;
            case "periodCountInput":
                myElement=periodCountInput;
                break;
            case "rowSizeInput":
                myElement=rowSizeInput;
                break;
            case "columnSizeInput":
                myElement=columnSizeInput;
                break;
//----Mustafa Hoca--------------
            case "searchName":
                myElement = searchName;
                break;

            case "orderNu2":
                myElement = orderNu2;
                break;
        }
        sendsKeysFunction(myElement, value);


    }

    public void findElementAndVerifyContainsText(String ElementName, String msg) {
        switch (ElementName) {
                case "msjContainer2":
                myElement = msjContainer2;
                break;
            case "msjContainer":
                myElement = msjContainer;
                break;

        }

        verifyElementContaisText(myElement, msg);
    }

    public void findElementAndDeleteFunction(String ElementName){

        for (int i=0; i<nameList.size();i++) {
            if (nameList.get(i).getText().equals(ElementName))
                clickFunction(deleteBtnlist.get(i));
        }
    }
    public void findElementAndEditFunction1(String ElementName){
        for (int i=0; i<nameList.size();i++) {
            if (nameList.get(i).getText().equals(ElementName))
                clickFunction(editBtnList.get(i));
        }
    }

    //--Mustafa hocanin Metodlari ----

    public void findElementAndEditFunction(String ElementName) {
        if (ElementName.equalsIgnoreCase("expenseAccountList")) ElementName = expenseAccountList.get(2).getText();
        wait.until(ExpectedConditions.visibilityOfAllElements(searchList));

        for (int i = 0; i < searchList.size(); i++) {
            if (searchList.get(i).getText().equals(ElementName)) {
                clickFunction(editBtn.get(i));
                break;
            }
        }
    }

    public void findElementAndClickFunction(String ElementList, String element) {
        switch (ElementList) {
            case "dropList":
                myElementList = dropList;
                break;
        }

        for (WebElement w : myElementList) {
            if (w.getText().equalsIgnoreCase(element)) {
                myElement = w;
                break;
            }
        }
        clickFunction(myElement);
    }

    public void deleteElement(String elementList, String deleteWord) {
        switch (elementList) {
            case "deleteList2":
                myElementList = deleteList2;
                break;

            case "deleteListCostCenter":
                myElementList = deleteListCostCenter;

                break;
        }

        int index = searchElement(deleteWord);
        List<WebElement> myDeleteList = myElementList;
        clickFunction(myDeleteList.get(index));
    }

    public void deleteElement(String elementList, int index) {
        switch (elementList) {
            case "deleteList2":
                myElementList = deleteList2;
                break;

            case "deleteListCostCenter":
                myElementList = deleteListCostCenter;

                break;
        }

        List<WebElement> myDeleteList = myElementList;
        clickFunction(myDeleteList.get(index));
    }


    public int editElement(String edit, String code) {
        int editIndex = 0;
        List<WebElement> editElemean = editBtn;
        for (int i = 0; i < editElemean.size(); i++) {
            if (editElemean.get(i).getText().equalsIgnoreCase(edit)) {
                editIndex = i;
                break;
            }
        }
        System.out.println("editElemean.size() : " + editElemean.size());

        System.out.println("index = " + editIndex);
        clickFunction(editBtn.get(editIndex));

        findElementAndSendKeysFunction("searchName", (edit + 11));
        findElementAndSendKeysFunction("codeInput", (code + "CODE"));
        clickFunction(type);
        findElementAndClickFunction("dropList", "Personal");
        findElementAndClickFunction("orderNu1");
        //findElementAndSendKeysFunction("orderNu2", "2");
        clickFunction(expenseAccountClick);
        editElemean = expenseAccountList;
        clickFunction(expenseAccountList.get(2));// random olarak listeden 0-5 arasinda bir element secildi

        //findElementAndClickFunction("expenseAccountClick");
        //indElementAndClickFunction("expenseAccountClick", "1");
        clickFunction(saveButton);
        return editIndex;
    }

    public int searchElement(String searchWord) {

        int returnNum = -1;
        findElementAndSendKeysFunction("searchName", searchWord);
        findElementAndClickFunction("nameSearchClick");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int i = 0;
        //delete buttonun sirasini bulmak icin ailinecek elemanin indexi listeden alindi
        List<WebElement> mySearchList = searchList;

        if (mySearchList.size() != 0) {
            String wordInList = "";
            //waitVisibleListAllElement(myListElement);
            do {
                wordInList = mySearchList.get(i).getText();
                i++;
                if (searchWord.equalsIgnoreCase(wordInList)) {
                    returnNum = (i % 10) - 1;
                    break;
                }
                if (i == 10 && forwardButton.isEnabled()) {
                    i = 0;
                    clickFunction(forwardButton);
                    //waitUntilInvisible(forwardButton);
                }
            } while (!searchWord.equals(wordInList) && i < mySearchList.size());


            return returnNum;
        } else {

            return returnNum;
        }
    }
    public void waitUntilInvisible(String ElementName) {
        switch (ElementName) {
            case "msjContainer":
                myElement = msjContainer;
                break;
        }
        waitUntilVisible(msjContainer);
    }

    public int getRandom(int maxNum) {
        Random rand = new Random(maxNum);
        return rand.nextInt();
    }

    public String getBrowserName() {
        Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
        String browserName = cap.getBrowserName().toLowerCase();
        //System.out.println(browserName);
        return browserName;

    }

}

