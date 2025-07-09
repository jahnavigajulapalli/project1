package DetailsOfAmazon.Website;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class CommonClass extends ListenerLogic {
	@Parameters("browsers")
	@BeforeMethod
	public void starting(String browsername) 
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.amazon.in");
		}
		if(browsername.equalsIgnoreCase("edge"))
		{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		}
		if(browsername.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.amazon.in");
			}
		}
	
	@AfterMethod
	public void closing() {
		//driver.close();
	}

}