package DetailsOfAmazon.Website;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerLogic.class)
public class Testcase1_Registration extends CommonClass
{

	@Test(retryAnalyzer=RetryLogic.class)
	public void RegistrationPageDetails() 
	{
		AmazonHome amazonhome=new AmazonHome(driver);
		amazonhome.HoverOverSigninOption(driver);
		amazonhome.SignIn(driver);
		amazonhome.Verify(driver);
		
		RegistrationPage registrationpage=new RegistrationPage(driver);
		registrationpage.Un(driver);
		registrationpage.ContinueButton(driver);
		registrationpage.Pwd(driver);
		registrationpage.SigninButton(driver);
		registrationpage.VerifyingUsingText(driver);
	}
}
