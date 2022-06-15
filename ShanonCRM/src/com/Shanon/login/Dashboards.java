package com.Shanon.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Shanon.GenericLib.BaseTest;

public class Dashboards {
	@FindBy(xpath = "//a[text()='Dashboards']") private WebElement DashboardsTab;
	
	public Dashboards()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public WebElement getDashbordsTab() {
		return DashboardsTab;
	}
	
	public void clickLeadsTab()
	{
		DashboardsTab.click();
	}
}
