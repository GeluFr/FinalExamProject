package de.mobile.tests;

import de.mobile.pages.BasePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import de.mobile.pages.AdvancedSearchFormPage;

import static de.mobile.pages.BasePage.ADVANCEDFORM_URL;

public class AdvancedSearchFormTest extends BaseTest{

    @Test
public void advancedFormTest(){
        driver.get(ADVANCEDFORM_URL);
        waitForNumberOfSeconds(2);

        //Cookies Accept
        driver.findElement(By.xpath("//*[@id=\"mde-consent-modal-container\"]/div[2]/div[2]/div[1]/button")).click();
        waitForNumberOfSeconds(1);

        AdvancedSearchFormPage advancedSearchFormPage = new AdvancedSearchFormPage(driver);

        //Second-Hand car check
        advancedSearchFormPage.secondHandCarCheck();
        scrollDown300();

        //Essential car details
        advancedSearchFormPage.carBrand();
        waitForNumberOfSeconds(1);

        advancedSearchFormPage.carModel();
        waitForNumberOfSeconds(2);
        scrollDown500();

        //Close advertisement
        driver.findElement(By.xpath("/html/body/div[2]/div/span")).click();


        //Type of vehicle
        advancedSearchFormPage.vehicleType();
        waitForNumberOfSeconds(2);
        scrollDown500();

        //Vehicle search
        advancedSearchFormPage.minimYear();

        advancedSearchFormPage.maximYear();
        waitForNumberOfSeconds(1);
        scrollDown300();

        advancedSearchFormPage.minimPrice();
        waitForNumberOfSeconds(1);

        advancedSearchFormPage.maximPrice();
        waitForNumberOfSeconds(1);


        advancedSearchFormPage.colourButton();

        advancedSearchFormPage.selectColour();
        waitForNumberOfSeconds(1);
        scrollDown300();

        //Engine
        advancedSearchFormPage.dieselFuel();
        waitForNumberOfSeconds(1);
        scrollDown300();

        //Regional Search
        advancedSearchFormPage.countryButton();

        advancedSearchFormPage.selectCountry();
        waitForNumberOfSeconds(1);
        scrollDown300();

        //Comfort and interior design
        advancedSearchFormPage.isofixAdd();

        advancedSearchFormPage.heatedSeatsAdd();
        scrollDown300();

        advancedSearchFormPage.multiWheelAdd();

        advancedSearchFormPage.absAdd();

        advancedSearchFormPage.fogLightsAdd();
        scrollDown500();

        advancedSearchFormPage.alloyWheelsAdd();
        waitForNumberOfSeconds(1);
        scrollDown500();

        //Display result
        advancedSearchFormPage.displayResult();
        waitForNumberOfSeconds(3);

        //Verify result
        advancedSearchFormPage.searchSuccessfulyDisplayed();
    }
}
