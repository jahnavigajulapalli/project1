package DetailsOfAmazon.Website;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerLogic.class)
public class TestCase5_SearchForProduct extends CommonClass {
	@Test(retryAnalyzer=RetryLogic.class)
	public void SearchDetails()
	{
		ShoeSearchPage searchpage=new ShoeSearchPage(driver);
		searchpage.SearchBox(driver);
		searchpage.Verifying(driver);
		
	}
}
