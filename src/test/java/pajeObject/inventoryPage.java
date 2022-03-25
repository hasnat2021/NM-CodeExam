package pajeObject;

import base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import stefDef.Hook;

public class inventoryPage extends setup{

    public inventoryPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        setup.driver = driver;
    }
    @FindBy(how= How.XPATH, using = "//select[@class='product_sort_container']/option[3]")
    public WebElement sorterLocator;

    @FindBy(how= How.CSS, using = "[class='btn btn_primary btn_small btn_inventory']")
    public WebElement SauceLabBikeLight;

    @FindBy(how= How.ID, using = "add-to-cart-sauce-labs-onesie")
    public WebElement SauceLabOnesie;


    @FindBy(how= How.CLASS_NAME, using = "shopping_cart_link")
    public WebElement AddToCartLocator;

    @FindBy(how= How.ID, using = "add-to-cart-sauce-labs-backpack")
    public WebElement SauceLabsBackpack;

    public void selectLowHighSorter (){
        sorterLocator.click();
    }

    public void addToCartBikeLight(){
        SauceLabBikeLight.click();
    }
    public void addToCartSauceLabOnsie(){
        SauceLabOnesie.click();
    }

    public void visitCartItem () {
        AddToCartLocator.click();
    }

    public void addBackPackToCart(){
        SauceLabsBackpack.click();
    }

    public void assertTitle (){
        Assert.assertEquals(driver.getTitle(), Hook.ipTitle, "Login Error");
    }

}



