package de.mobile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;
    public   static String ADVANCEDFORM_URL = "https://www.mobile.de/ro/c%C4%83utare-detaliat%C4%83/nou/vhc:car/pg:dspcar";
    public static String SAVESEARCH_URL = "https://www.mobile.de/ro";

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
