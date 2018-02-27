package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingTitle_Facebook {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		String ExpectedTitle="Facebook - Log In or Sign ";
		String ActualTitle=driver.getTitle();
		
		System.out.println(ExpectedTitle);
		System.out.println(ActualTitle);
		
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Title Matched -- PASS");
		}
		else
		{
			System.out.println("Title Not Matched -- FAIL");
		}
		
		driver.close();
			
		
	}

}
