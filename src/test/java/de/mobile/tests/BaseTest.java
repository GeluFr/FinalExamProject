package de.mobile.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        //open page
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        //close browser
        driver.manage().deleteAllCookies();
        driver.close();
    }

    public void waitForNumberOfSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void scroolDown500(){
        new Actions(driver)
                .scrollByAmount(0, 500)
                .perform();
    }
    public void scroolDown300(){
        new Actions(driver)
                .scrollByAmount(0, 300)
                .perform();
    }
}
