package com.steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions( features="FeatureFiles/Hooks.feature"  ,   glue= "com.Login",
dryRun=false,monochrome=true,plugin={"html:report/WebReport","json:report/jsonreport.json",
"junit:report/xmlreport.xml"})
public class Tryrunner {
 
}
