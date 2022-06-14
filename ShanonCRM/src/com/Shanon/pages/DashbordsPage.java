package com.Shanon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Shanon.GenericLib.BaseTest;

public class DashbordsPage {
	
@FindBy(xpath = "//a[text()='Dashboards']") private WebElement DashbordsTab;
	
	public void HomePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public WebElement getDashbordsTab() {
		return DashbordsTab;
		public void clickDashbordsTab()
		{
			DashbordsTab.click();
		}
}
}
