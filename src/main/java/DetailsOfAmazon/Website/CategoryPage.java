package DetailsOfAmazon.Website;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CategoryPage  {
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
	SoftAssert assertdetails=new SoftAssert();
	
@FindBy(id="p_36/range-slider_slider-item_upper-bound-slider")
WebElement priceslider;
@FindBy(xpath="//input[@class=\"a-button-input\"]")
WebElement go;
@FindBy(xpath="//span[.=\"Women's Casual Shoes\"]")
WebElement womenshoe;
@FindBy(xpath="//span[@class=\"a-color-state a-text-bold\"]")
WebElement verifybytext;

public void PriceSlider(WebDriver driver)
{
	assertdetails.assertEquals(priceslider.isDisplayed(), true);
	Point p1=priceslider.getLocation();
	int x=p1.getX();
	int y=p1.getY();
	System.out.println(x);
	System.out.println(y);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	int sliderwidth=priceslider.getSize().getWidth();
	System.out.println(sliderwidth);
	Actions a1=new Actions(driver);
	a1.perform();
	js.executeScript("window.scrollBy(-10, 0)");
	
}
public void Go(WebDriver driver)
{
	wait.until(ExpectedConditions.elementToBeClickable(go));
	assertdetails.assertEquals(go.isDisplayed(), true);
	go.click();
}
public void WomenShoe(WebDriver driver)
{
	
	wait.until(ExpectedConditions.elementToBeClickable(womenshoe));
	assertdetails.assertEquals(womenshoe.isDisplayed(), true);
	womenshoe.click();
}
public void VerifyByText(WebDriver driver)
{
	wait.until(ExpectedConditions.visibilityOf(verifybytext));
	assertdetails.assertEquals(verifybytext.isDisplayed(), true);
}
public CategoryPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
