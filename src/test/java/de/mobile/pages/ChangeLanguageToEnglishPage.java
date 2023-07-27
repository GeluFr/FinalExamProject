package de.mobile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangeLanguageToEnglishPage extends BasePage{
    public ChangeLanguageToEnglishPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/header/div[2]/nav/div/ul[1]/li[3]/span") private WebElement langSelect;
    public void languageSelect(){
        langSelect.click();
    }
    @FindBy(xpath = "/html/body/header/div[2]/nav/div/ul[1]/li[3]/ul/li[2]/a") private WebElement engSelect;
    public void englishSelect(){
        engSelect.click();
    }
    @FindBy(xpath = "//*[@id=\"root\"]/header/div[1]/div[1]/div/div") private WebElement verifyLang;
    public boolean languageChangeSuccessfully(){
        return verifyLang.getText().contains("Germany's biggest vehicle marketplace");
    }
}
