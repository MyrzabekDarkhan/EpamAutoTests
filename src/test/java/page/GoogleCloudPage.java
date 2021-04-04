package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GoogleCloudPage {
    private static final String HOMEPAGE_URL = "https://cloud.google.com/";
    protected WebDriver driver;

    public GoogleCloudPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement searchInput;

    @FindBy(xpath = "//div[@class='gs-title']//b[contains(text(),'Google Cloud Platform Pricing Calculator')]")
    private WebElement foundResult;

    public void openPage() {
        driver.get(HOMEPAGE_URL);
        driver.manage().window().maximize();
    }

    public void startSearchByKeyWords() {
        new WebDriverWait(driver, 1)
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.xpath("//input[@placeholder='Search']")));
        searchInput.click();

        searchInput.sendKeys("Google Cloud Platform Pricing Calculator");
        searchInput.submit();
    }

    public void chooseItemFromSearchResults() {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.xpath("//div[@class='gs-title']//b[contains(text(),'Google Cloud Platform Pricing Calculator')]")));

        foundResult.click();
    }

}