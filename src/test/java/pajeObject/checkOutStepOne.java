package pajeObject;

import base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class checkOutStepOne extends setup{
    public checkOutStepOne (WebDriver driver) {
        PageFactory.initElements(driver, this);
        setup.driver = driver;
    }

    @FindBy(how = How.ID, using = "first-name")
    public WebElement FirstNameLocator;

    @FindBy(how = How.ID, using = "last-name")
    public WebElement LastNameLocator;

    @FindBy(how = How.ID, using = "postal-code")
    public WebElement PostalCodeLocator;

    @FindBy(how = How.ID, using = "continue")
    public WebElement continueLocator;


    public void enterFirstName(String firstname) {
        FirstNameLocator.sendKeys(firstname);
    }
    public void enterLastName(String lastname) {
        LastNameLocator.sendKeys(lastname);
    }
    public void enterPostalCode(String PostalCode) {
        PostalCodeLocator.sendKeys(PostalCode);
    }
    public void conChkOut (){
        continueLocator.click();
    }

}
