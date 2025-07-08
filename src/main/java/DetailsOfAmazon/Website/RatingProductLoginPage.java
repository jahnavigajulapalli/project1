package DetailsOfAmazon.Website;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RatingProductLoginPage {
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	@FindBy(name="email")
	WebElement username;
	@FindBy(className="a-button-input")
	WebElement Continuebutton;
	@FindBy(name="password")
	WebElement pwd;
	@FindBy(id="signInSubmit")
	WebElement signinbutton;
	
	public void Un(WebDriver driver)
	{
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("9052682352");
		Assert.assertEquals(Continuebutton.isDisplayed(), true);
	}
	public void ContinueButton(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(Continuebutton));
		Continuebutton.click();
	}
	public void Pwd(WebDriver driver)
	{
		wait.until(ExpectedConditions.visibilityOf(pwd));
		pwd.sendKeys("phi@123");
	}
	public void SigninButton(WebDriver driver)
	{
		signinbutton.click();
	}

}
