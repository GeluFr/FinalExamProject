package de.mobile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CarValuationFormPage extends BasePage{
    public CarValuationFormPage(WebDriver driver) {
        super(driver);
    }

    //Car brand
    @FindBy(xpath = "//*[@id=\"select-make\"]") private WebElement brandSel;
    public void carBrandSelect(){
        Select brandSel1 = new Select(brandSel);
     brandSel1.selectByValue("25200");
    }

    //Car model
    @FindBy(id = "select-model") private WebElement modelSel;
    public void carModelSelect(){
        Select modelSel1 = new Select(modelSel);
        modelSel1.selectByValue("30");
    }

    //First registration
    @FindBy(id = "select-year") private WebElement yearSel;
    public void yearReg() {
        Select yearSel1 = new Select(yearSel);
        yearSel1.selectByValue("2012");
    }

    //Month registration
    @FindBy(id = "select-month") private WebElement monthSel;
    public void monthReg(){
        Select monthSel1 = new Select(monthSel);
        monthSel1.selectByValue("06");
    }

    //Mileage input
    @FindBy(id = "enter-mileage") private WebElement milInput;
    public void mileageInput(){
        milInput.sendKeys("250000");
    }

    //Fuel select
    @FindBy(xpath = "//*[@id=\"DIESEL\"]") private WebElement fuelSel;
    public void dieselFuel(){
        fuelSel.click();
    }

    //Transmission type
    @FindBy(xpath = "//*[@id=\"MANUAL_GEAR\"]") private WebElement gearSel;
    public void manualGear(){
        gearSel.click();
    }

    //Engine power
    @FindBy(xpath = "//*[@id=\"select-power\"]") private WebElement powerSel;
    public void enginePowerPs(){
        Select powerSel1 = new Select(powerSel);
        powerSel1.selectByValue("103");
    }

    //Equipment version
    @FindBy(xpath = "//*[@id=\"select-modelvariant-div\"]/div[2]/div/div[6]/div[2]") private WebElement equipSel;
    public void equipmentVersion(){
        equipSel.click();
    }

    //Registered for road
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[3]/article/div/div/section[2]/div/div/form/div[4]/div[2]/div/div[1]/div/div/div[1]/label") private WebElement roadRed;
    public void roadRegistered(){
        roadRed.click();
    }

    //Type of sell
    @FindBy(xpath = "//*[@id=\"sellertype-fsbo\"]") private WebElement sellType;
    public void typeOfSell(){
        sellType.click();
    }

    //Plan to sell
    @FindBy(xpath = "//*[@id=\"LOCAL.sellingHorizon.now\"]") private WebElement sellPlan;
    public void planToSell(){
        sellPlan.click();
    }

    //Country market postal code
    @FindBy(xpath = "//*[@id=\"enter-zipcode\"]") private WebElement zipCode;
    public void zipCodeInput(){
        zipCode.sendKeys("80331");
    }

    //Country market sell
    @FindBy(xpath = "//*[@id=\"select-country\"]") private WebElement countrySel;
    public void countrySell(){
        Select countrySel1 = new Select(countrySel);
        countrySel1.selectByValue("DE");
    }

    //Email input
    @FindBy(xpath = "//*[@id=\"enter-email\"]") private WebElement enterEmail;
    public void EmailInput(){
        enterEmail.sendKeys("frateangelu@gmail.com");
    }

}
