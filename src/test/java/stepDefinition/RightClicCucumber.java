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

public class RightClicCucumber {

	WebDriver driver;

	@Given("Je me connecte sur l'application right clic")
	public void je_me_connecte_sur_l_application_right_clic() {

		// Open chrome browser
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);

		// Maximize browser
		driver.manage().window().maximize();
		// Open url application
		driver.get("https://demoqa.com/buttons");
	}

	@When("J'effctue le right clic")
	public void j_effctue_le_right_clic() {
		
		Actions actions = new Actions(driver);
		WebElement btnRightClick = driver.findElement(By.id("rightClickBtn"));
		actions.contextClick(btnRightClick).perform();
	}

	@Then("Le right clic effectué")
	public void le_right_clic_effectué() {
		System.out.println("Right clic");
		driver.quit();
	}

}
