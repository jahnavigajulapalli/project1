package DetailsOfAmazon.Website;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer{

	int initialcount=0;
	int retrycount=2;
	@Override
	public boolean retry(ITestResult result) 
	{
			if(initialcount<retrycount)
			{
				initialcount++;
				return true;// return true means retry
				
		}
		return false;// return false means don't retry, if you make it true it will retry infinite times
	}

}
