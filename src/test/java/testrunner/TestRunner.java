package testrunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features={"C:\\Users\\AmanKumar\\eclipse-workspace\\Maven_Test1\\src\\test\\resources\\Login\\Login.feature"},
glue= {"stepdefinition"},
//tags="@validcase",
monochrome=true,//to make the console output in a better format
//dryRun=true,
dryRun=false,//to check all the methods have been implemented properly
strict=true//to check did i miss any steps is all fine
,plugin= {"html:testoutput/testoutput.html","junit:testoutput/cucumber.xml","json:testoutput/cucumber.json"}
) 
public class TestRunner {
}
