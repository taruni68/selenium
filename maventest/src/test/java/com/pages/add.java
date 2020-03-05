package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class add {
WebDriver driver;
By assignedto=By.name("assign_to");
By project=By.name("project_id");
By priority=By.name("priority_id");
By status=By.name("status_id");
By type=By.name("type_id");
By search=By.name("DoSearch");
public add(WebDriver driver )
{
	this.driver=driver;
}
public void assignedto()
{
	driver.findElement(assignedto).click();
	driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[1]/td/select/option[20]")).click();
}
public void project()
{
	driver.findElement(project).click();
	driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[2]/td/select/option[4]")).click();
}
public void priority()
{
	driver.findElement(priority).click();
	driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[3]/td/select/option[3]")).click();
}
public void status()
{
	driver.findElement(status).click();
	driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[4]/td/select/option[5]")).click();
}
public void type()
{
	driver.findElement(type).click();
	driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[5]/td/select/option[5]")).click();
}
public void search()
{
	driver.findElement(search).click();
}
}
