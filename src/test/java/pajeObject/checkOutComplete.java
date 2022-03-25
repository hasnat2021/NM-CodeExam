package pajeObject;

import base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import stefDef.Hook;

public class checkOutComplete extends setup {
    public checkOutComplete(WebDriver driver) {
        PageFactory.initElements(driver, this);
        setup.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div/div[2]/h2")
    public WebElement SuccessMessageLocator;


    public void assertSuccessMessage() {
        Assert.assertEquals(SuccessMessageLocator.getText(), Hook.successMessage, "Error");
    }

}
