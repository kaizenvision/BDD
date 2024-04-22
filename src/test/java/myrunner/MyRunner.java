package myrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
glue = {"/stepDefination","runners"},
plugin = {"pretty", "html:target/cucumber-reports/report.html","json:target/MyReports/report.json","junit:target/MyReports/report.xml"})
public class MyRunner {

}
