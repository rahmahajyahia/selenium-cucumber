package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginCucumber {

	WebDriver driver;

	@Given("Je me connecte sur l'application")
	public void je_me_connecte_sur_l_application() {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@When("Je saisis le username")
	public void je_saisis_le_username() {
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	}

	@When("Je saisis le password")
	public void je_saisis_le_password() {
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@When("Je clique sur le bouton login")
	public void je_clique_sur_le_bouton_login() {
		driver.findElement(By.id("login-button")).click();

	}

	@Then("Je me redirige vers la page home")
	public void je_me_redirige_vers_la_page_home() {
		System.out.println("Coonexion succefully");
		driver.quit();
	}

}
