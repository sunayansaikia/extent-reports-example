package glue.stepdef.load.trino;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TrinoTpcdsLoadTestDefinition {
    @Given("Trino is configured with {int} workers")
    public void trinoIsConfiguredWithWorkers(Integer numberOfWorkers) {
        ExtentCucumberAdapter.addTestStepLog("Link to realtime progress: localhost:8088");
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
//    @Given("Login user is already provided")
//    public void loginUserIsAlreadyProvided() {
//        // Write code here that turns the phrase above into concrete actions
//        //throw new io.cucumber.java.PendingException();
//    }
    @When("{int} TPC-DS benchmark queries are run")
    public void tpcDSBenchmarkQueriesAreRun(Integer numberOfQueries) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("Report of time taken by each query should be returned")
    public void reportOfTimeTakenByEachQueryShouldBeReturned() {
        // Write code here that turns the phrase above into concrete actions
        //Assert.assertEquals("actual", "expected");
        //throw new io.cucumber.java.PendingException();
        ExtentCucumberAdapter.addTestStepLog(MarkupHelper.createLabel("Report", ExtentColor.BLUE));
        String[][] table = new String[][]{{"Query 1","40s"},{"Query 2","60s"},{"Query 3","200s"},{"Query 4","100s"}};
        ExtentCucumberAdapter.addTestStepLog(MarkupHelper.createTable(table));
    }

}
