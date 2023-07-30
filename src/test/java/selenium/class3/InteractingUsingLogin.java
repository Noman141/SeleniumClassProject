package selenium.class3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractingUsingLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement webElement = driver.findElement(By.id("user-name"));
        webElement.sendKeys("Noman141");
        Thread.sleep(3000);
        webElement.clear();
        webElement.sendKeys("standard_user");
        Thread.sleep(3000);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Noman141");
        Thread.sleep(3000);
        password.clear();
        password.sendKeys("secret_sauce");
        Thread.sleep(3000);

        driver.findElement(By.id("login-button")).click();

        driver.quit();

    }
}
