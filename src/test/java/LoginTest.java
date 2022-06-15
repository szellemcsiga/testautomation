import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class LoginTest {

    WebDriver driver;

    @BeforeEach
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-extensions");
        //options.addArguments("--headless");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    //login with valid datas

   @Test
   public void trybuttonthrows() throws InterruptedException
   {

       Login login = new Login(driver);
    Signin signIn = new Signin(driver);
    popUp pop = new popUp(driver);
   signIn.navigate();
   pop.clickOnX();

    signIn.clickOnTopRegisterButton();
    Thread.sleep(1500);
    login.clickTopLoginButton();

   }

    @Test
    public void validLogin() throws InterruptedException
    {
     /*   Signin signin = new Signin(driver);
        signin.navigate();
        sleep(3000);
        popUp popUp = new popUp(driver);
        popUp.clickOnX();
        signin.clickOnTopRegisterButton();
        signin.addUsername("username");
        signin.addPassword("Jelszo01");
        signin.addEmail("dfsf@ggr.hu");
        signin.addDescription("-");
        signin.clickOnRegisterButton();*/



        Login login = new Login(driver);
        popUp pop = new popUp(driver);
        login.navigate();
        pop.clickOnX();
      //  login.clickTopLoginButton();
        login.setUserName("lovasia");
        login.setPassword("kiscsillag123");

        login.clickOnLoginButton();

    }


}
