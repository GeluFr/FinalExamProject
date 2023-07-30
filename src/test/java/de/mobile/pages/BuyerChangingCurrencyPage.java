package de.mobile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BuyerChangingCurrencyPage extends BasePage{
    public BuyerChangingCurrencyPage(WebDriver driver) {
        super(driver);
    }

    //Currency button
    @FindBy(xpath = "//select[@id='currencies']") private WebElement usdSelect;
    public void currencySelectUSD(){
        Select usdSelect1 = new Select(usdSelect);
        usdSelect1.selectByValue("USD");
    }

    //Verify currency has changed
    @FindBy(className = "buyer-currency u-text-grey-60") private WebElement verifyChange;
    public boolean currencyChangedSuccessfully(){
        return verifyChange.getText().contains("USD");
    }
}
