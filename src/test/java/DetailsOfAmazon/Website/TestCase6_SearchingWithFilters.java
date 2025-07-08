package DetailsOfAmazon.Website;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerLogic.class)
public class TestCase6_SearchingWithFilters extends CommonClass {
@Test(retryAnalyzer=RetryLogic.class)
public void Filters()
{
	ShoeSearchPage searchpage=new ShoeSearchPage(driver);
	searchpage.SearchBox(driver);
	searchpage.Verifying(driver);
	
	CategoryPage categorypage=new CategoryPage(driver);
	categorypage.PriceSlider(driver);
	categorypage.Go(driver);
	categorypage.WomenShoe(driver);
	categorypage.VerifyByText(driver);
}
}

