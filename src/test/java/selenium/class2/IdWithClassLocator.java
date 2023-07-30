package selenium.class2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdWithClassLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        //ID locator
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(5000);
        driver.quit();
        //ClassName locator
        driver.findElement(By.className("input_error")).sendKeys("standard_user");
        driver.findElement(By.className("input_error")).sendKeys("secret_sauce");
        driver.findElement(By.className("submit-button")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}
