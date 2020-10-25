package pages;
import helpers.SeleniumHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class OnlineClassSchedulePage {

    @FindBy(tagName ="option")
    private static List<WebElement> groupName;


    public static List<WebElement> getGroupName() {
        return groupName;
    }

    public void setGroupName(List<WebElement> groupName) {
        OnlineClassSchedulePage.groupName = groupName;
    }

    @FindBy(css = "select.poleform")
    private WebElement groupList;

    public WebElement getGroupList() {
        return groupList;
    }

    public void setGroupList(WebElement groupList) {
        this.groupList = groupList;
    }

    @FindBy(css = "tbody")
    private WebElement schedule;

    public WebElement getSchedule() {
        return schedule;
    }

    public void setSchedule(WebElement schedule) {
        this.schedule = schedule;
    }


    SeleniumHelper helper;
    WebDriver driver;
    WebDriverWait wait;

    public OnlineClassSchedulePage(WebDriver driver) {
        this.helper = new SeleniumHelper();
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);
    }

    public void search() {
        getGroupList().click();
    }

    public void selectGroup(String group) {
        wait.until(ExpectedConditions.visibilityOfAllElements(OnlineClassSchedulePage.getGroupName()));
        SeleniumHelper.selectByTextFromElementList(OnlineClassSchedulePage.getGroupName(), group);
    }

}





