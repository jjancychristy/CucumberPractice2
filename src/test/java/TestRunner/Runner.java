package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature",
glue="stepDefinition" ,plugin = {"html:target/cucumber-reports.html"},
tags="@Regression")
public class Runner {

}
