package DetailsOfAmazon.Website;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class MobileSearchPage {
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	SoftAssert assertdetails=new SoftAssert();
@FindBy(id="twotabsearchtextbox")
WebElement searchbox;


public void SearchBox(WebDriver driver)
{
	assertdetails.assertEquals(searchbox.isDisplayed(), true);
	wait.until(ExpectedConditions.visibilityOf(searchbox));
	searchbox.sendKeys("mobiles"+Keys.ENTER);
}


public MobileSearchPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
