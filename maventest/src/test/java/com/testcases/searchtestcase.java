package com.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.wrapperex;
import com.pages.search;
public class searchtestcase extends wrapperex{
@BeforeClass
public void startUp()
{
	launchApplication("chrome","http://examples.codecharge.com/TaskManager/Default.php");
}
@Test
public void search()
{
	search data=new search(driver);
	data.task("Get ready to click");
	data.description("Write CODE by pointing and clicking.Write CODE by pointing and clicking. Or clicking and pointing. Or clicking and clicking.");
	data.project();
	data.priority();
	data.status();
	data.type();
	data.assignedto();
	data.startdate();
	data.finishdate();
}
@AfterClass
public void close()
{
	quit();
}
}
