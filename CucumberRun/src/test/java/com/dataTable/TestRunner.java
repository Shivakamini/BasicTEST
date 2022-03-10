package com.dataTable;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\Features\\DataTable.feature",dryRun=false,plugin="html:cucumberReports.html",monochrome=true)
public class TestRunner extends AbstractTestNGCucumberTests {

}
