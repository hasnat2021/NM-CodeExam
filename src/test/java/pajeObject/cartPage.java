package pajeObject;

import base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import stefDef.Hook;

public class cartPage extends setup{
    public cartPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        setup.driver = driver;
    }

    @FindBy(how= How.XPATH, using = "/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div")
    public WebElement SauceLabsOnesieNameLocator;

    @FindBy(how= How.XPATH, using = "/html/body/div/div/div/div[2]/div/div[1]/div[4]/div[2]/a/div")
    public WebElement SauceLabsBikeLightNameLocator;

    @FindBy(how= How.XPATH, using = "/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/button")
    public WebElement SauceLabsOnesieRemoval;

    @FindBy(how= How.ID, using = "continue-shopping")
    public WebElement continueshoppingButton;

    @FindBy(how= How.ID, using = "checkout")
    public WebElement checkOutButton;

    public void romoveOnseie () {
        SauceLabsOnesieRemoval.click();
    }

    public void continueShopping () {
        continueshoppingButton.click();
    }

    public void clickCheckout (){
        checkOutButton.click();
    }

    public void assertCartItems () {
        Assert.assertEquals(SauceLabsOnesieNameLocator.getText(), Hook.item1, "item1 Error");
        Assert.assertEquals(SauceLabsBikeLightNameLocator.getText(), Hook.item2, "item2 Error");
    }
}
