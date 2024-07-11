package test_manager.base_test;

import application.test_steps.Login_Steps;
import application.test_steps.Pending_Steps;
import org.testng.annotations.*;
import utilities.Driver.DriverType;
import utilities.Logger.LoggingUtils;

import static utilities.Driver.DriverManager.*;

public class BaseTest {
    // protected Home_Steps homeSteps;
    // protected Shipping_Steps shippingSteps;
    // protected Cart_Steps cartSteps;
    protected Login_Steps loginSteps;
    protected Pending_Steps pendingSteps;
    protected Pending_Steps PendingCreateKYC;


    @Parameters("browser")
    @BeforeClass (alwaysRun = true)
    public void setUp(final String browser) throws InterruptedException {
        if (browser == null || browser.isEmpty()) {
            throw new IllegalArgumentException("Browser parameter cannot be null or empty");
        }
        LoggingUtils.info("base test browser type: "+browser.toUpperCase());
//        initializeDriver(DriverType.valueOf("REMOTE_CHROME"));
        initializeDriver(DriverType.valueOf(browser.toUpperCase()));
        getDriver().manage().deleteAllCookies();
        Thread.sleep(3000);
        getDriver().get(System.getProperty("targetUrl"));
        LoggingUtils.info("Redirecting back to home");

        // homeSteps = new Home_Steps();
        // shippingSteps = new Shipping_Steps();
        // cartSteps = new Cart_Steps();
        loginSteps = new Login_Steps();
        pendingSteps = new Pending_Steps();
        PendingCreateKYC = new Pending_Steps();

    }
    private void initializeDriver(DriverType driverType) {
        createDriver(driverType);
    }


    @BeforeMethod(alwaysRun = true)
    public void setUpTests(){
        getDriver().get(System.getProperty("targetUrl"));
    }

    @AfterMethod(alwaysRun = true)
    public void clean(){
        getDriver().manage().deleteAllCookies();
    }
    @AfterClass(alwaysRun = true)
    public void tearDown () {
        closeWebBrowser();
    }
}