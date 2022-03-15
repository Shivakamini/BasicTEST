package com.TestNGSampleScripts;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListernersClass implements ITestListener {

	public void onTestStart(ITestResult result)
	{
		System.out.println("test started");
		System.out.println(result.getName());
		
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("test successed");
		System.out.println(result.getName());
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("test Failured");
		System.out.println(result.getName());
	}
	public void onTestFailurewithSuccessPecentage(ITestResult result)
	{
		System.out.println("test FailuredwithSuccessed");
		System.out.println(result.getName());
	}
	public void onStart(ITestResult result)
	{
		System.out.println("test Onstarted");
		System.out.println(result.getName());
	}
	public void onFinish(ITestResult result)
	{
		System.out.println("test OnFinished");
		System.out.println(result.getName());
	}
}
