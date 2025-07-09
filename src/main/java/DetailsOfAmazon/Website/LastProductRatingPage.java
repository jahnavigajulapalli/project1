package DetailsOfAmazon.Website;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class LastProductRatingPage {
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	SoftAssert assertdetails=new SoftAssert();
	@FindBy(xpath="//span[@class=\"a-button-text a-declarative\"]")
	WebElement orders;
	@FindBy(xpath="//a[@id=\"time-filter_2\"]")
	WebElement allorders;
@FindBy(xpath="(//a[@class='a-button-text'])[2]")
WebElement view;
@FindBy(xpath="(//a[@class='a-size-base-plus a-link-normal'])[1]")
WebElement details;
@FindBy(xpath="(//i[@class=\"a-icon a-icon-star-mini a-star-mini-5 mvt-cm-cr-review-stars-mini\"])[1]")
WebElement review;


public void Orders(WebDriver driver)
{
	orders.click();
}
public void AllOrders(WebDriver driver)
{
	allorders.click();
}
public void View(WebDriver driver)
{
	wait.until(ExpectedConditions.elementToBeClickable(view));
	assertdetails.assertEquals(view.isDisplayed(), true);
	view.click();
}
public void Details(WebDriver driver)
{
	wait.until(ExpectedConditions.elementToBeClickable(details));
	assertdetails.assertEquals(details.isDisplayed(), true);
	details.click();
}
public void Review(WebDriver driver)
{
	Actions a1=new Actions(driver);
	a1.moveToElement(review).perform();
	wait.until(ExpectedConditions.elementToBeClickable(review));
	assertdetails.assertEquals(review.isDisplayed(), true);
}

public LastProductRatingPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
