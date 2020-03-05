package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	WebDriver driver;
	By getstarted=By.xpath("/html/body/table[3]/tbody/tr/td/table[2]/tbody/tr[2]/td[1]/a");
	By username=By.name("login");
	By password=By.name("password");
	By loginbutton=By.name("DoLogin");
	
	public login(WebDriver driver)
	{
		this.driver=driver;
	}
	public void username(String userid) {
		driver.findElement(username).sendKeys(userid);
	}
	public void password(String pass) {
		driver.findElement(password).sendKeys(pass);	
	}
	public void loginbutton() {
		driver.findElement(loginbutton).click();
	}
	public void getstarted() {
		driver.findElement(getstarted).click();
		
	}
	
}
