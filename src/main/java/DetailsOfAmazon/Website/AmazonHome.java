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

public class AmazonHome {
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
	@FindBy(xpath="//span[.='Hello, sign in']")
	WebElement signinoption;
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement signin;
	@FindBy(xpath="//input[@class=\"a-button-input\"]")
	WebElement verify;
	
	public void HoverOverSigninOption(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(signinoption).perform();
	}
	public void SignIn(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(signin));
		signin.click();
		
	}
	public void Verify(WebDriver driver)
	{
		Assert.assertEquals(verify.isDisplayed(), true);
	}
	public AmazonHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
