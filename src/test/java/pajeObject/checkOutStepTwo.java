package pajeObject;

import base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import stefDef.Hook;

import java.text.DecimalFormat;

public class checkOutStepTwo extends setup {

    DecimalFormat df = new DecimalFormat("0.00");

    public checkOutStepTwo (WebDriver driver){
        PageFactory.initElements(driver, this);
        setup.driver = driver;
    }

    @FindBy(how= How.ID, using = "finish")
    public WebElement FinishLocator;

    @FindBy(how= How.XPATH, using = "/html/body/div/div/div/div[2]/div/div[1]/div[4]/div[2]/a/div")
    public WebElement SauceLabsBackPackNameLocator;

    @FindBy(how= How.XPATH, using = "/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div")
    public WebElement SauceLabsBikeLightNameLocator;

    @FindBy(how= How.XPATH, using = "/html/body/div/div/div/div[2]/div/div[2]/div[7]")
    public WebElement totalPriceLocator;

    public void assertCkOutItems (){
        Assert.assertEquals(SauceLabsBikeLightNameLocator.getText(), Hook.item2, "checkout item2 error");
        Assert.assertEquals(SauceLabsBackPackNameLocator.getText(), Hook.item3, "checkout item3 error");
    }

    public void assertTotalPrice (){
        String actPrice = df.format(Double.parseDouble(totalPriceLocator.getText().substring(8)));
        Assert.assertEquals(actPrice, Hook.priceTotal, "Total Price Error");
    }

    public void clickFinishButton (){
        FinishLocator.click();
    }
}


