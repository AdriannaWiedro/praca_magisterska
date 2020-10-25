package tests;

import helpers.SeleniumHelper;
import org.testng.annotations.Test;
import pages.WorkersPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class WorkersTest extends BaseSeleniumTest {

    @Test
    public void DeanAuthoritiesListUsingDesignPattern() {
        driver.get("https://wzr.ug.edu.pl/glowna/");
        WorkersPage workersPage = new WorkersPage(driver);
        SeleniumHelper.clickOnElement(workersPage.getDepartmentButton());
        SeleniumHelper.clickOnElement(workersPage.getWorkersButton());
        SeleniumHelper.clickOnElement(WorkersPage.getDeanAuthoritiesRadioButton());
        assertThat(workersPage.getDeanTitleText(), containsString("prof. dr hab. Mirosław Szreder"));
    }

}
