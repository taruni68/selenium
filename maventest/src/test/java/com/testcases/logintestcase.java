package com.testcases;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.add;
import com.pages.login;
import com.baseclass.wrapperex;
public class logintestcase extends wrapperex{

	@BeforeClass
	public void startUp() {
		launchApplication("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
	}
    @Test
	public void login()
	{
    	login page=new login(driver);
    	page.getstarted();
       	page.username("admin");
	    page.password("admin");
	    page.loginbutton();
	}
  
    @AfterClass
    public void close()
    {
    	quit();
    }
}
