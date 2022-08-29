package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.logs.Log;

public class LoadTestTrino extends BaseTest {
    @Test(groups = {"Load"}, description = "Trino load test using K6")
    public void trinoLoadTestWithTpcdsBenchmark(Method method) {
        //ExtentReports Description
        //startTest(method.getName(), "Locust Load testing for Trino");
        Log.info("Start locust test");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        org.testng.Assert.assertEquals("actual", "expected", "Load test failed - ");

        // homePage
        //     .goToN11()
        //     .goToLoginPage()
        //     .loginToN11("onur@swtestacademy.com", "11122233444")
        //     .verifyLogError();
    }

    // @Test(priority = 1, description = "Invalid Login Scenario with empty username and password.")
    // public void invalidLoginTest_EmptyUserEmptyPassword(Method method) {
    //     //ExtentReports Description
    //     //startTest(method.getName(), "Invalid Login Scenario with empty username and password.");

    //     // homePage
    //     //     .goToN11()
    //     //     .goToLoginPage()
    //     //     .loginToN11("", "")
    //     //     .verifyLoginUserName("Lütfen e-posta adresinizi girin.")
    //     //     .verifyLoginPassword("WRONG MESSAGE FOR FAILURE!");
    // }
}