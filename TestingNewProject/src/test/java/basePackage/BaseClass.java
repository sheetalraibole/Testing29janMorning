package basePackage;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pomPack.HomePage;
import pomPack.LoginPage;
import utils.Utility;

public class BaseClass {
	WebDriver driver;
	LoginPage loginPage;
	int testCaseID;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@BeforeClass
	
	public void launchBrowser() {
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHEETAL\\chromedriver_win32\\chromedriver.exe");
					 driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
	
		driver.get("https://www.opencart.com/");
	driver.manage().window().maximize();
	}
	@AfterClass
	public void end() {
		driver.quit();
		
	}
	@Test
	public void loginPage() throws InterruptedException {
		
		 loginPage=new LoginPage(driver);
		loginPage.login1();
		loginPage.sendusername("sheetalraibole6@gmail.com");
		loginPage.sendpassword("helloworld@123");
		Thread.sleep(2000);
		loginPage.clickonlogin();
		
	}
	@Test
	public void homePage() {
		testCaseID =2201;
		HomePage homePage= new HomePage(driver);
		homePage.demo();}
		
		
	
	}
	

