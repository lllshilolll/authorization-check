package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login {

    WebDriver driver;

    public void start() {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        try {
            Thread.sleep(4_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void sgw43() {
        driver.get("https://sgw43.csb.app/");
    }

    public void writeName() {
        driver.findElement(By.cssSelector("[id='uid']")).click();
        driver.findElement(By.cssSelector("[id='uid']")).sendKeys("Test#");
    }

    public void writePassword() {
        driver.findElement(By.cssSelector("[id='password']")).click();
        driver.findElement(By.cssSelector("[id='password']")).sendKeys("password#");
    }

    public void comeIn() {
        driver.findElement(By.className("MuiButton-fullWidth")).click();
    }
}
