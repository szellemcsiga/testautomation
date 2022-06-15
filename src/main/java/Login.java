import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends PageBase{
    private final String url = "https://lennertamas.github.io/roxo/";
    private final By username = By.xpath("//*[@id=\"email\"]");
    private final By password = By.xpath("//*[@id=\"password\"]");
    private final By loginButton = By.xpath("//*[@id=\"login\"]/form/div[4]/button");
    private final By topLoginButton = By.xpath("//*[@id=\"login-form-button\"]");
    private final By resultMessage = By.xpath("//*[@id=\"alert\"]");

    public Login(WebDriver drv) {
        super(drv);
    }
    public void navigate()
    {
        driver.navigate().to(url);
    }
    public void setUserName(String user)
    {
        driver.findElement(username).sendKeys(user);
    }
    public void setPassword(String pass)
    {
        driver.findElement(password).sendKeys(pass);
    }
    public void clickOnLoginButton()
    {
        driver.findElement(loginButton).click();
    }

    public String getResult()
    {
        String result = driver.findElement(resultMessage).getText();

        return result;
    }
    public void clickTopLoginButton()
    {
         driver.findElement(topLoginButton).click();

    }
}
