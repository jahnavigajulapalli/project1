package DetailsOfAmazon.Website;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class LoginPage {
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
	@FindBy(xpath="//span[@class=\"nav-line-2 \"]")
	WebElement verifyingusingtext;
	
	
	public void Un(WebDriver driver) throws IOException 
	{
		FileInputStream f1= new FileInputStream("C:\\Users\\quali\\eclipse-workspace\\Website\\ExcelSheet\\usernameandpassword.xlsx");
		Workbook wb=	WorkbookFactory.create(f1);
		String cell=NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(0).getNumericCellValue());
		//DataFormatter formatter=new DataFormatter();
		//String un=formatter.formatCellValue(cell);
		username.sendKeys(cell);
	}
	public void ContinueButton(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(Continuebutton));
		Continuebutton.click();
	}
	public void Pwd(WebDriver driver) throws IOException
	{
		wait.until(ExpectedConditions.visibilityOf(pwd));
		FileInputStream f1= new FileInputStream("C:\\Users\\quali\\eclipse-workspace\\Website\\ExcelSheet\\usernameandpassword.xlsx");
		Workbook wb=	WorkbookFactory.create(f1);
		String password=wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		pwd.sendKeys(password);
	}
	public void SigninButton(WebDriver driver)
	{
		signinbutton.click();
	}
	public void VerifyingUsingText(WebDriver driver)
	{
		
		String text=verifyingusingtext.getText();
		System.out.println(text);
		Assert.assertEquals(text, "Account & Lists");
		
		
	}
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
