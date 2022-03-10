package com.Baisc;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\Features\\Basic.feature",dryRun=false,plugin="html:cucumberReports.html",monochrome=true)
public class TestRunner extends AbstractTestNGCucumberTests {

}