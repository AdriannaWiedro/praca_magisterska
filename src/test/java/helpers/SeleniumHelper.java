package helpers;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalTime;
import java.util.List;

public class SeleniumHelper {

    public static void clickOnElement(WebElement element) {
        element.click();
    }

    public static void selectByTextFromDropDown(WebElement element, String expectedText) {
        new Select(element).selectByVisibleText(expectedText);
    }

    public static void selectByTextFromElementList(List<WebElement> list, String expectedText) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().contains(expectedText)) {
                list.get(i).click();
                break;
            }
        }
    }

    public static String takeScreenshot (WebDriver driver) throws IOException {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenshotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("src/main/resources/screen/" + LocalTime.now().getNano() + ".png");
        Files.copy(screenshotFile.toPath(),destinationFile.toPath());
        return destinationFile.getAbsolutePath();
    }

}


