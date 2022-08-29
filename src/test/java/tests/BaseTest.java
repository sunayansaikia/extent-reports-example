package tests;

import static utils.extentreports.ExtentTestManager.startTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import utils.logs.Log;

public class BaseTest {
    //public WebDriver driver;
   // public HomePage  homePage;

    // public WebDriver getDriver() {
    //     return driver;
    // }

    @BeforeClass
    public void classLevelSetup() {
        Log.info("Tests is starting!");
        //driver = new ChromeDriver();
        //startTest("Locust Load testing for Trino", "Locust Load testing for Trino");
    }

    @BeforeMethod
    public void methodLevelSetup() {
        //homePage = new HomePage(driver);
    }

    @AfterClass
    public void teardown() {
        Log.info("Tests are ending!");
        //driver.quit();
    }
}