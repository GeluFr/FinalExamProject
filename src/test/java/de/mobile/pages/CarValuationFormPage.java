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

    //History
    @FindBy(xpath = "//*[@id=\"number-of-vehicle-owners-one\"]") private WebElement ownersel;
    public void previousOwners(){
        ownersel.click();
    }
    @FindBy(xpath = "//*[@id=\"maintenance-interval-no\"]") private WebElement mainteinCheck;
    public void maintenanceInterval(){
        mainteinCheck.click();
    }

    //Equipment
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[3]/article/div/div/section[2]/div/div/form/div[5]/div[2]/div[1]/div[2]/div/div/div/div[1]/label/div/div") private WebElement navSel;
    public void multiSys(){
        navSel.click();
    }
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[3]/article/div/div/section[2]/div/div/form/div[5]/div[2]/div[1]/div[2]/div/div/div/div[2]/label/div/div") private WebElement acSel;
    public void climateControl(){
        acSel.click();
    }
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[3]/article/div/div/section[2]/div/div/form/div[5]/div[2]/div[1]/div[2]/div/div/div/div[6]/label/div/div") private WebElement acParkSel;
    public void acousticParkingAid(){
        acParkSel.click();
    }
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[3]/article/div/div/section[2]/div/div/form/div[5]/div[2]/div[1]/div[2]/div/div/div/div[9]/label/div/div") private WebElement shSel;
    public void seatHeating(){
        shSel.click();
    }

    //Exterior colour
   @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[3]/article/div/div/section[2]/div/div/form/div[5]/div[3]/div/div/div/div/div/div/div/div[3]/label/div") private WebElement colourSel;
    public void exteriorBlueColour(){
        colourSel.click();
    }
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[3]/article/div/div/section[2]/div/div/form/div[5]/div[4]/div/div/div/label/div[2]") private WebElement metalsel;
    public void metallicColour(){
        metalsel.click();
    }

    //Condition
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[3]/article/div/div/section[2]/div/div/form/div[6]/div[2]/div[1]/div/div/div[2]/div[2]/label") private WebElement bodyCond;
    public void bodyDamage(){
        bodyCond.click();
    }
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/article[1]/div[1]/div[1]/section[2]/div[1]/div[1]/form[1]/div[6]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/label[1]") private WebElement genUsage;
    public void goodCondition(){
        genUsage.click();
    }
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/article[1]/div[1]/div[1]/section[2]/div[1]/div[1]/form[1]/div[6]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/label[1]") private WebElement extCond;
    public void exteriorCondition(){
        extCond.click();
    }

    //Registered for road
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[3]/article/div/div/section[2]/div/div/form/div[7]/div[2]/div/div[1]/div/div/div[1]/label") private WebElement roadRed;
    public void roadRegistered(){
        roadRed.click();
    }

    //Type of sell
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[3]/article/div/div/section[2]/div/div/form/div[7]/div[2]/div/div[2]/div/div/div[1]/label") private WebElement sellType;
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
    @FindBy(xpath = "//input[@id='enter-email']") private WebElement enterEmail;
    public void EmailInput(){
        enterEmail.sendKeys("frateangelu@gmail.com");
    }

}
