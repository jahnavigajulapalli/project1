package DetailsOfAmazon.Website;

import java.time.Duration;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonClass extends ListenerLogic {
	
	@BeforeMethod
	public void starting() {
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		
	}
	@AfterMethod
	public void closing() {
		//driver.close();
	}

}
