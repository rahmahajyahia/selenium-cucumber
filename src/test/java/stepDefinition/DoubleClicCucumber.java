package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClicCucumber {
	
	WebDriver driver;
	
	@Given("Je me connecte sur l'application double clic")
	public void je_me_connecte_sur_l_application_double_clic() {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver(chromeOptions);

		// Maximize browser
		driver.manage().window().maximize();

		// Open url application
		driver.get("https://demoqa.com/buttons");
	}

	@When("J'effectue le double clique")
	public void j_effectue_le_double_clique() {
		
		Actions actions = new Actions(driver);

		WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));
		actions.doubleClick(btnDoubleClick).perform();
	}

	@Then("Je ferme le navigateur")
	public void je_ferme_le_navigateur() {
		driver.quit();
	}

}
