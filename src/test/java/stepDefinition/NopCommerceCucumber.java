package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NopCommerceCucumber {
	WebDriver driver;

	@Given("je me connecte sur l'application")
	public void je_me_connecte_sur_l_application() {

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

	}

	@When("je saisis l'email")
	public void je_saisis_l_email() {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");

	}

	@When("je saisis le mot de pass")
	public void je_saisis_le_mot_de_pass() {
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
	}

	@Then("je clique sur le bouton login")
	public void je_clique_sur_le_bouton_login() {
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		driver.quit();

	}

}
