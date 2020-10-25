package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import helpers.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public abstract class BaseSeleniumTest {

    protected WebDriver driver;
    protected ExtentHtmlReporter reporter;
    protected ExtentReports reports;

    @BeforeTest
    public void setUpReporter() {
        reporter = new ExtentHtmlReporter("src//main//resources//reports//index.html");
        reports = new ExtentReports();
        reports.attachReporter(reporter);
    }

    @BeforeMethod
    public void setUp() throws NoSuchDriverException {
        System.out.println("Before test");
        driver = DriverFactory.getDriver(DriverType.CHROME);
        //FileHelper.createFile();
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After test");
        //driver.quit();
    }

    @AfterTest
    public void tearDownReporter() {
        System.out.println("After test");
        reporter.flush();
        reports.flush();
        //FileHelper.closeWriter();
    }

    protected MediaEntityModelProvider getScreenshot() throws IOException {
        return MediaEntityBuilder.createScreenCaptureFromPath(SeleniumHelper.
                takeScreenshot(driver)).build();
    }
}