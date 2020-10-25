package pages;


import helpers.SeleniumHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkersPage {
    @FindBy(xpath = "//span[contains(text(),'Wydzia')]")
    private WebElement departmentButton;

    @FindBy(xpath = "//ul[@class='leftlist']//a[contains(text(),'Pracownicy')]")
    private WebElement workersButton;

    @FindBy(xpath = "//div[@id='blok_center']//input[1]")
    private static WebElement deanAuthoritiesRadioButton;

    @FindBy(xpath = "//a[contains(text(),'prof. dr hab. Miros')]")
    private static WebElement deanTitle;

    public static WebElement getDeanTitle() {
        return deanTitle;
    }

    public WebElement getDepartmentButton() {
        return departmentButton;
    }

    public WebElement getWorkersButton() {
        return workersButton;
    }

    public static WebElement getDeanAuthoritiesRadioButton() {
        return deanAuthoritiesRadioButton;
    }


    SeleniumHelper helper;
    WebDriver driver;
    WebDriverWait wait;

    public WorkersPage(WebDriver driver) {
        this.helper = new SeleniumHelper();
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);
    }

    public String getDeanTitleText() {
        wait.until(ExpectedConditions.visibilityOf(WorkersPage.getDeanTitle()));
        return WorkersPage.getDeanTitle().getText();
        //wait.until(ExpectedConditions.visibilityOf(WorkersPage.getDeanTitle()));
        //SeleniumHelper.selectByTextFromElementList(OnlineClassSchedulePage.getGroupName().;
    }



}
