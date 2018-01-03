package SearchPartMainButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PartsSearchHeaderMenuButtonCheckForIsSelected {
    private boolean debug = false;
    public WebDriver driver;
    private static String ANSI_RED = "\u001B[31m";
    private static String ANSI_GREEN = "\u001B[32m";
    private static String ANSI_RESET = "\u001B[0m";

    public void searchPartMainTest(WebDriver driver1) {
        searchPartLandingPageLoaded(driver1);
        vehicleSearchLandingPageLoaded();
        priceListLandingPageLoaded();
        notifyMeLandingPageLoaded();
        clickLogoToReturnToHomePage();
    }

    private void searchPartLandingPageLoaded(WebDriver driver1) {
        driver = driver1;
        WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> searchPartButton = driver.findElements(By.cssSelector("button"));

        wait.until(ExpectedConditions.elementToBeClickable(searchPartButton.get(0)));
        searchPartButton.get(0).click();
        List<WebElement> partSearchButton = driver.findElements(By.cssSelector("header button"));
        if (partSearchButton.get(3).getAttribute("class").contains("selected")) {
            System.out.println("Part Search landing page loaded");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println(ANSI_RED + "Part Search landing page did not load, please check the application." + ANSI_RESET);
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
    }

    private void vehicleSearchLandingPageLoaded() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> headerButtons = driver.findElements(By.cssSelector("button"));

        wait.until(ExpectedConditions.elementToBeClickable(headerButtons.get(2)));
        headerButtons.get(2).click();
        List<WebElement> partSearchButton = driver.findElements(By.cssSelector("header button"));
        if (partSearchButton.get(2).getAttribute("class").contains("selected")) {
            System.out.println("Vehicle Search landing page loaded");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println(ANSI_RED + "Vehicle Search landing page did not load, please check the application." + ANSI_RESET);
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
    }

    private void priceListLandingPageLoaded() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> headerButtons = driver.findElements(By.cssSelector("button"));

        wait.until(ExpectedConditions.elementToBeClickable(headerButtons.get(1)));
        headerButtons.get(1).click();
        List<WebElement> partSearchButton = driver.findElements(By.cssSelector("header button"));
        if (partSearchButton.get(1).getAttribute("class").contains("selected")) {
            System.out.println("Price List landing page loaded");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println(ANSI_RED + "Price List landing page did not load, please check the application." + ANSI_RESET);
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
    }

    private void notifyMeLandingPageLoaded() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> headerButtons = driver.findElements(By.cssSelector("button"));

        wait.until(ExpectedConditions.elementToBeClickable(headerButtons.get(0)));
        headerButtons.get(0).click();
        List<WebElement> partSearchButton = driver.findElements(By.cssSelector("header button"));
        if (partSearchButton.get(0).getAttribute("class").contains("selected")) {
            System.out.println("Notify Me landing page loaded");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println(ANSI_RED + "Notify Me landing page did not load, please check the application." + ANSI_RESET);
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
    }

    private void clickLogoToReturnToHomePage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> logo = driver.findElements(By.cssSelector("img"));
        wait.until(ExpectedConditions.elementToBeClickable(logo.get(1)));
        logo.get(1).click();
    }
}
