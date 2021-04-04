package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class PasteBinPage {

    private static final String HOMEPAGE_URL = "https://pastebin.com/";
    private WebDriver driver;
    @FindBy(xpath = "//textarea[@id='postform-text']")
    private WebElement bodyOfPost;

    @FindBy(xpath = ("//*[@id='select2-postform-format-container']"))
    private WebElement syntaxHighlight;

    @FindBy(xpath = ("//li[text()='Bash']"))
    private WebElement bash;

    @FindBy(xpath = ("//span[@id='select2-postform-expiration-container']"))
    private WebElement dropDownSelect;

    @FindBy(xpath = "//ul[@id='select2-postform-expiration-results']/li")
    private List<WebElement> options;

    @FindBy(xpath = "//input[@id='postform-name']")
    private WebElement title;

    @FindBy(xpath = "//button[normalize-space()='Create New Paste']")
    private WebElement buttonSubmit;

    public PasteBinPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openPage() {
        driver.get(HOMEPAGE_URL);
        driver.manage().window().maximize();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.xpath("//textarea[@id='postform-text']")));
    }

    public void pasteCode(String code) {

        driver.manage().window().maximize();
        bodyOfPost.sendKeys(code);
    }

    public void syntaxHighlighting() {
        syntaxHighlight.click();
        bash.click();
    }

    public void pasteExpiration() {
        dropDownSelect.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        for (int i = 0; i < options.size(); i++) {
            WebElement currentOption = options.get(i);
            if (currentOption.getText().equals("10 Minutes")) {
                currentOption.click();
                break;
            }
        }

    }

    public void pasteName(String name) {
        title.sendKeys(name);
    }

    public void clickCreateNewPaste() {
        buttonSubmit.click();
    }

    public void closePage() {
        driver.quit();
    }
}