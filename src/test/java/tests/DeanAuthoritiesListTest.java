package tests;

import helpers.FileHelper;
import helpers.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class DeanAuthoritiesListTest extends BaseSeleniumTest {
    @Test
    public void downloadDeanAuthoritieslist() throws IOException {
        driver.get("https://wzr.ug.edu.pl/glowna/");
        Assert.assertEquals(driver.getTitle(), "Wydział Zarządzania Uniwersytet Gdański");
        driver.findElement(By.xpath("//span[contains(text(),'Wydzia')]")).click();
        driver.findElement(By.xpath("//ul[@class='leftlist']//a[contains(text(),'Pracownicy')]")).click();
        WebElement radioButton = driver.findElement(By.xpath("//div[@id='blok_center']//input[1]"));
        radioButton.click();
        SeleniumHelper.takeScreenshot(driver);
        System.out.println(driver.getCurrentUrl());
        List<WebElement> listOfDeanAuthorities = driver.findElements(By.className("pracownik_b"));
        System.out.println(listOfDeanAuthorities.size());
        listOfDeanAuthorities.forEach(webElement ->
                System.out.println(webElement.getText()));
        Assert.assertTrue(driver.findElement(By.className("pracownik_b")).getText().contains("prof. dr hab. Mirosław Szreder"));
        FileHelper.writeToFile("Lista władz dziekańskich została poprawnie wyświetlona");
    }
}

