package glue.stepdef.smoke.trino;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TrinoTpcdsSmokeTestDefinition {
    @Given("Trino is configured with {int} workers")
    public void trinoIsConfiguredWithWorkers(Integer numberOfWorkers) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        //ExtentCucumberAdapter.addTestStepLog("Link to realtime progress: localhost:8088");

    }
//    @Given("Login user is already provided")
//    public void loginUserIsAlreadyProvided() {
//        // Write code here that turns the phrase above into concrete actions
//        //throw new io.cucumber.java.PendingException();
//    }
    @When("{int} TPC-DS benchmark queries are run")
    public void tpcDSBenchmarkQueriesAreRun(Integer numberOfQueries) {
        System.out.println("###### Sleeping to see if Given is shown in UI");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals("actual", "expected");
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("Report of time taken by each query should be returned")
    public void reportOfTimeTakenByEachQueryShouldBeReturned() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("actual", "expected");
        throw new io.cucumber.java.PendingException();
    }

}
