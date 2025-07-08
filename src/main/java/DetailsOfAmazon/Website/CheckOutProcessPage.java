package DetailsOfAmazon.Website;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CheckOutProcessPage {
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	SoftAssert assertdetails=new SoftAssert();
	
	@FindBy(xpath="(//a[@data-csa-c-content-id='sw-gtc_CONTENT'])[1]")
	WebElement gotocart;
	@FindBy(name="proceedToRetailCheckout")
	WebElement checkout;
	@FindBy(name="email")
	WebElement email;
	@FindBy(className="a-button-input")
	WebElement continuebutton;
	@FindBy(name="password")
	WebElement password;
	@FindBy(id="signInSubmit")
	WebElement signin;
	@FindBy(xpath="//a[@data-csa-c-slot-id='checkout-change-shipaddressselect']")
	WebElement changeadd;
	@FindBy(xpath="//input[@data-csa-c-slot-id='checkout-primary-continue-shipaddressselect'][1]")
	WebElement address;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[3]")
	WebElement payment;
	@FindBy(xpath="//span[.='Order Total:']")
	WebElement verifybytext;
	
	
	public void GotoCart(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(gotocart));
		assertdetails.assertEquals(gotocart.isDisplayed(), true);
		gotocart.click();
	}
	public void Checkout(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(checkout));
		assertdetails.assertEquals(checkout.isDisplayed(), true);
		checkout.click();
	}
	public void Email(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(email));
		assertdetails.assertEquals(email.isDisplayed(), true);
		email.sendKeys("9052682352");
	}
	public void ContinueButton(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(continuebutton));
		assertdetails.assertEquals(continuebutton.isDisplayed(), true);
		continuebutton.click();
	}
	public void Password(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(password));
		assertdetails.assertEquals(password.isDisplayed(), true);
		password.sendKeys("pruthvi@123");
	}
	public void Signin(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(signin));
		assertdetails.assertEquals(signin.isDisplayed(), true);
		signin.click();
	}
	public void Changeadd(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(changeadd));
		assertdetails.assertEquals(changeadd.isDisplayed(), true);
		changeadd.click();
	}
	public void Address(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(address));
		assertdetails.assertEquals(address.isDisplayed(), true);
		address.click();
	}
	public void Payment(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(payment));
		assertdetails.assertEquals(payment.isDisplayed(), true);
		payment.click();
	}
	public void VerifybyText(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(payment));
		assertdetails.assertEquals(verifybytext.isDisplayed(), true);
	}
	
	
	public CheckOutProcessPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
