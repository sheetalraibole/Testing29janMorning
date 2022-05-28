package basePackage;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pomPack.HomePage;
import pomPack.LoginPage;
import utils.Utility;

public class BaseClass {
	WebDriver driver;
	LoginPage loginPage;
	int testCaseID;
	
	@BeforeClass
	
	public void launchBrowser() {

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
		
		@Test
		public void logoutFromApplication(ITestResult result) {
			
			if (ITestResult.FAILURE==result.getStatus()) {
				Utility.captureScreenshot( driver);
			}
	
	}
	

}
