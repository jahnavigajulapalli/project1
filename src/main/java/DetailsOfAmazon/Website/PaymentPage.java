package DetailsOfAmazon.Website;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class PaymentPage {
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	SoftAssert assertdetails=new SoftAssert();
@FindBy(xpath="(//input[@name=\"ppw-instrumentRowSelection\"])[1]")
WebElement credit;
@FindBy(xpath="(//input[@name=\"ppw-instrumentRowSelection\"])[2]")
WebElement netbanking;
@FindBy(xpath="(//input[@name=\"ppw-instrumentRowSelection\"])[3]")
WebElement upi;
@FindBy(xpath="(//input[@name=\"ppw-instrumentRowSelection\"])[4]")
WebElement emi;
@FindBy(xpath="//span[.='Order Total:']")
WebElement verifybytext;

public void Credit(WebDriver driver)
{
	wait.until(ExpectedConditions.elementToBeClickable(credit));
	assertdetails.assertEquals(credit.isDisplayed(), true);
	credit.click();
}
public void NetBanking(WebDriver driver)
{
	wait.until(ExpectedConditions.elementToBeClickable(netbanking));
	assertdetails.assertEquals(netbanking.isDisplayed(), true);
	netbanking.click();
}
public void Upi(WebDriver driver)
{
	wait.until(ExpectedConditions.elementToBeClickable(upi));
	assertdetails.assertEquals(upi.isDisplayed(), true);
	upi.click();
}
public void Emi(WebDriver driver)
{
	wait.until(ExpectedConditions.elementToBeClickable(emi));
	assertdetails.assertEquals(emi.isDisplayed(), true);
	emi.click();
}
public void VerifybyText(WebDriver driver)
{
	assertdetails.assertEquals(verifybytext.isDisplayed(), true);
}


public PaymentPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
