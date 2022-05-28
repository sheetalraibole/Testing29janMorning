package pomPack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	WebDriver driver;
	//WebDriverWait wait;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath =("(//a[text()='Login'])[2]"))
	private WebElement login;
	
	@FindBy (xpath ="//input[@name='email']")
	private WebElement username;
	
	@FindBy (xpath ="//input[@name='password']")
	private WebElement password ;
	
	@FindBy (xpath ="//button[text()='Login'")
	private WebElement submit;
	
    public void login1() {
	      login.click();
	      
    }
	public void sendusername(String text) {
		username.sendKeys(text);
	}
	public void sendpassword(String text) {
		password.sendKeys(text);
	}

    public void clickonlogin() {
  //  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   // wait.until(ExpectedConditions.visibilityOf(submit));
	submit.click();
}
}
	

	
	
	
	
	
	

