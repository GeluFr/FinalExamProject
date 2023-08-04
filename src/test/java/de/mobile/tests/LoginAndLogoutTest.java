package de.mobile.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static de.mobile.pages.BasePage.SAVESEARCH_URL;

public class LoginAndLogoutTest extends BaseTest {


    @Test
    public void LoginTest(){

        //Open browser
        driver.get(SAVESEARCH_URL);
        waitForNumberOfSeconds(3);

        //Accept cookies
        WebElement cookiesAccept = driver.findElement(By.xpath("//*[@id=\"mde-consent-modal-container\"]/div[2]/div[2]/div[1]/button"));
        cookiesAccept.click();
        waitForNumberOfSeconds(1);

        //Connect button
        WebElement connectBtn = driver.findElement(By.xpath("//a[normalize-space()='Conectare']"));
        connectBtn.click();
        waitForNumberOfSeconds(3);

        //User Input
        WebElement userInput = driver.findElement(By.xpath("//*[@id=\"login-username\"]"));
        userInput.sendKeys("frateangelu@gmail.com");

        //Password Input
        WebElement passInput = driver.findElement(By.xpath("//*[@id=\"login-password\"]"));
        passInput.sendKeys("Madagascar8.");

        //Submit button
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"login-submit\"]"));
        submitButton.click();
        waitForNumberOfSeconds(27);

        WebElement passInput2 = driver.findElement(By.xpath("//*[@id=\"login-password\"]"));
        passInput2.sendKeys("Madagascar8.");
        WebElement submitButton2 = driver.findElement(By.xpath("//*[@id=\"login-submit\"]"));
        submitButton2.click();
        waitForNumberOfSeconds(7);

        //Verify if Login has successfully made
        WebElement successLogin = driver.findElement(By.xpath("//a[normalize-space()='Site-ul meu mobile.de']"));
        Assert.assertTrue(successLogin.getText().contains("Site-ul meu mobile.de"));
        waitForNumberOfSeconds(2);




        //Account button
        WebElement accountButton = driver.findElement(By.xpath("//a[normalize-space()='Site-ul meu mobile.de']"));
        accountButton.click();
        waitForNumberOfSeconds(1);

        //Logout button
        WebElement logoutButton = driver.findElement(By.xpath("//a[normalize-space()='Deconectare']"));
        logoutButton.click();
        waitForNumberOfSeconds(1);

        //Verify successfulLogout
        WebElement successfulLogout = driver.findElement(By.xpath("//a[normalize-space()='Conectare']"));
        Assert.assertTrue(successfulLogout.isDisplayed());
        waitForNumberOfSeconds(2);

    }
}
