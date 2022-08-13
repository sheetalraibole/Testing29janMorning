package browserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base implements ITestListener {
	public static WebDriver openChromeBrowser() {
		int testCaseID;

	 System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHEETAL\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
					 driver = new ChromeDriver();
					 return driver;
	}
	public static WebDriver openFirefoxBrowser() {
	System.setProperty("webdriver.gecko.driver",
			"C:\\Users\\SHEETAL\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver = new FirefoxDriver();
	return driver;
}
	public static WebDriver openEdgeBrowser() {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\SHEETAL\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver = new FirefoxDriver();
		return driver;
	
	
}}