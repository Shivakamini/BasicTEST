package com.HooksTags;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\Features\\APSRTCHooksTags.feature",tags="@SmokeTest and @RegressionTest",dryRun=false,plugin="html:cucumberReports.html",monochrome=true)
public class TestRunner extends AbstractTestNGCucumberTests {

}
