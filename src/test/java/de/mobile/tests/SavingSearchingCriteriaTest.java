package de.mobile.tests;

import de.mobile.pages.SavingSearchingCriteriaPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static de.mobile.pages.BasePage.SAVESEARCH_URL;

public class SavingSearchingCriteriaTest extends BaseTest{

    @Test
    public void searchingInputs(){

        //Open browser to website
        driver.get(SAVESEARCH_URL);
        waitForNumberOfSeconds(2);

        //Cookies accept
        driver.findElement(By.xpath("//*[@id=\"mde-consent-modal-container\"]/div[2]/div[2]/div[1]/button")).click();

        SavingSearchingCriteriaPage savingSearchingCriteriaPage = new SavingSearchingCriteriaPage(driver);

        //car Brand
        savingSearchingCriteriaPage.brandDacia();
        waitForNumberOfSeconds(1);

        //Car model
        savingSearchingCriteriaPage.modelSpring();
        waitForNumberOfSeconds(1);

        //Maximum price
        savingSearchingCriteriaPage.maximPrice();
        waitForNumberOfSeconds(1);

        //First registration
        savingSearchingCriteriaPage.firstRegistration();
        waitForNumberOfSeconds(1);

        //Maximum mileage
        savingSearchingCriteriaPage.maxMileage();
        waitForNumberOfSeconds(1);

        //Fuel type
        savingSearchingCriteriaPage.fuelType();
        waitForNumberOfSeconds(1);

        //Country Import
        savingSearchingCriteriaPage.countryImport();
        waitForNumberOfSeconds(1);

        //Show results
        savingSearchingCriteriaPage.showResults();
        waitForNumberOfSeconds(3);


        //Saveing this Search
        savingSearchingCriteriaPage.saveSearchButton();
        waitForNumberOfSeconds(1);

        savingSearchingCriteriaPage.savedNameInput();
        waitForNumberOfSeconds(1);

        savingSearchingCriteriaPage.saveingNameCheck();
        waitForNumberOfSeconds(2);

        //My searching box
        savingSearchingCriteriaPage.mySaveings();
        waitForNumberOfSeconds(3);

        //Verify if the search is saved

        savingSearchingCriteriaPage.saveIsComplete();

    }




}
