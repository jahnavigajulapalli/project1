package DetailsOfAmazon.Website;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerLogic.class)
public class TestCase14_LastProductRating extends CommonClass {
	@Test(retryAnalyzer=RetryLogic.class)
	public void Rating()
	{
		
	}

}
