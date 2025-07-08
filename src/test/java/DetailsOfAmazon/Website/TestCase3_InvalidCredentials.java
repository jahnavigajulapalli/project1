package DetailsOfAmazon.Website;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerLogic.class)
public class TestCase3_InvalidCredentials extends CommonClass {
	@Test(retryAnalyzer=RetryLogic.class)
	public void InValidCredentials()
	{
		AmazonHome amazonhome=new AmazonHome(driver);
		amazonhome.HoverOverSigninOption(driver);
		amazonhome.SignIn(driver);
		amazonhome.Verify(driver);
		
		Invalid_LoginPage invalid=new Invalid_LoginPage(driver);
		invalid.Un(driver);
		invalid.ContinueButton(driver);
		invalid.Pwd(driver);
		invalid.SigninButton(driver);
		invalid.VerifyingUsingText(driver);
		
	}

}
