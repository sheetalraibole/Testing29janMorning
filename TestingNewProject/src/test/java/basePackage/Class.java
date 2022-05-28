package basePackage;

	import org.apache.commons.io.FileUtils;
	
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	public class Class {

	    @Test
	    public void loginTest2() throws IOException {
	        // open the browser	
	    	System.setProperty("webdriver.chrome.driver",
	    			"C:\\Users\\SHEETAL\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        // maximize
	        driver.manage().window().maximize();
	        // open url
	        driver.get("https://google.com");

	        // 1. create the object reference of TakesScreenshot say (ts)
	        // assign the current driver to it typecast driver to TakesScreenshot
	        TakesScreenshot ts = (TakesScreenshot) driver;

	        // 2. using ts (object reference of TakesScreenshot) call the method
	        // getScreenshotAs() --> store its value into a file object
	        File srcFile = ts.getScreenshotAs(OutputType.FILE);

	        String timeStamp = new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());
	        String fileName = "IMG"+timeStamp+".png";

	        // 3. copy this file object into a real image file
	        FileUtils.copyFile(srcFile,new File("D:\\screenshots\\"+fileName));
	    }
	
}
