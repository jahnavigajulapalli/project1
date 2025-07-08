package DetailsOfAmazon.Website;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerLogic.class)
public class TestCase12_SelectingEachPayment extends CommonClass {
	@Test(retryAnalyzer=RetryLogic.class)
	public void PaymentMethod()
	{
		MobileSearchPage mobilesearch=new MobileSearchPage(driver);
		mobilesearch.SearchBox(driver);
		
		AddingtoCartPage cartpage=new AddingtoCartPage(driver);
		cartpage.Mobile(driver);
		cartpage.AddtoCart(driver);
		cartpage.VerifybyText(driver);
		
		CheckOutProcessPage checkoutpage=new CheckOutProcessPage(driver);
		checkoutpage.GotoCart(driver);
		checkoutpage.Checkout(driver);
		checkoutpage.Email(driver);
		checkoutpage.ContinueButton(driver);
		checkoutpage.Password(driver);
		checkoutpage.Signin(driver);
		checkoutpage.Changeadd(driver);
		checkoutpage.Address(driver);
		checkoutpage.Payment(driver);
		
		PaymentPage paymentmethod=new PaymentPage(driver);
		paymentmethod.Credit(driver);
		paymentmethod.NetBanking(driver);
		paymentmethod.Upi(driver);
		paymentmethod.Emi(driver);
		
	}

}
