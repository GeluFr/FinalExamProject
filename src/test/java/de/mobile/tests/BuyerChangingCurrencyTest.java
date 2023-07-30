package de.mobile.tests;

import de.mobile.pages.BuyerChangingCurrencyPage;
import de.mobile.pages.ChangeLanguageToEnglishPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static de.mobile.pages.BasePage.CURRENCY_URL;

public class BuyerChangingCurrencyTest extends BaseTest{

    @Test
    public void changingCurrencyTest(){

        //Open browser page
        driver.get(CURRENCY_URL);
        waitForNumberOfSeconds(2);

        //Accept cookies
        driver.findElement(By.xpath("//*[@id=\"mde-consent-modal-container\"]/div[2]/div[2]/div[1]/button")).click();
        waitForNumberOfSeconds(1);

        BuyerChangingCurrencyPage buyerChangingCurrencyPage = new BuyerChangingCurrencyPage(driver);

        //Currency select
        buyerChangingCurrencyPage.currencySelectUSD();
        waitForNumberOfSeconds(1);

        //Verify that currency has changed
        buyerChangingCurrencyPage.currencyChangedSuccessfully();


    }
}
