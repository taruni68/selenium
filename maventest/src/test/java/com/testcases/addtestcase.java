package com.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.wrapperex;
import com.pages.add;

public class addtestcase extends wrapperex{

@BeforeClass
public void startUp()
{
	launchApplication("chrome","http://examples.codecharge.com/TaskManager/Default.php");
}
@Test
public void add()
{
	add log=new add(driver);
	log.assignedto();
	log.priority();
	log.project();
	log.status();
	log.type();
	log.search();
}
@AfterClass
public void close()
{
	quit();
}

}
