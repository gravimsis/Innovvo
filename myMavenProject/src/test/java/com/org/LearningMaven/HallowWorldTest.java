package com.org.LearningMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HallowWorldTest {
	WebDriver driver;
		
@Test
public void login()
{
	System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
	driver = new FirefoxDriver();
	System.out.println("Hi");
	driver.get("https://www.gmail.com");
	driver.manage().window().maximize();
	System.out.println("Hi Hallow World Login page");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	driver.close();
}
}
