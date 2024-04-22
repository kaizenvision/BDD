package com.pomclass;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class GooglePagePom extends BaseClass {
	
	public GooglePagePom()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//textarea[@name='q']")
	private WebElement searchText;
	
	@FindBy(xpath = "//ul[@jsname='bw4e9b']/li")
	private List<WebElement> suggestions;
	
	public void setSerchText(String search) {
		searchText.sendKeys(search);
		searchText.sendKeys(Keys.ENTER);
	}
	
	public void getAllAutoSugestions() {
		System.out.println(suggestions);
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		
		String[] str = title.split(" ");
		
		return str[0];
	}

}
