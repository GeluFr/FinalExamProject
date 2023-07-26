package de.mobile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AdvancedSearchFormPage extends BasePage{
    public AdvancedSearchFormPage(WebDriver driver) {

        super(driver);
    }

    //Second-Hand Car Check
    @FindBy(xpath = "//*[@id=\"newCars_USED\"]") private WebElement usedCarCheck;
    public void secondHandCarCheck(){

        usedCarCheck.click();
    }


    //Essential car details
    @FindBy(xpath = "//*[@id=\"makeModelVariant1Make\"]") private WebElement carBrandSelect;
    public void carBrand(){
        Select carBrandBMW = new Select(carBrandSelect);
        carBrandBMW.selectByValue("3500");
    }

    @FindBy(xpath = "//*[@id=\"makeModelVariant1Model\"]") private WebElement carModelSelect;
    public void carModel(){
        Select carModel320 = new Select(carModelSelect);
        carModel320.selectByValue("10");
    }


    //Type of vehicle
    @FindBy(xpath = "/html/body/div[1]/div/section/form/div[4]/div/div/div[1]/div[3]/label") private WebElement carTypeSelect;
    public void vehicleType(){

        carTypeSelect.click();
    }


    //Vehicle search
    @FindBy(xpath = "/html/body/div[1]/div/section/form/div[5]/div/div/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]") private WebElement minYearInput;
    public void minimYear(){

        minYearInput.sendKeys("2010");
    }

    @FindBy(xpath = "/html/body/div[1]/div/section/form/div[5]/div/div/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]") private WebElement maxYearInput;
    public void maximYear(){

        maxYearInput.sendKeys("2015");
    }

    @FindBy(xpath = "/html/body/div[1]/div/section/form/div[5]/div/div/div[1]/div[1]/div[3]/div[2]/div[1]/input[1]") private WebElement minPriceInput;
    public void minimPrice(){

        minPriceInput.sendKeys("5000");
    }

    @FindBy(xpath = "/html/body/div[1]/div/section/form/div[5]/div/div/div[1]/div[1]/div[3]/div[2]/div[2]/input[1]") private WebElement maxPriceInput;
    public void maximPrice(){

        maxPriceInput.sendKeys("9000");
    }

    @FindBy(xpath = "/html/body/div[1]/div/section/form/div[5]/div/div/div[2]/div[1]/div/div/button") private WebElement exteriorColourButton;
    public void colourButton(){

        exteriorColourButton.click();
    }
    @FindBy(xpath = "/html/body/div[1]/div/section/form/div[5]/div/div/div[2]/div[1]/div/div/div/ul/li[10]/a") private WebElement colourSelect;
    public void selectColour(){

        colourSelect.click();
    }


    //Engine
    @FindBy(id = "fuelType_DIESEL") private WebElement fuelType;
    public void dieselFuel(){

        fuelType.click();
    }

    //Regional Search
    @FindBy(xpath = "/html/body/div[1]/div/section/form/div[7]/div/div/div[1]/div[1]/div/div/button") private WebElement countryImportButton;
    public void countryButton(){

        countryImportButton.click();
    }

    @FindBy(xpath = "/html/body/div[1]/div/section/form/div[7]/div/div/div[1]/div[1]/div/div/div/ul/li[4]/a") private WebElement countrySelect;
    public void selectCountry(){

        countrySelect.click();
    }


    //Comfort and interior design
    @FindBy(id = "features_ISOFIX") private WebElement isofixCheck;
    public void isofixAdd(){
        isofixCheck.click();
    }

    @FindBy(id = "features_ELECTRIC_HEATED_SEATS") private WebElement heatedSeatsCheck;
    public void heatedSeatsAdd(){

        heatedSeatsCheck.click();
    }

    @FindBy(id = "features_MULTIFUNCTIONAL_WHEEL") private WebElement multifunctionalWheelCheck;
    public void multiWheelAdd(){

        multifunctionalWheelCheck.click();
    }

    @FindBy(id = "features_ABS") private WebElement absCheck;
    public void absAdd(){

        absCheck.click();
    }

    @FindBy(id = "features_FRONT_FOG_LIGHTS") private WebElement fogLightsCheck;
    public void fogLightsAdd(){

        fogLightsCheck.click();
    }
    @FindBy(id = "features_ALLOY_WHEELS") private WebElement alloyWheelsCheck;
    public void alloyWheelsAdd(){

        alloyWheelsCheck.click();
    }


    //Display Results
    @FindBy(xpath = "//*[@id=\"sticky-wrapper\"]/div/input") private WebElement displayResultsButton;
    public void displayResult(){

        displayResultsButton.click();
    }

    //Verify search result
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/section/section[1]/div") private WebElement successfulSearch;
    public boolean searchSuccessfulyDisplayed(){

        return successfulSearch.getText().contains("BMW 320 Break");
    }
}
