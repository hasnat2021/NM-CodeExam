package stefDef;


import base.setup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.util.Strings;

public class Hook extends setup {

    public static String ipTitle = "Swag Labs";
    public static String item1 = "Sauce Labs Onesie";
    public static String item2= "Sauce Labs Bike Light";
    public static String item3 = "Sauce Labs Backpack";
    public static String priceTotal = "43.18";
    public static String successMessage = "THANK YOU FOR YOUR ORDER";
    public static String url;
    public static String userName;
    public static String password;
    public static String driverType = System.getProperty("browser");
    public static String envData = System.getProperty("env");

    @Before
    public void startTest(){
        if (Strings.isNullOrEmpty(driverType)){
            driverType = "ch";
        }
        if (Strings.isNullOrEmpty(envData)){
            envData="qa";
        }
        driver = setupBrowser(driverType);
        switch (envData){
            case "qa":
                url = "https://www.saucedemo.com/";
                userName = "standard_user";
                password = "secret_sauce";
                break;
            case "stage":
                url = "https://www.saucedemo.com/";
                break;
            case "prod":
                url = "https://www.saucedemo.com/";
                break;
        }
        driver.get(url);
    }

    @After
    public void endTest(){
        //driver.close();
    }
}