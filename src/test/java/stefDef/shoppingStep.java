package stefDef;

import base.setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pajeObject.*;

public class shoppingStep extends setup {

    loginPage lp = new loginPage (driver);
    inventoryPage ip = new inventoryPage(driver);
    checkOutStepOne ck1 = new checkOutStepOne(driver);
    checkOutStepTwo ck2 = new checkOutStepTwo(driver);
    checkOutComplete ckcomp = new checkOutComplete(driver);
    cartPage cp = new cartPage(driver);

    @Given("I am at saucedemo homepage")
    public void iAmAtSaucedemoHomepage() {
        lp.verifyHomepageTitle();
    }

    @And("I enter valid username")
    public void iEnterValidUsername() {
        lp.enterUserName(Hook.userName);

    }

    @And("I enter valid password")
    public void iEnterValidPassword() {
      lp.enterPassword(Hook.password);
    }

    @When("I click on Login button")
    public void iClickOnLoginButton() {
        lp.clickLoginButton();
    }

    @Then("I should be able to login successfully")
    public void iShouldBeAbleToLoginSuccessfully() {
        ip.assertTitle();
    }

    @And("I sort the items lowest price sort")
    public void iSortTheItemsLowestPriceSort() {
        ip.selectLowHighSorter();
    }

    @When("I added two items to the shopping cart")
    public void iAddedTwoItemsToTheShoppingCart() {
         ip.addToCartSauceLabOnsie();
         ip.addToCartBikeLight();
    }

    @Then("I visit the shopping cart")
    public void iVisitTheShoppingCart() {
        ip.visitCartItem();
    }

    @And("I assert that the items that I added are in the cart")
    public void iAssertThatTheItemsThatIAddedAreInTheCart() {
        cp.assertCartItems();
    }

    @Then("I remove an item and then continue shopping")
    public void iRemoveAnItemAndThenContinueShopping() {
        cp.romoveOnseie();
        cp.continueShopping();
    }

    @And("I add another item")
    public void iAddAnotherItem() {
        ip.addBackPackToCart();
    }

    @Then("I do checkout")
    public void iDoCheckout() {
        ip.visitCartItem();
        cp.clickCheckout();
    }

    @And("I assert that I am purchasing the correct items")
    public void iAssertThatIAmPurchasingTheCorrectItems() {
        ck1.enterFirstName("Abu");
        ck1.enterLastName("Hasnat");
        ck1.enterPostalCode("12345");
        ck1.conChkOut();
        ck2.assertCkOutItems();
    }

    @And("I assert the total price")
    public void iAssertTheTotalPrice() {
        ck2.assertTotalPrice();
    }


    @When("I click on finish button")
    public void iClickOnFinishButton() {
        ck2.clickFinishButton();
    }

    @Then("I finish checkout")
    public void iFinishCheckout() {
        ckcomp.assertSuccessMessage();
    }



}
