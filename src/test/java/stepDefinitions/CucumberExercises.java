package stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberExercises {
	final String URL = "https://opensource-demo.orangehrmlive.com/";
	final String username = "Admin";
	final String password = "admin123";
	ChromeDriver driver;
	
	//Exercise 16
	
	@Given("When I am in OrangeHRP Application")
	public void UserShouldLaunchTheBrowser() {
		System.setProperty("webdriver.chrome.driver", 
				"./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
	}
	
	@Then("Login to Application")
	public void UserLoginToApplication() {
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElementById("txtUsername").sendKeys(username);
		driver.findElementById("txtPassword").sendKeys(password);
		driver.findElementByCssSelector(".button").click();		
	}
	
	@When("Dashboard page is available")
	public void DashboardPageIsAvailable() {
		driver.findElementByXPath("//*[@id='content']/div/div[1]/h1").isEnabled();
	}
	
	@And("Click on Menu")
	public void ClickOnMenu() {
		driver.findElementByCssSelector("#menu_admin_viewAdminModule").click();
	}
	
	//Exercise 17
	
	@Given("When I click on Admin Link")
	public void UserClickOnAdminLink() {
		driver.findElementByCssSelector("#menu_admin_viewAdminModule").click();
	}
	
	@Then("Click on Job")
	public void UserClickOnJob() {
		driver.findElementByXPath("//*[text() = 'Job']").click();	
	}
	
	@And("ValidateTextJobTitle")
	public void ValidateTextJobTitle() {
		driver.findElementByCssSelector("#menu_admin_viewAdminModule").click();
		driver.findElementByCssSelector("#menu_admin_viewJobTitleList").click();
		driver.findElementByXPath("//*[@id='search-results']/div[1]/h1");
	}

	
}
