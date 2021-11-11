package SeleniumAssignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ExercisesTests{
	
	final String URL = "https://opensource-demo.orangehrmlive.com/";
	final String username = "Admin";
	final String password = "admin123";
	

	@Test(enabled = false)
	public void seleniumAssignments() throws InterruptedException {
		
	// Exercise 1 - Opening URL
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(URL);
		
	// Exercise 2 - Printing title of the application
		System.out.println("2. Printing title of the application:");
		System.out.println(driver.getTitle());	
	
	// Exercise 3 - Write Xpath and CssSelector of login page for following web objects - All Text box’s, All - Hyperlinks, All Images.
		driver.findElementByXPath("//*[@id='txtUsername']");
		driver.findElementByCssSelector("input[name='txtUsername']");
		driver.findElementByXPath("//*[@id='txtPassword']");
		driver.findElementByCssSelector("input[name='txtPassword']");
		
		driver.findElementByXPath("//*[@id='forgotPasswordLink']/a");
		driver.findElementByCssSelector("a[href='/index.php/auth/requestPasswordResetCode']");
		
		driver.findElementByXPath("//*[@id='divLogo']/img");
		driver.findElementByCssSelector("img[src='/webres_6051af48107ce6.31500353/themes/default/images/login/logo.png']");
		
	// Exercise 4 - Login with given User Name and Password and validate Dashboard.
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElementById("txtUsername").sendKeys(username);
		driver.findElementById("txtPassword").sendKeys(password);
		driver.findElementByCssSelector(".button").click();		
		
	// Exercise 5 - Click on Admin Link in Home Page and validate following text -
		// • User Management
		// • Job
		// • Organization
		// • Qualifications
		
		driver.findElementByCssSelector("#menu_admin_viewAdminModule").click();
		driver.findElementByXPath("//*[text() = 'User Management']");
		driver.findElementByXPath("//*[text() = 'Job']");
		driver.findElementByXPath("//*[text() = 'Organization']");
		driver.findElementByXPath("//*[text() = 'Qualifications']");		
		driver.quit();
	}		
		
	// Exercise 6 - Launch a browser in @Beforesuite annotation and open url . url - https://opensource-demo.orangehrmlive.com/
		
//	@BeforeSuite  
//	 public void beforeSuiteExercise6()  
//	 {  
//		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get(URL);  
//	 }  
		
	// Exercise 7 - Login to application again in @Test method, set priority 1 of the same method After logging
		
	@Test(priority = 1, enabled = false)
	public void testExercise7() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(URL);
		
		driver.manage().window().maximize();
		driver.findElementById("txtUsername").sendKeys(username);
		driver.findElementById("txtPassword").sendKeys(password);
		driver.findElementByCssSelector(".button").click();	
	}
		
	// Exercise 8 - Write Test method and page title for different menus- in order(Admin, PIM, Leave Dashboard, Directory and Maintenance)
		
	@Test(enabled = false)
	public void testExercise8() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(URL);
		
		driver.manage().window().maximize();
		driver.findElementById("txtUsername").sendKeys(username);
		driver.findElementById("txtPassword").sendKeys(password);
		driver.findElementByCssSelector(".button").click();
		
		System.out.println("1. Printing Admin title:");
		driver.findElementByCssSelector("#menu_admin_viewAdminModule").click();
		System.out.println(driver.getTitle());		
		System.out.println("2. Printing PIM title:");
		driver.findElementByCssSelector("#menu_pim_viewPimModule").click();
		System.out.println(driver.getTitle());
		System.out.println("3. Printing Leave Dashboard title:");
		driver.findElementByCssSelector("#menu_leave_viewLeaveModule").click();
		System.out.println(driver.getTitle());
		System.out.println("4. Printing Directory title:");
		driver.findElementByCssSelector("#menu_directory_viewDirectory").click();
		System.out.println(driver.getTitle());
		System.out.println("5. Printing Maintenance title:");
		driver.findElementsByCssSelector("#menu_maintenance_purgeEmployee").get(0).click();
		System.out.println(driver.getTitle());
		
	}
	
	// Exercise 9 - Write a method (avoid using Test annotation) to minimize the window.
		
	@Test(enabled = false)
	public void testExercise9() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().window().setPosition(new Point(-2000, 0));
	}
	
	// Exercise 10 - Read Dashboard heading using [driver.findelement(by.xpath()).gettext()]. Refer screenshot
		
	@Test()
	public void testExercise10() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(URL);
		
		driver.manage().window().maximize();
		driver.findElementById("txtUsername").sendKeys(username);
		driver.findElementById("txtPassword").sendKeys(password);
		driver.findElementByCssSelector(".button").click();
		
		System.out.println("Reading Dashboard");
		driver.findElementByCssSelector("#menu_dashboard_index").click();
		System.out.println("Getting Dashboard text using xpath");
		String text = driver.findElementByXPath("//*[@id='content']/div/div[1]/h1").getText();
		System.out.println("Dashboard Text: " +text);
	}
	
		
	// Exercise 11- Implement ITestListener for above scenario where full-page screenshot needs to be capture where ever test is pass or failed. Hint – Please use Shutterbug class
	// Exercise 12- Implement Retry analyzer – retry 3 times only for the above scenario. 
	// Exercise 13- Execute following scenario
		//• Login to OrangeHRM
		//• Click on PIM
		//• Enter Employee Name-Linda Anderson in Search box (refer below image)
		//• Validate and capture screenshot
	
	@Test()
	public void testExercise13() throws IOException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(URL);
		
		driver.manage().window().maximize();
		driver.findElementById("txtUsername").sendKeys(username);
		driver.findElementById("txtPassword").sendKeys(password);
		driver.findElementByCssSelector(".button").click();
		
		driver.findElementById("menu_pim_viewPimModule").click();
		driver.findElementById("empsearch_employee_name_empName").sendKeys("Linda Anderson");
		driver.findElementById("searchBtn").click();
		WebElement name = driver.findElementByLinkText("Linda Jane");
		System.out.println(name.getText());		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotAs, new File("./employeeInformation.png"));		
	}
	
	// Exercise 14- Write CSS Selector of highlighted Rectangular object (in Red) in below Image-
	
	@Test()
	public void testExercise14() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(URL);
		
		driver.manage().window().maximize();
		driver.findElementById("txtUsername").sendKeys(username);
		driver.findElementById("txtPassword").sendKeys(password);
		driver.findElementByCssSelector(".button").click();
		System.out.println("Writting CSS Selector for PIM option");
		driver.findElementByCssSelector("#menu_pim_viewPimModule");
		System.out.println("Writting CSS Selector for Time option");
		driver.findElementByCssSelector("#menu_time_viewTimeModule");
		System.out.println("Writting CSS Selector for Maintenance option");
		driver.findElementsByCssSelector("#menu_maintenance_purgeEmployee").get(0);
		System.out.println("Writting CSS Selector for Assign Leave");		
		driver.findElementByCssSelector("a[href='/index.php/leave/assignLeave']");
		System.out.println("Writting CSS Selector for Timesheets");
		driver.findElementByCssSelector("a[href='/index.php/time/viewEmployeeTimesheet']");
		System.out.println("Writting CSS Selector for Employee Distribution by Subunit");
		driver.findElementByCssSelector(".flot-overlay");
	}
	
	// Exercise 15- Write Xpath Selector of highlighted Rectangular object (in Red) in below –
	
	@Test()
	public void testExercise15() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(URL);
		
		driver.manage().window().maximize();
		driver.findElementById("txtUsername").sendKeys(username);
		driver.findElementById("txtPassword").sendKeys(password);
		driver.findElementByCssSelector(".button").click();
		
		System.out.println("Writting Xpath for Admin option");
		driver.findElementByXPath("//*[@id='menu_admin_viewAdminModule']/b");
		System.out.println("Writting Xpath for Marketplace");
		driver.findElementByXPath("//*[@id='MP_link']");
		System.out.println("Writting Xpath for Welcome Admin");
		driver.findElementByXPath("//*[@id='welcome']");
		System.out.println("Writting Xpath for Leave List option");
		driver.findElementByXPath("//*[text() = 'Leave List']");
	}
}

