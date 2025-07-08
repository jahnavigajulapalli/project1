package DetailsOfAmazon.Website;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerLogic.class)
public class Testcase2_ValidCredentials extends CommonClass {

	@Test(retryAnalyzer=RetryLogic.class)
	public void ValidCredentials() throws IOException
	{
		AmazonHome amazonhome=new AmazonHome(driver);
		amazonhome.HoverOverSigninOption(driver);
		amazonhome.SignIn(driver);
		amazonhome.Verify(driver);
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.Un(driver);
		loginpage.ContinueButton(driver);
		loginpage.Pwd(driver);
		loginpage.SigninButton(driver);
		loginpage.VerifyingUsingText(driver);
	}
}
