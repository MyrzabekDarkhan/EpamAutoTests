
package test;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.GoogleCloudCalculatorPage;
import utility.ChromeDriverSet;
import java.util.ArrayList;

public class GoogleCloudTest {
    WebDriver driver = ChromeDriverSet.getDriver();

    @Test
    public void hurtMePlenty() throws InterruptedException {
        GoogleCloudCalculatorPage googleCloudPage = new GoogleCloudCalculatorPage(driver);
        googleCloudPage.openPage();
        googleCloudPage.startSearchByKeyWords();
        googleCloudPage.chooseItemFromSearchResults();
        Thread.sleep(5000);
        driver.switchTo().frame(driver.findElement(By.xpath("//devsite-iframe/iframe[contains(@src,'calculator')]")));
        driver.switchTo().frame("myFrame");
        googleCloudPage.fillOutInstances("4");
        googleCloudPage.operatingSystemsDropdown();
        googleCloudPage.machineClassDropdown();
        googleCloudPage.seriesDropdown();
        googleCloudPage.machineTypeDropDown();
        googleCloudPage.clickCheckbox();
        googleCloudPage.numOfGpuDropdown();
        googleCloudPage.gpuTypeDropdown();
        googleCloudPage.localSsdDropdown();
        googleCloudPage.locationDropdown();
        googleCloudPage.committedYearDropdown();

        googleCloudPage.estimateButton();


        Assert.assertEquals(driver.findElement(By.xpath("//div[normalize-space()='VM class: regular']")).getText(), "VM class: regular");
        Assert.assertEquals(driver.findElement(By.xpath("//div[normalize-space()='Instance type: n1-standard-8']")).getText(), "Instance type: n1-standard-8");
        Assert.assertEquals(driver.findElement(By.xpath("//div[normalize-space()='Region: Frankfurt']")).getText(), "Region: Frankfurt");
        Assert.assertEquals(driver.findElement(By.xpath("//div[normalize-space()='Total available local SSD space 2x375 GiB']")).getText(), "Total available local SSD space 2x375 GiB");
        Assert.assertEquals(driver.findElement(By.xpath("//div[normalize-space()='Commitment term: 1 Year']")).getText(), "Commitment term: 1 Year");
        googleCloudPage.closePage();
    }

    @Test
    public void hardcore() throws InterruptedException {

        GoogleCloudCalculatorPage googleCloudPage = new GoogleCloudCalculatorPage(driver);
        googleCloudPage.openPage();
        googleCloudPage.startSearchByKeyWords();
        googleCloudPage.chooseItemFromSearchResults();
        Thread.sleep(5000);
        driver.switchTo().frame(driver.findElement(By.xpath("//devsite-iframe/iframe[contains(@src,'calculator')]")));
        driver.switchTo().frame("myFrame");
        googleCloudPage.fillOutInstances("4");
        googleCloudPage.operatingSystemsDropdown();
        googleCloudPage.machineClassDropdown();
        googleCloudPage.seriesDropdown();
        googleCloudPage.machineTypeDropDown();
        googleCloudPage.clickCheckbox();
        googleCloudPage.numOfGpuDropdown();
        googleCloudPage.gpuTypeDropdown();
        googleCloudPage.localSsdDropdown();
        googleCloudPage.locationDropdown();
        googleCloudPage.committedYearDropdown();
        googleCloudPage.estimateButton();
        googleCloudPage.emailButton();
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://10minutemail.com");
        String mailToCopy = driver.findElement(By.xpath("//input[@id='mail_address']")).getText();
        driver.switchTo().window(tabs.get(0));
        googleCloudPage.pasteMail(mailToCopy);
        googleCloudPage.submitMail();
        googleCloudPage.closePage();
    }

}
