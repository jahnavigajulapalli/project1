package DetailsOfAmazon.Website;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerLogic.class)
public class TestCase9_AddingToCart extends CommonClass {
@Test(retryAnalyzer=RetryLogic.class)
public void AddingToCart()
{
	MobileSearchPage mobilesearchpage=new MobileSearchPage(driver);
	mobilesearchpage.SearchBox(driver);
	
	AddingtoCartPage addtocart=new AddingtoCartPage(driver);
	addtocart.Mobile(driver);
	addtocart.AddtoCart(driver);
	addtocart.VerifybyText(driver);
	
}
}
