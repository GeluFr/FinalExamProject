package ro.mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdvanceSearchFormTest {
    WebDriver driver;
    String url = "https://www.mobile.de/ro/c%C4%83utare-detaliat%C4%83/nou/vhc:car/pg:dspcar";

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();



    }

    @Test
    public void CarSearchFormTest() throws InterruptedException {

        //CookiesAccept
        driver.findElement(By.xpath("//*[@id=\"mde-consent-modal-container\"]/div[2]/div[2]/div[1]/button")).click();
        Thread.sleep(1000);

        //Second-Hand Car Check
        WebElement usedCarCheck = driver.findElement(By.xpath("//*[@id=\"newCars_USED\"]"));
        usedCarCheck.click();
        Thread.sleep(1000);

        //Essential car details
               //Car Brand Select
        WebElement carBrandSelect = driver.findElement(By.xpath("//*[@id=\"makeModelVariant1Make\"]"));
        Select carBrandSelect1 = new Select(carBrandSelect);
        carBrandSelect1.selectByValue("3500");
        Thread.sleep(1000);

              //Car Model Select
        WebElement carModelSelect = driver.findElement(By.xpath("//*[@id=\"makeModelVariant1Model\"]"));
        Select carModelSelect1 = new Select(carModelSelect);
        carModelSelect1.selectByValue("10");
        Thread.sleep(3000);
        new Actions(driver)
                .scrollByAmount(0, 500)
                .perform();

        //Type of vehicle
        WebElement carTypeSelect = driver.findElement(By.xpath("/html/body/div[1]/div/section/form/div[4]/div/div/div[1]/div[3]/label"));
        carTypeSelect.click();
        Thread.sleep(2000);
        new Actions(driver)
                .scrollByAmount(0, 500)
                .perform();

        //Vehicle search
        WebElement minYearInput = driver.findElement(By.xpath("/html/body/div[1]/div/section/form/div[5]/div/div/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        minYearInput.sendKeys("2010");


        WebElement maxYearInput = driver.findElement(By.xpath("/html/body/div[1]/div/section/form/div[5]/div/div/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]"));
        maxYearInput.sendKeys("2015");
        Thread.sleep(1000);
        new Actions(driver)
                .scrollByAmount(0, 300)
                .perform();

        WebElement minPriceInput = driver.findElement(By.xpath("/html/body/div[1]/div/section/form/div[5]/div/div/div[1]/div[1]/div[3]/div[2]/div[1]/input[1]"));
        minPriceInput.sendKeys("5000");
        Actions minPriceEnter = new Actions(driver);
        minPriceEnter.sendKeys(Keys.ENTER).perform();
        Actions minPriceTab = new Actions(driver);
        minPriceTab.sendKeys(Keys.TAB).perform();
        Thread.sleep(1000);


        WebElement maxPriceInput = driver.findElement(By.xpath("/html/body/div[1]/div/section/form/div[5]/div/div/div[1]/div[1]/div[3]/div[2]/div[2]/input[1]"));
        maxPriceInput.sendKeys("9000");
        Actions maxPriceEnter = new Actions(driver);
        maxPriceEnter.sendKeys(Keys.ENTER).perform();
        Thread.sleep(1000);

        WebElement exteriorColour = driver.findElement(By.xpath("/html/body/div[1]/div/section/form/div[5]/div/div/div[2]/div[1]/div/div/button"));
        exteriorColour.click();

        WebElement colourSelect = driver.findElement(By.xpath("/html/body/div[1]/div/section/form/div[5]/div/div/div[2]/div[1]/div/div/div/ul/li[10]/a"));
        colourSelect.click();
        Thread.sleep(1000);
        new Actions(driver)
                .scrollByAmount(0, 300)
                .perform();

        //Engine
        WebElement fuelType = driver.findElement(By.id("fuelType_DIESEL"));
        fuelType.click();
        Thread.sleep(1000);
        new Actions(driver)
                .scrollByAmount(0, 300)
                .perform();

        //Regional Search
        WebElement countryImport = driver.findElement(By.xpath("/html/body/div[1]/div/section/form/div[7]/div/div/div[1]/div[1]/div/div/button"));
        countryImport.click();

        WebElement countrySelect = driver.findElement(By.xpath("/html/body/div[1]/div/section/form/div[7]/div/div/div[1]/div[1]/div/div/div/ul/li[4]/a"));
        countrySelect.click();
        Thread.sleep(1000);
        new Actions(driver)
                .scrollByAmount(0, 300)
                .perform();

        //Comfort and interior design
        WebElement isofixCheck = driver.findElement(By.id("features_ISOFIX"));
        isofixCheck.click();

        WebElement heatedSeatsCheck = driver.findElement(By.id("features_ELECTRIC_HEATED_SEATS"));
        heatedSeatsCheck.click();

        WebElement multifunctionalSteeringWheelCheck = driver.findElement(By.id("features_MULTIFUNCTIONAL_WHEEL"));
        multifunctionalSteeringWheelCheck.click();

        WebElement absCheck = driver.findElement(By.id("features_ABS"));
        absCheck.click();

        WebElement fogLightsCheck = driver.findElement(By.id("features_FRONT_FOG_LIGHTS"));
        fogLightsCheck.click();
        new Actions(driver)
                .scrollByAmount(0, 300)
                .perform();

        WebElement alloyWheelsCheck = driver.findElement(By.id("features_ALLOY_WHEELS"));
        alloyWheelsCheck.click();
        Thread.sleep(1000);
        new Actions(driver)
                .scrollByAmount(0, 500)
                .perform();

        //Display result
        WebElement displayResultsButton = driver.findElement(By.xpath("//*[@id=\"sticky-wrapper\"]/div/input"));
        displayResultsButton.click();
        Thread.sleep(3000);

        WebElement successfulSearch = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/section/section[1]/div"));
        Assert.assertTrue(successfulSearch.getText().contains("BMW 320 Break"));


    }




    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        //close browser
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
