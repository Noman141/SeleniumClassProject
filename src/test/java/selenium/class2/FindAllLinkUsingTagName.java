package selenium.class2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindAllLinkUsingTagName {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();

        List<WebElement> webElements = driver.findElements(By.tagName("a"));
        for (WebElement webElement:webElements) {
            System.out.println(webElement.getAttribute("href"));

        }
        Thread.sleep(10000);

        System.out.println(driver.getTitle());
        driver.quit();
    }
}
