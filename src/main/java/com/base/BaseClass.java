package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.util.Utility;

public class BaseClass {

	public static WebDriver driver;
	public static String projectPath = System.getProperty("user.dir");
	public static FileInputStream file;
	public static Properties prop;

	public static void launchWebsite() throws FileNotFoundException, IOException {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();

		
		Utility.setImplicitWait(30);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		  //driver.manage().deleteAllCookies();
		  
		 
	}

}
