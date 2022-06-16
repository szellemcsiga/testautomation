import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Blog extends PageBase {


    public Blog(WebDriver drv) {
        super(drv);
    }

    private final By nextLink = By.xpath("//*[@id=\"content\"]/section/div/div/nav/ul/li[3]/a");

    private final By tableRowVisible = By.xpath("//*[@style=\"display: table-row;\"]");
    //*[@id="content"]/section/div/div/nav/ul/li[3]/a
//#content > section > div > div > nav > ul > li:nth-child(3) > a


    public int numberOfRows() {
        int num = 0;

        List<WebElement> rows = driver.findElements(tableRowVisible);
        num = rows.size();

        return num;
    }


    public boolean isLastPage() {
        String attr = driver.findElement(nextLink).getAttribute("rel");
        return attr.equals("display: none;");
    }

    public void clickNext() {
        if (!isLastPage()) {
            driver.findElement(nextLink).click();
        }
    }
}





