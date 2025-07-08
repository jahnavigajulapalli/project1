package DetailsOfAmazon.Website;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
//import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerLogic implements ITestListener{
	
	public static WebDriver driver;

	@Override
	public void onTestSuccess(ITestResult result) {
	
		ITestListener.super.onTestSuccess(result);
		
		Reporter.log("Testcase is passed");
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		String format=d2.toString();
		String date=format.substring(8, 10);
		String month=format.substring(4,7);
		String year=format.substring(format.length()-1);
		String hour=format.substring(11,13);
		String min=format.substring(14,16);
		String format1=date.concat(month).concat(year).concat(hour).concat(min);
		
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File source= screenshot.getScreenshotAs(OutputType.FILE);
		File Destination=new File("C:\\Users\\quali\\eclipse-workspace\\Website\\Screenshot\\PassesTestCases\\"+new ListenerLogic().getClass()+format1+".png");
		try {
			FileHandler.copy(source, Destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		
		Reporter.log("Testcase is failed");
		
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		String format=d2.toString();
		String date=format.substring(8, 10);
		String month=format.substring(4,7);
		String year=format.substring(format.length()-1);
		String hour=format.substring(11,13);
		String min=format.substring(14,16);
		String format1=date.concat(month).concat(year).concat(hour).concat(min);
		
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File source= screenshot.getScreenshotAs(OutputType.FILE);
		File Destination=new File("C:\\Users\\quali\\eclipse-workspace\\Website\\Screenshot\\FailedTestCases\\"+new ListenerLogic().getClass()+format1+".png");
		try {
			FileHandler.copy(source, Destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
