package ocsa7.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLocators {
	
	public LoginLocators(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="username")
	private WebElement usernameTB;
	
	@FindBy(name="pwd")
	private WebElement passwordTB;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public WebElement getusernameTB()
	{
		return usernameTB;
	}
	
	public WebElement getpasswordTB()
	{
		return passwordTB;
	}
	
	public WebElement getloginButton()
	{
		return loginButton;
	}
	
	public WebElement getlogoutLink()
	{
		return logoutLink;
	}
	
	public void loginApplication(String username,String password)
	{
		getusernameTB().sendKeys(username);
		getpasswordTB().sendKeys(password);
		getloginButton().click();
		
	}
   public void logoutApplication()
   {
	   getlogoutLink().click();
   }

}
