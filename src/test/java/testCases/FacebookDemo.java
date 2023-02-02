package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookDemo {

	public static void main(String[] args) {

		// Open chrome browser
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

		// Maximize browser
		driver.manage().window().maximize();

		// Open url
		driver.get("https://fr-fr.facebook.com/");

		// Fill Useremail
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("hajyahiarahma4@gmail.com");

		// Fill password
		driver.findElements(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("molka1234");

		// Click connecter button
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.quit();

	}
}
