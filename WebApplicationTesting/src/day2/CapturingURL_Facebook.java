package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingURL_Facebook {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();

	}

}
