package de.mobile.tests;

import de.mobile.pages.CarValuationFormPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static de.mobile.pages.BasePage.CARVALUATION_URL;

public class CarValuationFormTest extends BaseTest{

    @Test
    public void valuationForm(){

        //Open browser
        driver.get(CARVALUATION_URL);
        waitForNumberOfSeconds(2);

        //Accept cookies
        driver.findElement(By.xpath("//*[@id=\"mde-consent-modal-container\"]/div[2]/div[2]/div[1]/button")).click();
        waitForNumberOfSeconds(1);

        CarValuationFormPage carValuationFormPage = new CarValuationFormPage(driver);

        //Brand select
        carValuationFormPage.carBrandSelect();
        waitForNumberOfSeconds(1);
        scrollDown500();

        //Model select
        carValuationFormPage.carModelSelect();
        waitForNumberOfSeconds(1);

        //First registration
        carValuationFormPage.yearReg();
        waitForNumberOfSeconds(1);
        carValuationFormPage.monthReg();
        waitForNumberOfSeconds(1);

        //Mileage Input
        carValuationFormPage.mileageInput();
        waitForNumberOfSeconds(2);

        //Fuel select
        carValuationFormPage.dieselFuel();
        waitForNumberOfSeconds(1);

        //Transmission type
        carValuationFormPage.manualGear();
        waitForNumberOfSeconds(1);
        scrollDown300();

        //Engine power
        carValuationFormPage.enginePowerPs();
        waitForNumberOfSeconds(2);
        scrollDown300();

        //Equipment version
        carValuationFormPage.equipmentVersion();
        waitForNumberOfSeconds(1);
        scrollDown500();

        //Registered for road usage
        carValuationFormPage.roadRegistered();
        waitForNumberOfSeconds(1);

        //Type of sell
        carValuationFormPage.typeOfSell();
        waitForNumberOfSeconds(1);

        //Plan to sell
        carValuationFormPage.planToSell();
        waitForNumberOfSeconds(1);

        //Country market postal code
        carValuationFormPage.zipCodeInput();
        waitForNumberOfSeconds(1);

        //Country market sell
        carValuationFormPage.countrySell();
        waitForNumberOfSeconds(1);

        //Email input
        carValuationFormPage.EmailInput();
        waitForNumberOfSeconds(1);





    }
}
