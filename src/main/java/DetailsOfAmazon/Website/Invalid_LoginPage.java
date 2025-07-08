package DetailsOfAmazon.Website;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Invalid_LoginPage  {
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	@FindBy(name="email")
	WebElement un;
	@FindBy(className="a-button-input")
	WebElement Continuebutton;
	@FindBy(name="password")
	WebElement pwd;
	@FindBy(id="signInSubmit")
	WebElement signinbutton;
	@FindBy(xpath="//h4[.='There was a problem']")
	WebElement verifyingusingtext;
	
	
	public void Un(WebDriver driver)
	{
		wait.until(ExpectedConditions.visibilityOf(un));
		un.sendKeys("9052682352");
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
	public void VerifyingUsingText(WebDriver driver)
	{
		String text=verifyingusingtext.getText();
		System.out.println(text);
		Assert.assertEquals(text, "There was a problem");
	}
	
	public Invalid_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


}
