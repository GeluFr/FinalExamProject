package de.mobile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //Username Input
    @FindBy(id = "login-username") private WebElement userLog;
    public void usernameInput(String username){
        userLog.sendKeys(username);
    }

    //Password Input
    @FindBy(id = "login-password") private WebElement passInput;
    public void passwordInput(String password){
        passInput.sendKeys(password);
    }

    //Login button
    @FindBy(id = "login-submit") private WebElement subLog;
    public void submitLogin(){
        subLog.click();
    }

    //Verify login

    @FindBy(xpath = "//*[@id=\"root\"]/header/div[1]/div[3]/div/div[1]/div[2]/button") private WebElement verLog;
    public boolean loginSuccessfully(){
        return verLog.isDisplayed();
    }
}
