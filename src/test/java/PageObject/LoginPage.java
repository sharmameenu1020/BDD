package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    WebDriver ldriver;
public LoginPage(WebDriver driver)
{
    ldriver = driver;
    PageFactory.initElements(driver,this);
}
@FindBy(id = "Email")
    WebElement email;
@FindBy(id = "Password")
    WebElement password;
@FindBy(linkText = "Logout")
    WebElement logout;
@FindBy(xpath = "/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
     WebElement button;


public void enterMailId(String mail)
{
    email.sendKeys(mail);
    email.clear();
}
public void enterPassword(String pword)
{
    password.sendKeys(pword);
    password.clear();
}
public void clickOnLoginButton()
{
    button.click();
}
public void clickOnLogoutButton()
{
    logout.click();
}


}
