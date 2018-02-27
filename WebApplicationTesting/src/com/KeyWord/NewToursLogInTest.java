package com.KeyWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursLogInTest
{

	FirefoxDriver driver ;
	
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}
	
	@Test
	public void LogIn() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Minu\\Desktop\\ShumonSelenium\\WebApplicationTesting\\NewToursApplication.properties");
		
		Properties pr = new Properties();
		pr.load(file);
		
		driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("Password"))).sendKeys("tutorial");
		driver.findElement(By.xpath(pr.getProperty("SignIn"))).click();
		
		String ExpectedTitle ="Find";
		String ActualTitle=driver.getTitle();
		System.out.println(ExpectedTitle);
		System.out.println(ActualTitle);
		
		if(ActualTitle.contains(ExpectedTitle))
		{
			System.out.println("User successfully Logded Into the Applicaion -- PASS");
		}
		else
		{
			System.out.println("User Failed to LogIn -- FAIL");
		}
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
}
