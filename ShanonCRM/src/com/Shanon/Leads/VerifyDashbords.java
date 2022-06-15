package com.Shanon.Leads;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Shanon.GenericLib.WebdriverCommonLib;
import com.Shanon.login.Dashboards;
import com.Shanon.login.ValidLogin;
import com.Shanon.pages.HomePage;

@Listeners(com.Shanon.GenericLib.MyListeners.class)
public class VerifyDashbords {
	@Test
	public void verifyDashboardsTabTest()
	{
		ValidLogin v1 = new ValidLogin();
		v1.loginToApp();
		HomePage hp = new HomePage();
		hp.clickDashboardsTab();
		WebdriverCommonLib wlib=new WebdriverCommonLib();
		Dashboards dp=new Dashboards();
		wlib.elementDisplayed(dp.getDashbordsTab(), "DASHBOARDS TAB");
	}

}
