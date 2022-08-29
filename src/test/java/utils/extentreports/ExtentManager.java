package utils.extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;

public class ExtentManager {
    public static final ExtentReports extentReports = new ExtentReports();

    public synchronized static ExtentReports createExtentReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html")
        .viewConfigurer().viewOrder().as(new ViewName[] { ViewName.CATEGORY, ViewName.DASHBOARD, ViewName.LOG, ViewName.TEST })
        .apply();
        reporter.config().setOfflineMode(true);
        reporter.config().setTheme(Theme.DARK);
        reporter.config().setEncoding("utf-8");
        reporter.config().setReportName("Load Test report");
        reporter.config().setDocumentTitle("Load tests");
        reporter.config().setCss(
        ".test-status { color: #2bdd87 !important; }" +
        ".pass-bg { background-color: #437805 }" +
        ".badge.log { color: #f0f5f0 }"+
        ".badge-success { background-color: #118385 }" +
        ".badge-danger { background-color: #cf415c }" +
        ".badge-primary { background-color: #565ae3 }" +
        ".fail-bg { background-color: ##a55050 }" +
        ".info-bg { background-color: #1373a7}"); //
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Platform Name", "ADAK8S");
        extentReports.setSystemInfo("Platform type", "UAT");

        return extentReports;
    }
}
