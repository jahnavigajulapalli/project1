package DetailsOfAmazon.Website;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CouponCodePage {
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	SoftAssert assertdetails=new SoftAssert();
	
@FindBy(xpath="//input[@placeholder=\"Enter Code\"]")
WebElement couponcode;
@FindBy(xpath="//input[@name='ppw-claimCodeApplyPressed']")
WebElement apply;
@FindBy(xpath="(//h2[@class='a-size-medium a-spacing-none a-text-bold'])[3]")
WebElement verifybytext;

public void CouponCode(WebDriver driver)
{
	wait.until(ExpectedConditions.visibilityOf(couponcode));
	assertdetails.assertEquals(couponcode.isDisplayed(), true);
couponcode.sendKeys("FIRST100");
}
public void Apply(WebDriver driver)
{
	wait.until(ExpectedConditions.visibilityOf(apply));
	assertdetails.assertEquals(apply.isDisplayed(), true);
	apply.click();
}
public void VerifybyText(WebDriver driver)
{
	assertdetails.assertEquals(verifybytext.getText(), "Payment method");
}

public CouponCodePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}