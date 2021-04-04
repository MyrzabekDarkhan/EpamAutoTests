package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.PasteBinPage;
import utility.ChromeDriverSet;

public class PasteBinTest {
    WebDriver driver = ChromeDriverSet.getDriver();
    private String code = "git config --global user.name  \"New Sheriff in Town\"" + System.lineSeparator() +
            "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")" + System.lineSeparator() +
            "git push origin master --force";

    @Test
    public void iCanWin() {
        PasteBinPage page = new PasteBinPage(driver);
        page.openPage();
        page.pasteCode("Hello from WebDriver");
        page.pasteExpiration();
        page.pasteName("helloweb");
        page.clickCreateNewPaste();
        new WebDriverWait(driver, 20);
        page.closePage();
    }

    @Test
    public void bringItOn() {
        PasteBinPage page = new PasteBinPage(driver);
        page.openPage();
        page.pasteCode(code);
        page.syntaxHighlighting();
        page.pasteExpiration();
        page.pasteName("how to gain dominance among developers");
        page.clickCreateNewPaste();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='post-view']")));

        Assert.assertEquals(driver.findElement(By.xpath("//h1[normalize-space()='how to gain dominance among developers']")).getText(), "how to gain dominance among developers");
        Assert.assertEquals(driver.findElement(By.xpath("//span[@class='kw2']")).getCssValue("color"), "rgba(185, 202, 74, 1)");
        Assert.assertEquals(page.getValueFromText(),code);
        page.closePage();
    }
}