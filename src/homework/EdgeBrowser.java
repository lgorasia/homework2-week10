package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowser {
    public static void main(String[] args) {
        String baseurl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println("Current URL =" + driver.getCurrentUrl());
        System.out.println("Page Source =" + driver.getPageSource());
        WebElement emailfield = driver.findElement(By.id("txtUsername"));
        emailfield.sendKeys("abc@gmail.com");
        WebElement passeordfield = driver.findElement(By.name("txtPassword"));
        passeordfield.sendKeys("1234566");
        driver.close();

    }
}