package DetailsOfAmazon.Website;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerLogic.class)
public class TestCase4_EditingProfile extends CommonClass {

	@Test(retryAnalyzer=RetryLogic.class)
	public void EditingProfile() throws IOException
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
		
		
		ProfilePage profilepage=new ProfilePage(driver);
		profilepage.HoverOverAccount(driver);
		profilepage.YourAccount(driver);
		profilepage.LoginandSecurity(driver);
		//profilepage.Password(driver);
		//profilepage.Sigin(driver);
		profilepage.Edit(driver);
		profilepage.Name(driver);
		profilepage.SaveChanges(driver);
		profilepage.VerifyUsingText(driver);
		
	}
}
