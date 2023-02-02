package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookDemoCucumber {
	WebDriver driver;

	@Given("je me connecte sur url")
	public void je_me_connecte_sur_url() {

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://fr-fr.facebook.com/");

	}

	@When("je saisi l'adresse e-mail")
	public void je_saisi_l_adresse_e_mail() {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("hajyahiarahma4@gmail.com");

	}

	@When("je saisi le mot de passe")
	public void je_saisi_le_mot_de_passe() {
		driver.findElements(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("molka1234");

	}

	@Then("j'accéde à mon compte facebook")
	public void j_accéde_à_mon_compte_facebook() {
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.quit();


	}

}
