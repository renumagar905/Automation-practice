package com.qa.testes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Loginhrm {
	@Test
	public void logintest(){
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		 WebElement username =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));

	     WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
		System.out.println(driver.getTitle());
	}
}
