package PageFactoryLearning.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


//new commit added
public class LoginTestCase {

	public static void main(String args[])
	{
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();

	LoginElements loginPg = new LoginElements(driver);
	

	driver.get("https://rahulshettyacademy.com/client");
	driver.manage().window().maximize();
	
	loginPg.enterUsername("anshika@gmail.com");
	loginPg.enterPwd("Iamking@000");
	loginPg.login();
	
	}	
}



