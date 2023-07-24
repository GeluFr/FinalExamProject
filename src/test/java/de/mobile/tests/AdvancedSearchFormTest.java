package de.mobile.tests;

import de.mobile.pages.BasePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import de.mobile.pages.AdvancedSearchFormPage;

public class AdvancedSearchFormTest extends BaseTest{

    @Test
public void advancedFormTest(){
        driver.get(BasePage.ADVANCEDFORM_URL);
        waitForNumberOfSeconds(2);

        //Cookies Accept
        driver.findElement(By.xpath("//*[@id=\"mde-consent-modal-container\"]/div[2]/div[2]/div[1]/button")).click();
        waitForNumberOfSeconds(1);

        AdvancedSearchFormPage advancedSearchFormPage = new AdvancedSearchFormPage(driver);

        //Second-Hand car check
        advancedSearchFormPage.secondHandCarCheck();
        waitForNumberOfSeconds(1);

        //Essential car details
        advancedSearchFormPage.carBrand();
        waitForNumberOfSeconds(1);

        advancedSearchFormPage.carModel();
        waitForNumberOfSeconds(3);
        scroolDown500();

        //Type of vehicle
        advancedSearchFormPage.vehicleType();
        waitForNumberOfSeconds(2);
        scroolDown500();

        //Vehicle search
        advancedSearchFormPage.minimYear();

        advancedSearchFormPage.maximYear();
        waitForNumberOfSeconds(1);
        scroolDown300();

        advancedSearchFormPage.minimPrice();
        waitForNumberOfSeconds(1);

        advancedSearchFormPage.maximPrice();
        waitForNumberOfSeconds(1);

        advancedSearchFormPage.colourButton();

        advancedSearchFormPage.selectColour();
        waitForNumberOfSeconds(1);
        scroolDown300();

        //Engine
        advancedSearchFormPage.dieselFuel();
        waitForNumberOfSeconds(1);
        scroolDown300();

        //Regional Search
        advancedSearchFormPage.countryButton();

        advancedSearchFormPage.selectCountry();
        waitForNumberOfSeconds(1);
        scroolDown300();

        //Comfort and interior design
        advancedSearchFormPage.isofixAdd();

        advancedSearchFormPage.heatedSeatsAdd();
        scroolDown300();

        advancedSearchFormPage.multiWheelAdd();

        advancedSearchFormPage.absAdd();

        advancedSearchFormPage.fogLightsAdd();
        scroolDown500();

        advancedSearchFormPage.alloyWheelsAdd();
        waitForNumberOfSeconds(1);
        scroolDown500();

        //Display result
        advancedSearchFormPage.displayResult();
        waitForNumberOfSeconds(3);

        //Verify result
        advancedSearchFormPage.searchSuccessfulyDisplayed();
    }
}
