package testRunners;


//import com.cucumber.listener.Reporter;
import com.cucumberTest.utils.ExtentReportListener;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Listeners;

import java.io.File;

@Listeners(ExtentReportListener.class)
@CucumberOptions(
// plugin = { "html:target/cucumber-html-report",
//        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
//        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml"},
//        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
//        plugin = {"com.sitture.ExtentFormatter:output/extent-report/index.html", "html:output/html-report"},
        monochrome = true,
        features = "src/test/resources/features",
        glue = "stepsDef",
        tags = "@RegressionTest"
)
public class TestNGRunner extends AbstractTestNGCucumberTests {
//    @Before
//    public void startDriver(){
//        DriverManager.getInstance();
//    }

    @After
    public void closeDriver(){
//        DriverManager.close();
//        Reporter.loadXMLConfig(PropertyLoader.getProperty(PropertyLoader.REPORT_CONFIG_PATH));
//        ExtentReporter.setConfig(new File("src/main/resources/extent_report_config.xml"));
    }
}
