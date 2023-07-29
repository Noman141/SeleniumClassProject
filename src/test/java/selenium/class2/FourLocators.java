package selenium.class2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FourLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
        //Name locator
        driver.findElement(By.name("username")).sendKeys("Noman141");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.className("password")).click();
        Thread.sleep(5000);
        driver.quit();
        //LinkText
        driver.findElement(By.linkText("About Us")).click();
        driver.findElement(By.linkText("Services")).click();
        Thread.sleep(5000);
        driver.quit();
        //PartialLinkText
        driver.findElement(By.partialLinkText("Adm Pag")).click();
        Thread.sleep(5000);
        driver.quit();
        //CSS-Locator
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Noman141");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("123456");
        Thread.sleep(5000);
        driver.quit();
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
