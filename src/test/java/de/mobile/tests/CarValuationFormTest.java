package de.mobile.tests;

import de.mobile.pages.CarValuationFormPage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
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
        waitForNumberOfSeconds(3);

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
        waitForNumberOfSeconds(2);


        //History
        carValuationFormPage.previousOwners();
        waitForNumberOfSeconds(1);
        carValuationFormPage.maintenanceInterval();
        waitForNumberOfSeconds(2);

        //Equipment
        carValuationFormPage.multiSys();
        waitForNumberOfSeconds(1);
        carValuationFormPage.climateControl();
        waitForNumberOfSeconds(1);
        carValuationFormPage.acousticParkingAid();
        waitForNumberOfSeconds(1);
        carValuationFormPage.seatHeating();
        waitForNumberOfSeconds(1);

        //Exterior colour
        carValuationFormPage.exteriorBlueColour();
        waitForNumberOfSeconds(1);
        carValuationFormPage.metallicColour();
        waitForNumberOfSeconds(1);

        //Condition
        carValuationFormPage.bodyDamage();
        waitForNumberOfSeconds(1);
        carValuationFormPage.goodCondition();
        waitForNumberOfSeconds(1);
        carValuationFormPage.exteriorCondition();
        waitForNumberOfSeconds(2);



        //Registered for road usage
        carValuationFormPage.roadRegistered();
        waitForNumberOfSeconds(2);

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

        new Actions(driver).sendKeys(Keys.TAB).perform();
        new Actions(driver).sendKeys(Keys.TAB).perform();
        waitForNumberOfSeconds(2);

        //Email input
        carValuationFormPage.EmailInput();
        waitForNumberOfSeconds(1);

        //Submit
        carValuationFormPage.submitButton();
        waitForNumberOfSeconds(3);

        //Login form
        carValuationFormPage.userInput();
        carValuationFormPage.passwordInput();
        carValuationFormPage.submitLogin();
        waitForNumberOfSeconds(27);
        carValuationFormPage.passwordInput();
        carValuationFormPage.submitLogin();
        waitForNumberOfSeconds(7);

        //Verify the result
        carValuationFormPage.verifyResult();
        waitForNumberOfSeconds(1);







    }
}
