package pajeObject;

import base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class loginPage extends setup {
    public loginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        setup.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//input[@id='user-name']")
    public WebElement userNameLocator;

    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    public WebElement passwordLocator;

    @FindBy(how = How.XPATH, using = "//input[@id='login-button']")
    public WebElement loginButtonLocator;

    public void enterUserName(String userName) {
        userNameLocator.sendKeys("standard_user");
    }

    public void enterPassword(String Password) {
        passwordLocator.sendKeys("secret_sauce");
    }
    public void clickLoginButton () {
        loginButtonLocator.click();
    }
    public void verifyHomepageTitle() {
        String act = driver.getTitle();
        String exp = "Swag Labs";
        Assert.assertEquals(exp, act);
    }


}