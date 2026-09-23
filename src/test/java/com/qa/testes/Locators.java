package com.qa.testes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {
	@Test
	public void Locateit() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("ti6dpd")).sendKeys("tcs");
		System.out.println(driver.findElement(By.tagName("textarea")));
		WebElement search=driver.findElement(By.id("ti6dpd"));
		search.sendKeys(Keys.ENTER);
	}

}
