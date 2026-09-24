package testes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest {
	@Test
	public void logintests() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPage page=new LoginPage(driver);
		
		page.enterUsername("Admin");
		page.enterPassword("admin123");
		page.ClickloginButton();
		
		
	}
}
