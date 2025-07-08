package DetailsOfAmazon.Website;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerLogic.class)
public class TestCase7_ProductDetailsPage extends CommonClass {
	@Test(retryAnalyzer=RetryLogic.class)
public void ProductDetails()
{
		MobileSearchPage mobiledetails=new MobileSearchPage(driver);
		mobiledetails.SearchBox(driver);
		

		PricedetailsPage details=new PricedetailsPage(driver);
		details.Mobile(driver);
		details.Review(driver);
		details.Description(driver);
		details.price(driver);
		details.Verifying(driver);
}
}
