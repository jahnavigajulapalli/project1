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

public class RatingProductLoginPage {
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	@FindBy(xpath="//a[@id=\"nav-orders\"]")
	WebElement signin;
	@FindBy(name="email")
	WebElement username;
	@FindBy(className="a-button-input")
	WebElement continuebutton;
	@FindBy(name="password")
	WebElement pwd;
	@FindBy(id="signInSubmit")
	WebElement signinbutton;
	
	public void Signin(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(signin).perform();
		wait.until(ExpectedConditions.elementToBeClickable(signin));
		Assert.assertEquals(signin.isDisplayed(), true);
		signin.click();
		
	}
	public void Un(WebDriver driver)
	{
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("7337416795");
		
	}
	public void ContinueButton(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(continuebutton));
		Assert.assertEquals(continuebutton.isDisplayed(), true);
		continuebutton.click();
	}
	public void Pwd(WebDriver driver)
	{
		wait.until(ExpectedConditions.visibilityOf(pwd));
		Assert.assertEquals(pwd.isDisplayed(), true);
		pwd.sendKeys("Ruthvika@04");
	}
	public void SigninButton(WebDriver driver)
	{
		wait.until(ExpectedConditions.visibilityOf(signinbutton));
		Assert.assertEquals(signinbutton.isDisplayed(), true);
		signinbutton.click();
	}
	
	public RatingProductLoginPage(WebDriver driver) 
	
	{
		PageFactory.initElements(driver, this);
	}

}
