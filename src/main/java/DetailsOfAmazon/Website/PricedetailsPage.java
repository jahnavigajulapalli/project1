package DetailsOfAmazon.Website;

import java.time.Duration;

//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class PricedetailsPage {
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	SoftAssert assertdetails=new SoftAssert();

@FindBy(xpath="(//img[@data-image-index=\"1\"])[1]")
WebElement mobile;
@FindBy(xpath="(//span[contains(text(), \"ratings\")])[1]")
WebElement review;
@FindBy(xpath="//h1[.=' About this item ']")
WebElement description;
@FindBy(xpath="(//span[@class=\"a-price-whole\"])[5]")
WebElement price;
@FindBy(xpath="//a[@id=\"nav-orders\"]")
WebElement verifying;

public void Mobile(WebDriver driver)
{
	assertdetails.assertEquals(mobile.isDisplayed(), true);
	wait.until(ExpectedConditions.elementToBeClickable(mobile));
	mobile.click();
	//assertdetails.assertEquals(mobile.isDisplayed(), true);
}
public void Review(WebDriver driver)
{
	wait.until(ExpectedConditions.visibilityOf(review));
	assertdetails.assertEquals(review.isDisplayed(),true);	
}
public void Description(WebDriver driver)
{
	wait.until(ExpectedConditions.visibilityOf(description));
	assertdetails.assertEquals(description.isDisplayed(), true);
}
public void price(WebDriver driver)
{
	wait.until(ExpectedConditions.visibilityOf(price));
	assertdetails.assertEquals(price.isDisplayed(), true);
}
public void Verifying(WebDriver driver)
{
	assertdetails.assertEquals(verifying.isDisplayed(), true);
}
public PricedetailsPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
