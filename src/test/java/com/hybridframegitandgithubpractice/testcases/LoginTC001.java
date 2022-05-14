package com.hybridframegitandgithubpractice.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.hybridframegitandgithubpractice.pageobjects.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTC001 {

	String url = "https://opensource-demo.orangehrmlive.com/index.php";
	String username = "Admin";
	String password = "admin123";

	@Test
	public void verifyLoginFunctionality() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 driver.get(url);
		LoginPage LoginPage = new LoginPage(driver);
		
		LoginPage.setUserName(username);
		LoginPage.setPassword(password);
		LoginPage.clickOnLogin();
		
 
		
	}
}
