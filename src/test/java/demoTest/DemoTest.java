package demoTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {

    @Test
    public void openGoogle() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
WebDriverManager.chromedriver().clearResolutionCache().setup();
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.apple.com");
        driver.manage().window().maximize();
        System.out.println("Title of the page is: " + driver.getTitle());
        // Add a sleep to see the browser before it closes
        try {
            Thread.sleep(5000); // Sleep for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }       
        driver.close();
        driver.quit();
    }
}
