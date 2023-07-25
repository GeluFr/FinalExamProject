package de.mobile.tests;

import de.mobile.pages.SaveingSearchingCriteriaPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static de.mobile.pages.BasePage.SAVESEARCH_URL;

public class SaveingSearchingCriteriaTest extends BaseTest{

    @Test
    public void searchingInputs(){

        //Open browser to website
        driver.get(SAVESEARCH_URL);
        waitForNumberOfSeconds(2);

        //Cookies accept
        driver.findElement(By.xpath("//*[@id=\"mde-consent-modal-container\"]/div[2]/div[2]/div[1]/button")).click();

        SaveingSearchingCriteriaPage saveingSearchingCriteriaPage = new SaveingSearchingCriteriaPage(driver);

        //car Brand
        saveingSearchingCriteriaPage.brandDacia();
        waitForNumberOfSeconds(1);

        //Car model
        saveingSearchingCriteriaPage.modelSpring();
        waitForNumberOfSeconds(1);

        //Maximum price
        saveingSearchingCriteriaPage.maximPrice();
        waitForNumberOfSeconds(1);

        //First registration
        saveingSearchingCriteriaPage.firstRegistration();
        waitForNumberOfSeconds(1);

        //Maximum mileage
        saveingSearchingCriteriaPage.maxMileage();
        waitForNumberOfSeconds(1);

        //Fuel type
        saveingSearchingCriteriaPage.fuelType();
        waitForNumberOfSeconds(1);

        //Country Import
        saveingSearchingCriteriaPage.countryImport();
        waitForNumberOfSeconds(1);

        //Show results
        saveingSearchingCriteriaPage.showResults();
        waitForNumberOfSeconds(3);


        //Saveing this Search
        saveingSearchingCriteriaPage.saveSearchButton();
        waitForNumberOfSeconds(1);

        saveingSearchingCriteriaPage.savedNameInput();
        waitForNumberOfSeconds(1);

        saveingSearchingCriteriaPage.saveingNameCheck();
        waitForNumberOfSeconds(2);

        //My searching box
        saveingSearchingCriteriaPage.mySaveings();
        waitForNumberOfSeconds(3);

        //Verify if the search is saved

        saveingSearchingCriteriaPage.saveIsComplete();

    }




}
