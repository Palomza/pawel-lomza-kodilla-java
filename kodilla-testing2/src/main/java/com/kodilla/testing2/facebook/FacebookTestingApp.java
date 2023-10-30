package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_COOKIE = "//div[contains(@class, a164)]/button[2]";
    public static final String XPATH_CREATE = "//div[contains(@class, \"6ltg\")]/a";
    public static final String XPATH_DAY = "//div[contains(@class,\"5k\")]/span/span/select[1]";
    public static final String XPATH_MONTH = "//div[contains(@class,\"5k\")]/span/span/select[2]";
    public static final String XPATH_YEAR = "//div[contains(@class,\"5k\")]/span/span/select[3]";


    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        WebElement cookieButton = driver.findElement(By.xpath(XPATH_COOKIE));
        cookieButton.click();

        WebElement createButton = driver.findElement(By.xpath(XPATH_CREATE));
        createButton.click();
        Thread.sleep(3500);

        WebElement daySelect = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(daySelect);
        selectDay.selectByIndex(16);

        WebElement monthSelect = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(monthSelect);
        selectMonth.selectByIndex(12);

        WebElement yearSelect = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(yearSelect);
        selectYear.selectByIndex(10);
    }
}
