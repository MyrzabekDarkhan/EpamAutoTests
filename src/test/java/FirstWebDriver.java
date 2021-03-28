import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstWebDriver {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://vk.com");
        By loginInputSelector = By.xpath("//input[@id='index_email']");
        WebElement loginInput = driver.findElement(loginInputSelector);
        loginInput.sendKeys("Darkhan");
        By loginButtonSelector = By.xpath("//button[@id='index_login_button']");
        WebElement loginButton = driver.findElement(loginButtonSelector);
        loginButton.click();
        Thread.sleep(3000);
        driver.quit();
    }

}
