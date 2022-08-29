package utils.extentreports;

import java.util.HashMap;
import java.util.Map;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

/**
 * extentTestMap holds the information of thread ids and ExtentTest instances.
 * ExtentReports instance created by calling createExtentReports() method from ExtentManager.
 * At startTest() method, an instance of ExtentTest created and put into extentTestMap with current thread id.
 * At getTest() method, return ExtentTest instance in extentTestMap by using current thread id.
 */
public class ExtentTestManager {
    static Map<Integer, ExtentTest> extentTestMap = new HashMap<>();
    static ExtentReports  extent = ExtentManager.createExtentReports();

    public static synchronized ExtentTest getTest() {
        System.out.println("### Thread id: "+Thread.currentThread().getId());
        ExtentTest extentTest = extentTestMap.get((int) Thread.currentThread().getId());
        if(extentTest == null){
            System.out.printf("######## Can't continue.......");
            System.exit(1);
        }
        return extentTest;
    }

    public static synchronized ExtentTest startTest(String testName, String desc) {
        ExtentTest test = extent.createTest(testName, desc).assignCategory("Load test");
        System.out.println("### Write Thread id: "+Thread.currentThread().getId());
        extentTestMap.put((int) Thread.currentThread().getId(), test);
        return test;
    }
}