package DetailsOfAmazon.Website;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerLogic.class)
public class Testcase15_ReachTillCartPage extends CommonClass{
@Test(retryAnalyzer=RetryLogic.class)
public void CartPage()
{
	MobileSearchPage mobile=new MobileSearchPage(driver);
	mobile.SearchBox(driver);
	
	AddingtoCartPage verify=new AddingtoCartPage(driver);
	verify.Mobile(driver);
	verify.AddtoCart(driver);
	
	CartPage cart=new CartPage(driver);
	cart.GotoCart(driver);
	
	
	Assert.assertEquals(driver.getTitle(), "Amazon.in Shopping Cart");
}
}
