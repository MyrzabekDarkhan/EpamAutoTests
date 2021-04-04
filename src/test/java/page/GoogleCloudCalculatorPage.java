package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class GoogleCloudCalculatorPage extends GoogleCloudPage {

    @FindBy(xpath = "//input[@id='input_65']")
    private WebElement inputInstance;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_59']")
    private WebElement dropDownItemMachineClass;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_58']")
    private WebElement dropDownItemOperatingSystem;

    @FindBy(xpath = "//md-option[@id='select_option_67']")
    private WebElement foundElementInDropDownOperatingSystem;

    @FindBy(xpath = "//md-option[@id='select_option_80']")
    private WebElement foundElementInDropDownMachineClass;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_61']")
    private WebElement dropDownSeries;

    @FindBy(xpath = "//md-option[@id='select_option_190']")
    private WebElement getFoundElementInDropDownSeries;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_62']")
    private WebElement dropDownMachineType;

    @FindBy(xpath = "//md-option[@id='select_option_365']")
    private WebElement getFoundElementInDropDownMachineType;

    @FindBy(xpath = "(//md-checkbox)[1]/div[1]")
    private WebElement checkBoxGPU;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_397']")
    private WebElement numOfGpuField;

    @FindBy(xpath = "//md-option[@id='select_option_404']")
    private WebElement getFoundElementInDropDownNumOfGpu;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_398']")
    private WebElement gpuType;

    @FindBy(xpath = "//md-option[@id='select_option_411']")
    private WebElement getFoundElementInDropDownGpuType;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_63']")
    private WebElement dataCenterLocation;

    @FindBy(xpath = "//md-option[@id='select_option_207']")
    private WebElement getFoundElementInDropDownLocation;


    @FindBy(xpath = "//md-select[@id='select_360']")
    private WebElement localSsd;

    @FindBy(xpath = "//md-option[@id='select_option_386']")
    private WebElement getFoundElementInDropDownLocalSsd;

    @FindBy(xpath = "//md-select-value[@id='select_value_label_64']")
    private WebElement committedYear;

    @FindBy(xpath = "//md-option[@id='select_option_99']")
    private WebElement getFoundElementInDropDownCommittedYear;


    @FindBy(xpath = "//button[@aria-label='Add to Estimate']")
    private WebElement buttonEstimate;

    @FindBy(xpath = "//button[@aria-label='Email Estimate']")
    private WebElement buttonEmail;

    @FindBy(xpath = "//input[@id='input_482']")
    private WebElement emailInput;

    @FindBy(xpath = "//button[@aria-label='Send Email']")
    private WebElement buttonSend;

    public GoogleCloudCalculatorPage(WebDriver driver) {
        super(driver);
    }


    public void fillOutInstances(String instance) {
        inputInstance.sendKeys(instance);
    }

    public void operatingSystemsDropdown() {
        dropDownItemOperatingSystem.click();
        new WebDriverWait(driver, 2)
                .until(ExpectedConditions.visibilityOf(foundElementInDropDownOperatingSystem));
        foundElementInDropDownOperatingSystem.click();
    }

    public void machineClassDropdown() {
        dropDownItemMachineClass.click();
        new WebDriverWait(driver, 2)
                .until(ExpectedConditions.visibilityOf(foundElementInDropDownMachineClass));
        foundElementInDropDownMachineClass.click();
    }

    public void seriesDropdown() {
        dropDownSeries.click();
        new WebDriverWait(driver, 2)
                .until(ExpectedConditions.visibilityOf(getFoundElementInDropDownSeries));
        getFoundElementInDropDownSeries.click();
    }

    public void machineTypeDropDown() {
        dropDownMachineType.click();
        new WebDriverWait(driver, 2)
                .until(ExpectedConditions.visibilityOf(getFoundElementInDropDownMachineType));
        getFoundElementInDropDownMachineType.click();
    }

    public void clickCheckbox() {
        checkBoxGPU.click();
    }

    public void numOfGpuDropdown() {
        numOfGpuField.click();
        new WebDriverWait(driver, 2)
                .until(ExpectedConditions.visibilityOf(getFoundElementInDropDownNumOfGpu));
        getFoundElementInDropDownNumOfGpu.click();
    }

    public void gpuTypeDropdown() {
        gpuType.click();
        new WebDriverWait(driver, 2)
                .until(ExpectedConditions.visibilityOf(getFoundElementInDropDownGpuType));
        getFoundElementInDropDownGpuType.click();
    }

    public void localSsdDropdown() {
        localSsd.click();
        new WebDriverWait(driver, 2)
                .until(ExpectedConditions.visibilityOf(getFoundElementInDropDownLocalSsd));
        getFoundElementInDropDownLocalSsd.click();
    }

    public void locationDropdown() {
        dataCenterLocation.click();
        new WebDriverWait(driver, 2)
                .until(ExpectedConditions.visibilityOf(getFoundElementInDropDownLocation));
        getFoundElementInDropDownLocation.click();
    }

    public void committedYearDropdown() {
        committedYear.click();
        new WebDriverWait(driver, 2)
                .until(ExpectedConditions.visibilityOf(getFoundElementInDropDownCommittedYear));
        getFoundElementInDropDownCommittedYear.click();
    }

    public void estimateButton() {

        new WebDriverWait(driver, 2)
                .until(ExpectedConditions.visibilityOf(buttonEstimate));
        buttonEstimate.click();
    }


    public void emailButton() {

        new WebDriverWait(driver, 4)
                .until(ExpectedConditions.visibilityOf(buttonEmail));
        buttonEmail.click();
    }

    public void pasteMail(String mail) {
        new WebDriverWait(driver, 2)
                .until(ExpectedConditions.visibilityOf(emailInput));
        emailInput.sendKeys(mail);
    }

    public void submitMail(){
        new WebDriverWait(driver, 2)
                .until(ExpectedConditions.visibilityOf(buttonEmail));
        buttonEmail.click();
    }

    public void closePage() {
        driver.quit();
    }

}