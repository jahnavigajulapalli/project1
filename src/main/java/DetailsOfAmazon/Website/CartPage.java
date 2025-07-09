package DetailsOfAmazon.Website;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CartPage {
WebDriver driver;
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
SoftAssert assertdetails=new SoftAssert();
@FindBy(xpath="(//img[@class='sw-product-image'])[1]")
WebElement mobile2;
@FindBy(xpath="(//button[.='Add to cart'])[1]")
WebElement addtocart1;
@FindBy(xpath="(//a[@data-csa-c-content-id='sw-gtc_CONTENT'])[1]")
WebElement gotocart;
@FindBy(xpath="(//span[@class='a-icon a-icon-small-trash'])[1]")
WebElement removecart;

public void Mobile2(WebDriver driver)
{
	wait.until(ExpectedConditions.elementToBeClickable(mobile2));
	assertdetails.assertEquals(mobile2.isDisplayed(), true);
	mobile2.click();
}
public void AddtoCart1(WebDriver driver)
{
	wait.until(ExpectedConditions.elementToBeClickable(addtocart1));
	assertdetails.assertEquals(addtocart1.isDisplayed(), true);
	addtocart1.click();
}
public void GotoCart(WebDriver driver)
{
	wait.until(ExpectedConditions.elementToBeClickable(gotocart));
	assertdetails.assertEquals(gotocart.isDisplayed(), true);
	gotocart.click();
}
public void RemoveCart(WebDriver driver)
{
	wait.until(ExpectedConditions.elementToBeClickable(removecart));
	assertdetails.assertEquals(removecart.isDisplayed(), true);
	removecart.click();
}

public CartPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
