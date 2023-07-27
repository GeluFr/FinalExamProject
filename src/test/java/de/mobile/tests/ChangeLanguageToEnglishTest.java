package de.mobile.tests;

import de.mobile.pages.ChangeLanguageToEnglishPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static de.mobile.pages.BasePage.LANGUAGE_URL;

public class ChangeLanguageToEnglishTest extends BaseTest{

    @Test
    public void LanguageChangeTest(){

        //Open browser
        driver.get(LANGUAGE_URL);
        waitForNumberOfSeconds(2);

        //Accept cookies
        driver.findElement(By.xpath("//*[@id=\"mde-consent-modal-container\"]/div[2]/div[2]/div[1]/button")).click();

        ChangeLanguageToEnglishPage changeLanguageToEnglishPage = new ChangeLanguageToEnglishPage(driver);

        //Language selector
        changeLanguageToEnglishPage.languageSelect();
        waitForNumberOfSeconds(2);

        //Choose english language
        changeLanguageToEnglishPage.englishSelect();
        waitForNumberOfSeconds(2);

        //Verify if the english language is selected
        changeLanguageToEnglishPage.languageChangeSuccessfully();
        waitForNumberOfSeconds(1);
    }
}
