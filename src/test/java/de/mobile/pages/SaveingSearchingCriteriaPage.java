package de.mobile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SaveingSearchingCriteriaPage extends BasePage{
    public SaveingSearchingCriteriaPage(WebDriver driver) {
        super(driver);
    }

    //Car brand
    @FindBy(id = "makeModelVariant1Make") private WebElement brandSelect;
    public void brandDacia(){
        Select brandSelect1 = new Select(brandSelect);
        brandSelect1.selectByValue("6600");
    }

    //Car model
    @FindBy(id = "makeModelVariant1Model") private WebElement modelSelect;
    public void modelSpring(){
        Select modelSelect1 = new Select(modelSelect);
        modelSelect1.selectByValue("25");
    }

    //Maximum price
    @FindBy(id = "maxPrice") private WebElement maxPriceSelect;
    public void maximPrice(){
        Select maxPriceSelect1 = new Select(maxPriceSelect);
        maxPriceSelect1.selectByValue("15000");
    }

    //First registration
    @FindBy(id = "minFirstRegistration") private WebElement firstReg;
    public void firstRegistration(){
        Select firstReg1 = new Select(firstReg);
        firstReg1.selectByValue("2021");
    }

    //Maximum mileage
    @FindBy(id = "maxMileage") private WebElement maxKm;
    public void maxMileage(){
        Select maxKm150 = new Select(maxKm);
        maxKm150.selectByValue("150000");
    }

    //Fuel Type
    @FindBy(id = "fuelType") private WebElement fuelSelect;
    public void fuelType(){
    Select electricFuel = new Select(fuelSelect);
    electricFuel.selectByValue("ELECTRICITY");
    }

    //Import country
    @FindBy(id = "countryCode") private WebElement countrySelect;
    public void countryImport(){
        Select roCountry = new Select(countrySelect);
        roCountry.selectByValue("RO");

        Select deCountry = new Select(countrySelect);
        deCountry.selectByValue("DE");
    }

    //Show results
    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div[2]/div/div[1]/form/div[4]/div[2]/input") private WebElement showResultsButton;
    public void showResults(){
        showResultsButton.click();
    }


    //Save this Search Button
    @FindBy(xpath = "//button[contains(text(),'Salvare căutare')]") private WebElement saveSearch;
    public void saveSearchButton(){
        saveSearch.click();
    }
    @FindBy(xpath = "//*[@id=\"searchName\"]") private WebElement nameInput;
    public void savedNameInput(){
        nameInput.sendKeys("Dacia Spring Test");
    }

    @FindBy(xpath = "//span[@class='input-group-addon js-savesearch-confirm js-track-event']") private WebElement checkOk;
    public void saveingNameCheck(){
        checkOk.click();
    }

    //My searching Box
    @FindBy(xpath = "/html/body/header/div[2]/nav/div/ul[2]/li[1]/a") private WebElement saveingLocation;
    public void mySaveings(){
        saveingLocation.click();
    }

    //Verify if the saveing is complete
    @FindBy(xpath = "//*[@id=\"entry0\"]/a/div") private WebElement saveingCheck;
    public void saveIsComplete(){
        saveingCheck.getText().contains("dacia spring test");
    }


}
