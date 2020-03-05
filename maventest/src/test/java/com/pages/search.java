package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class search {
WebDriver driver;
By task=By.name("task_name");
By description=By.name("task_desc");
By project=By.name("project_id");
By priority=By.name("priority_id");
By status=By.name("status_id");
By type=By.name("type_id");
By assignedto=By.name("user_id_assign_to");
By startdate=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[8]/td/a/img");
By finishdate=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[9]/td/a/img");
public search(WebDriver driver)
{
	this.driver=driver;
}
public void task(String t1)
{
	driver.findElement(task).sendKeys(t1);
}
public void description(String t2)
{
	driver.findElement(description).sendKeys(t2);
}
public void project()
{
	driver.findElement(project).click();
	driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[3]/td/select/option[2]"));
}
public void priority()
{
	driver.findElement(priority).click();
	driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[4]/td/select/option[2]"));
}
public void status()
{
	driver.findElement(status).click();
	driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[5]/td/select/option[2]"));	
}
public void type()
{
	driver.findElement(type).click();
	driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[6]/td/select/option[5]"));
}
public void assignedto()
{
	driver.findElement(assignedto).click();
	driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[7]/td/select/option[28]"));	
}
public void startdate()
{
	driver.findElement(startdate).click();
	driver.findElement(By.xpath("/html/body/center/table/tbody/tr/td/table/tbody/tr[4]/td[2]/a"));
}
public void finishdate()
{
	driver.findElement(finishdate).click();
	driver.findElement(By.xpath("/html/body/center/table/tbody/tr/td/table/tbody/tr[4]/td[3]/a"));
	
}
}
