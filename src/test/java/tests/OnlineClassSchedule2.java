package tests;

import com.aventstack.extentreports.ExtentTest;
import helpers.SeleniumHelper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SchedulePage;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class OnlineClassSchedule2 extends BaseSeleniumTest{
    @Test
    public void selectGroupSchedule() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online dla grupy S52-05");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        //driver.findElement(By.cssSelector("select.poleform")).click();
        SchedulePage schedulePage = new SchedulePage(driver);
        schedulePage.search();
        schedulePage.selectGroup("S52-05");
        System.out.println(driver.findElement(By.cssSelector("tbody")).getSize());
        SeleniumHelper.takeScreenshot(driver);
        test.info("Test planu zajęć dla grupy 52-05", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectGroupScheduleSecondTest() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online dla grupy S42-05");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        //driver.findElement(By.cssSelector("select.poleform")).click();
        SchedulePage schedulePage = new SchedulePage(driver);
        schedulePage.search();
        schedulePage.selectGroup("S42-05");
        System.out.println(driver.findElement(By.cssSelector("tbody")).getSize());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
        MatcherAssert.assertThat("Plan nie został wyświetlony", driver.findElement(By.cssSelector("tbody")).isEnabled(), CoreMatchers.is(true));

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("src/main/resources/screen" + LocalTime.now().getNano() + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

