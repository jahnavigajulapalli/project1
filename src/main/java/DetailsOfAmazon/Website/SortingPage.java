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

public class SortingPage {
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	SoftAssert assertdetails=new SoftAssert();
	
	@FindBy(xpath="//span[@class='a-dropdown-label']")
	WebElement dropdown;
	@FindBy(xpath="//a[.='Price: Low to High']")
	WebElement price;
	@FindBy(xpath="//span[@class='a-dropdown-label']")
	WebElement dropdown1;
	@FindBy(xpath="(//a[.='Price: High to Low'])[2]")
	WebElement review;
	@FindBy(xpath="//span[@class='a-dropdown-label']")
	WebElement dropdown2;
	@FindBy(xpath="//h2[.='Results']")
	WebElement verifybytext;
	
	public void DropDown(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(dropdown));
		assertdetails.assertEquals(dropdown.isDisplayed(), true);
		dropdown.click();
	}

	public void Price(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(price));
		//assertdetails.assertEquals(price.isDisplayed(), true);
		price.click();
	}
	public void DropDown1(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(dropdown1));
		assertdetails.assertEquals(dropdown1.isDisplayed(), true);
		dropdown1.click();
		
	}
	public void Review(WebDriver driver)
	{
		price.sendKeys(Keys.ARROW_DOWN);
		//price.sendKeys(Keys.ARROW_DOWN);
		//review.sendKeys(Keys.ARROW_DOWN);
		price.click();
		
	}
	public void DropDown2(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(dropdown2));
		assertdetails.assertEquals(dropdown2.isDisplayed(), true);
		dropdown2.click();
		
	}
	public void VerifyByText(WebDriver driver)
	{
		assertdetails.assertEquals(verifybytext.getText(), "Results");
	}

	public SortingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

