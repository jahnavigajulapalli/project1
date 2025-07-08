package DetailsOfAmazon.Website;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class ProfilePage {
	WebDriver driver;
	SoftAssert assertdetails=new SoftAssert();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
@FindBy(xpath="//span[@class='nav-line-2 ']")
WebElement hoveroveraccount;
@FindBy(xpath="//span[.='Your Account']")
WebElement youraccount;
@FindBy(xpath="//span[.='Edit login, name, and mobile number']")
WebElement loginandsecurity;
@FindBy(name="password")
WebElement password;
@FindBy(id="signInSubmit")
WebElement sigin;
@FindBy(xpath="(//a[.='Edit'])[1]")
WebElement edit;
@FindBy(name="customerName")
WebElement name;
@FindBy(xpath="//input[@id='cnep_1C_submit_button']")
WebElement savechanges;
@FindBy(xpath="//h1[.='Login and Security']")
WebElement verifyusingtext;

public void HoverOverAccount(WebDriver driver)
{
	Actions hoverover=new Actions(driver);
	hoverover.moveToElement(hoveroveraccount).perform();
	assertdetails.assertEquals(youraccount.isDisplayed(), true);
}
public void YourAccount(WebDriver driver)
{
	wait.until(ExpectedConditions.elementToBeClickable(youraccount));
	youraccount.click();
	assertdetails.assertEquals(loginandsecurity.isDisplayed(), true);
}
public void LoginandSecurity(WebDriver driver)
{
	wait.until(ExpectedConditions.elementToBeClickable(loginandsecurity));
	loginandsecurity.click();
}
public void Password(WebDriver driver)
{
	password.sendKeys("pruthvi@123");
	assertdetails.assertEquals(sigin.isDisplayed(), true);
}
public void Sigin(WebDriver driver)
{
	wait.until(ExpectedConditions.elementToBeClickable(sigin));
	sigin.click();
}
public void Edit(WebDriver driver)
{
	edit.click();
}
public void Name(WebDriver driver)
{
	wait.until(ExpectedConditions.visibilityOf(name));
	name.sendKeys(Keys.CONTROL+"a");
	name.sendKeys("janu");
	assertdetails.assertEquals(savechanges.isDisplayed(), true);
}
public void SaveChanges(WebDriver driver)
{
	savechanges.click();
}
public void VerifyUsingText(WebDriver driver)
{
	assertdetails.assertEquals(verifyusingtext.getText(), "Login and Security");
}

public ProfilePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
}
