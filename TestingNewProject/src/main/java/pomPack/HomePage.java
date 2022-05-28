package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
public  HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}
@FindBy (xpath =("//a[text()='Demo'][1]"))
private WebElement demo;

@FindBy (xpath= ("//a[@class='btn btn-black navbar-btn']"))
private WebElement logout;


public void demo() {
	demo.click();
	
	}

public void clickOnLogout() {
	logout.click();
}
	
	
	
}