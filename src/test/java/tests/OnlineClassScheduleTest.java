package tests;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OnlineClassSchedulePage;

import java.io.IOException;

public class OnlineClassScheduleTest extends BaseSeleniumTest{


    @Test
    public void selectScheduleForGroupS4101() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S41-01");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S41-01");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S41-01", getScreenshot());
    }

    @Test
    public void selectScheduleForGroupS4105() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S41-05");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S41-05");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S41-05", getScreenshot());
    }

    @Test
    public void selectScheduleForGroupS4115() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S41-15");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S41-15");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S41-15", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS4120() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S41-20");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S41-20");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S41-20", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS4121() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S41-21");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S41-21");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S41-21", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS4122() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S41-22");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S41-22");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S41-22", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS4201() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S42-01");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S42-01");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S42-01", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS4205() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S42-05");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S42-05");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S42-05", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS4211() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S42-11");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S42-11");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S42-11", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS4301() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S43-01");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S43-01");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S43-01", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS4302() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S43-02");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S43-02");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S43-02", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS4305() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S43-05");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S43-05");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S43-05", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS4306() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S43-06");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S43-06");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S43-06", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS4311() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S43-11");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S43-11");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S43-11", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS4331() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S43-31");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S43-31");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S43-31", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS4401() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S44-01");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S44-01");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S44-01", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS5101() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S51-01");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S51-01");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S51-01", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS5105() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S51-05");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S51-05");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S51-05", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS5111() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S51-11");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S51-11");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S51-11", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS5115() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S51-15");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S51-15");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S51-15", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS5116() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S51-16");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S51-16");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S51-16", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS5121() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S51-21");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S51-21");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S51-21", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS5201() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S52-01");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S52-01");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S52-01", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS5205() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S52-05");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S52-05");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S52-05", getScreenshot());
    }

    @Test
    public void selectScheduleForGroupS5211() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S52-11");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S52-11");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S52-11", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS5301() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S53-01");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S53-01");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S53-01", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS5302() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S53-02");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S53-02");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S53-02", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS5305() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S53-05");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S53-05");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S53-05", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS5306() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S53-06");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S53-06");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S53-06", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS5311() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S53-11");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S53-11");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S53-11", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS5321() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S53-21");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S53-21");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S53-21", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForGroupS5331() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online - grupa S53-31");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("S53-31");
        test.info("Zajęcia za pośrednictwem MS Teams grupa S53-31", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }

    @Test
    public void selectScheduleForWDW() throws IOException {
        ExtentTest test = reports.createTest("Plan zajęć online WDW");
        driver.get("https://wzr.ug.edu.pl/studia/index.php?str=1880");
        //driver.findElement(By.cssSelector("select.poleform")).click();
        OnlineClassSchedulePage onlineClassSchedulePage = new OnlineClassSchedulePage(driver);
        onlineClassSchedulePage.search();
        onlineClassSchedulePage.selectGroup("WDW");
        test.info("Zajęcia za pośrednictwem MS Teams - WDW", getScreenshot());
        Assert.assertTrue(driver.findElement(By.cssSelector("tbody")).getText().contains("Przedmiot"));
    }
}
