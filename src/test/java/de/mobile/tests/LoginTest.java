package de.mobile.tests;

import de.mobile.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static de.mobile.pages.BasePage.LOGIN_URL;

public class LoginTest extends BaseTest{

    @Test
    public void LoginTest(){

        //Open login page
        driver.get(LOGIN_URL);
        waitForNumberOfSeconds(2);

        //Accept cookies
        driver.findElement(By.xpath("//*[@id=\"mde-consent-modal-container\"]/div[2]/div[2]/div[1]/button")).click();
        waitForNumberOfSeconds(1);

        LoginPage loginPage = new LoginPage(driver);

        //Username input
        loginPage.usernameInput("frateangelu@gmail.com");
        waitForNumberOfSeconds(1);

        //Password input
        loginPage.passwordInput("Madagascar8.");
        waitForNumberOfSeconds(1);

        //Submit login
        loginPage.submitLogin();
        waitForNumberOfSeconds(31);

        //Re-enter password
        loginPage.passwordInput("Madagascar8.");

        //Re-submit login
        loginPage.submitLogin();
        waitForNumberOfSeconds(2);

        //Verify login
        loginPage.loginSuccessfully();
        waitForNumberOfSeconds(1);
    }
}
