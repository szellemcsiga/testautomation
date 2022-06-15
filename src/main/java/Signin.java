import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signin extends PageBase {

    Read util = new Read();
    String content = util.readFile("src/main/Resource.txt");

    private final By termsandcond = By.xpath("//*[@id=\"terms-and-conditions-button\"]");
    private final By xButton = By.xpath("//*[@id=\"overlay\"]/div/div[1]");

    private final String url = "https://lennertamas.github.io/roxo/";
    private final By username = By.xpath("//*[@id=\"register-username\"]");
    private final By password = By.xpath("//*[@id=\"register-password\"]");
    private final By email = By.xpath("//*[@id=\"register-email\"]");
    private final By description = By.xpath("//*[@id=\"register-description\"]");
    private final By registerButton = By.xpath("//*[@id=\"register\"]/form/div[6]/button");
    private final By topRegisterButton = By.xpath("//*[@id=\"register-form-button\"]");
    private final By resultMessage = By.xpath("//*[@id=\"register-alert\"]");


    public Signin(WebDriver drv) {
        super(drv);
    }



    public void navigate() {
        driver.navigate().to(url);
    }

    public void acceptModal(){driver.findElement(termsandcond).click();}

    public void closeModal(){driver.findElement(xButton).click();}



    public void addUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void addPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void addEmail(String emailadd) {
        driver.findElement(email).sendKeys(emailadd);
    }

    public void addDescription(String desc) {
        driver.findElement(description).sendKeys(desc);
    }

    public void clickOnRegisterButton() {
        driver.findElement(registerButton).click();
    }

    public void clickOnTopRegisterButton() {
        driver.findElement(topRegisterButton).click();
    }

    public String getResult() {
        String result = driver.findElement(resultMessage).getText();

        return result;
    }
}