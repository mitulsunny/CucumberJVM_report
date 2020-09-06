package com.osa.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
		features="src/test/java/com/osa/features",
		glue="com.osa.steps",
		plugin= {"json:target/cucumber.json"}
		
		)
public class Run extends AbstractTestNGCucumberTests{

}
