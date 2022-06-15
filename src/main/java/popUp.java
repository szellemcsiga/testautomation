import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class popUp extends PageBase {



        By xButton = By.xpath("//*[@id=\"overlay\"]/div/div[1]");

        public popUp(WebDriver drv)
        {
            super(drv);
        }

        public void clickOnX()
        {
            driver.findElement(xButton).click();
        }

    }

