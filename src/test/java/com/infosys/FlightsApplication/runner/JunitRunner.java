package com.infosys.FlightsApplication.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) //this junit annotation that specifies which 
//runner it has to execute the class
@CucumberOptions(features=".//Features//sprint2.feature"
   ,glue="com.infosys.FlightsApplication.stepsDefinitions"
   ,monochrome=true
   //,dryRun=true
  ,tags= {"@smoke"}
   ,plugin ={"json:target/cucumber.json","html:target/site/cucumber-pretty"}
   ) //this annotation provides some 
//important information which will be used to run your cucumber feature
//file
public class JunitRunner {

}
