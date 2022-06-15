package com.Shanon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Shanon.GenericLib.BaseTest;

public class HomePage {

	@FindBy(xpath = "//a[text()='Dashboards']") private WebElement dashboardsTab;
	
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getDashbordsTab() {
		return dashboardsTab;
	}
	
	public void clickLeadsTab()
	{
		LeadsTab().click();
	}

	private WebElement LeadsTab() {
		
		return LeadsTab();
	}

	public void clickDashboardsTab() {
		dashboardsTab.click();
		
	}
	
	
}
