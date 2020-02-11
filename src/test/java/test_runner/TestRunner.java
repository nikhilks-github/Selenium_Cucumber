package test_runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features= {"Feature\\Demo.Feature","Feature\\Register.Feature"}, glue= {"stepDef"}, plugin = {"html:target\\report.html"}, monochrome = true)
public class TestRunner {

}
