package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSwagLabs {

	public static void main(String[] args) {

		// Open chrome browser
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		// Maximize browser
		driver.manage().window().maximize();

		// Open url application
		driver.get("https://www.saucedemo.com/");

		// Fill Username
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// Fill password
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		// Click on login button
		driver.findElement(By.id("login-button")).click();
		
		// Close browser
		driver.quit();

	}

}
