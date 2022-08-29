package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.logs.Log;

import static io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE;

@CucumberOptions(
		dryRun=false
		,features = "src/test/resources/smoke_tests"
		,glue = {"glue.stepdef.smoke"}
		,tags = "@Load or @Smoke" //if 'and' is used then both the tags should be present in the scenerio, cmd line --tags
		//,plugin = { "pretty", "summary"}, snippets = CAMELCASE
		,plugin = {"utils.cucumber.listeners.CustomReportListener","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "pretty", "summary"}, snippets = CAMELCASE
		//,plugin = {"utils.cucumber.listeners.CustomReportListener","com.aventstack.extentreports.cucumber.adapter.CustomExtentCucumberAdapter:", "pretty", "summary"}, snippets = CAMELCASE
		//,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		,monochrome = false //true = enables readable black-white format
		,publish = false //true = publish to cloud reports.cucumber.io.
		)
public class TrinoSmokeTestCucumberRunner /*extends AbstractTestNGCucumberTests*/ {

	private TestNGCucumberRunner testNGCucumberRunner;


//	public void classLevelSetup() {
//
//		//driver = new ChromeDriver();
//		startTest("Locust Load testing for Trino", "Locust Load testing for Trino");
////		XmlTest currentXmlTest = context.getCurrentXmlTest();
////		Objects.requireNonNull(currentXmlTest);
////		CucumberPropertiesProvider properties = currentXmlTest::getParameter;
//		this.testNGCucumberRunner = new TestNGCucumberRunner(this.getClass(), properties);
//	}

	@BeforeClass(alwaysRun = true)
	public void setUpClass(ITestContext context) {
		Log.info("Smoke Tests are starting!");
//		XmlTest currentXmlTest = context.getCurrentXmlTest();
//		Objects.requireNonNull(currentXmlTest);
//		CucumberPropertiesProvider properties = currentXmlTest::getParameter;
		//startTest("Locust Load testing for Trino", "Locust Load testing for Trino");
//		this.testNGCucumberRunner = new TestNGCucumberRunner(this.getClass(), properties);
		this.testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(
			groups = {"cucumber"},
			description = "Runs Cucumber Feature",
			dataProvider = "features"
	)
	public void runScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
		this.testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
	}

	@DataProvider
	public Object[][] features() {
		return this.testNGCucumberRunner == null ? new Object[0][0] : this.testNGCucumberRunner.provideScenarios();
	}

	@AfterClass(
			alwaysRun = true
	)
	public void tearDownClass() {
		if (this.testNGCucumberRunner != null) {
			this.testNGCucumberRunner.finish();
		}
	}

}