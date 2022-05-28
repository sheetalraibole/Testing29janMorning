package utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void captureScreenshot(WebDriver driver) {
		{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyymmdd_HH.mm.ss");
			  Date date = new Date();
			  String D = sdf.format(date);
			System.out.println(D);
			
			try
			{
				TakesScreenshot s = (TakesScreenshot)driver;
				
			       File source = s.getScreenshotAs(OutputType.FILE);
			       File dest =new File("test-output\\Screenshot\\testCase2201"  +  D + ".jpeg");
			       FileHandler.copy(source, dest);
			       System.out.println("SCREENSHOT SUCCESSFUL");
				}
			catch (Exception e)
			{
				System.out.println("Exception while taking screenshot "+e.getMessage());
			}
		}
	}

}
