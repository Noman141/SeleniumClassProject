package selenium.class3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Noman141");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@class='button']")).click();

    }
}
