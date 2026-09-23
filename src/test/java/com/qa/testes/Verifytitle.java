package com.qa.testes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verifytitle {
	@Test
	public void verifytitlef() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("renu"));
		
		
	}
}
