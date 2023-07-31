package selenium.class4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
        select.selectByIndex(3);
        Thread.sleep(2000);
        select.selectByValue("7");
        Thread.sleep(2000);
        select.selectByValue("Blue");
        Thread.sleep(2000);


        for(WebElement webElement : select.getOptions()){
            System.out.println(webElement.getText());
        }

        Select multipleSelect = new Select(driver.findElement(By.id("cars")));
        multipleSelect.selectByIndex(1);
        Thread.sleep(2000);
        multipleSelect.selectByIndex(2);
        Thread.sleep(2000);

        driver.quit();
    }
}
