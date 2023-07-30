package selenium.class3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class InformationWebElement {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement webElement = driver.findElement(By.id("user-name"));
        webElement.isDisplayed();
        webElement.sendKeys("performance_glitch_user");
        System.out.println("TagName"+ webElement.getTagName());
        System.out.println("CSSValu" + webElement.getCssValue("line-height"));
        System.out.println("Text" + webElement.findElement(By.className("login_logo")).getText());

        System.out.println("(x,y)="+ webElement.getRect().getX() +", "+ webElement.getRect().getY());

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        driver.quit();


    }
}
