package tests;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"abcd"}, 
monochrome=true, plugin= {"pretty","html:target/report.html"})
public class RunnerTest {

}
