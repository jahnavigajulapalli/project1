package DetailsOfAmazon.Website;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class AddingtoCartPage {
	WebDriver driver;
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
SoftAssert assertdetails=new SoftAssert();
@FindBy(xpath="//img[@class='s-image'][1]")
WebElement mobile;
@FindBy(xpath="(//input[@id='add-to-cart-button'])[2]")
WebElement addtocart;
@FindBy(xpath="//h1[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")
WebElement verifybytext;


public void Mobile(WebDriver driver)
{
	wait.until(ExpectedConditions.elementToBeClickable(mobile));
	assertdetails.assertEquals(mobile.isDisplayed(), true);
	mobile.click();
}
public void AddtoCart(WebDriver driver)
{
	wait.until(ExpectedConditions.elementToBeClickable(addtocart));
	assertdetails.assertEquals(addtocart.isDisplayed(), true);
	addtocart.click();
}
public void VerifybyText(WebDriver driver)
{
	assertdetails.assertEquals(verifybytext.getText(), "Added to cart");
}

public AddingtoCartPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}