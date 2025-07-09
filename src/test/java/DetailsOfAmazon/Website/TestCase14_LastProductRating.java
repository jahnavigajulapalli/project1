package DetailsOfAmazon.Website;

//import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerLogic.class)
public class TestCase14_LastProductRating extends CommonClass {
	@Test(retryAnalyzer=RetryLogic.class)
	public void Rating()
	{
		RatingProductLoginPage ratingproduct=new RatingProductLoginPage(driver);
		
	ratingproduct.Signin(driver);
	ratingproduct.Un(driver);
	ratingproduct.ContinueButton(driver);
	ratingproduct.Pwd(driver);
	ratingproduct.SigninButton(driver);
	
	LastProductRatingPage rating=new LastProductRatingPage(driver);
	rating.Orders(driver);
	rating.AllOrders(driver);
	rating.View(driver);
	rating.Details(driver);
	rating.Review(driver);
	
	
	//Assert.assertEquals(driver.getTitle(), "Review Your Purchases");
		
	}

}
