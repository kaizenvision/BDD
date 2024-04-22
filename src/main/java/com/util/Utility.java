package com.util;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseClass;

public class Utility extends BaseClass {
	
	public static void setText(String text, WebElement ele) {
		ele.sendKeys(text);
	}
	
	public static void elementClick(WebElement ele) {
		ele.click();
	}
	
	public static void setImplicitWait(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	public static Actions getActionsclassObj() {
		 Actions act = new Actions(driver);
		 return act;
	}
	
	public static String takeScreenShot(String testName) throws IOException {
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMDDhhmmss"));
		String des = projectPath + "//screenshot//"+testName+".png";
		File destinationFile = new File(des);
		FileUtils.copyFile(scr, destinationFile);
		return des;
	}
	
	public static void setExplicitWait(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static void setFluentWait() {
		
	}

}
