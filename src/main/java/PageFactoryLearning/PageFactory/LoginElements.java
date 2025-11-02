package PageFactoryLearning.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginElements {

	WebDriver driver;
	
	LoginElements(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver, this);
	}
//updated	
@FindBy(id="userEmail")
WebElement username;


@FindBy(id="userPassword")
WebElement userPwd;

@FindBy(id="login")
WebElement submit;


public void enterUsername(String uname)
{
username.sendKeys(uname);
}

public void enterPwd(String pwd)
{
	userPwd.sendKeys(pwd);
}

public void login()
{
submit.click();
}

}
