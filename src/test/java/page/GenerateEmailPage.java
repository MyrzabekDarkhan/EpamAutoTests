package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GenerateEmailPage extends GoogleCloudPage {
    private static final String HOMEPAGE_URL = "https://10minutemail.com";
    protected WebDriver driver;

    @FindBy (xpath = "//input[@id='mail_address']")
    private WebElement mailToCopy;
    public GenerateEmailPage(WebDriver driver) {
        super(driver);
    }


}
