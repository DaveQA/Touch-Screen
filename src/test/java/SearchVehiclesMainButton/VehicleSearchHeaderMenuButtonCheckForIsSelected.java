package SearchVehiclesMainButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class VehicleSearchHeaderMenuButtonCheckForIsSelected {
    private boolean debug = false;
    public WebDriver driver;
    private static String ANSI_RED = "\u001B[31m";
    private static String ANSI_GREEN = "\u001B[32m";
    private static String ANSI_RESET = "\u001B[0m";

    public void searchVehiclesMainTest(WebDriver driver1) {
        clickMainScreenSearchVehiclesButton(driver1);
        searchVehiclesLandingPageLoaded();
        searchPartLandingPageLoaded();
        priceListLandingPageLoaded();
        notifyMeLandingPageLoaded();
        clickLogoToReturnToHomePage();
    }

    private void searchVehiclesLandingPageLoaded() {
        List<WebElement> partSearchButton = driver.findElements(By.cssSelector("header button"));
        if (partSearchButton.get(2).getAttribute("class").contains("selected")) {
            System.out.println("Vehicle Search landing page loaded.");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println(ANSI_RED + "Vehicle Search landing page did not load, please check the application." + ANSI_RESET);
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
    }

    private void searchPartLandingPageLoaded() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> headerButtons = driver.findElements(By.cssSelector("button"));

        wait.until(ExpectedConditions.elementToBeClickable(headerButtons.get(3)));
        headerButtons.get(3).click();
        List<WebElement> partSearchButton = driver.findElements(By.cssSelector("header button"));
        if (partSearchButton.get(3).getAttribute("class").contains("selected")) {
            System.out.println("Search Parts landing page loaded");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println(ANSI_RED + "Search Parts landing page did not load, please check the application." + ANSI_RESET);
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
            System.out.println("Part List landing page loaded");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println(ANSI_RED + "Part List landing page did not load, please check the application." + ANSI_RESET);
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

    private void clickMainScreenSearchVehiclesButton(WebDriver driver1) {
        driver = driver1;
        WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> notifyMeMainScreenButton = driver.findElements(By.cssSelector("button"));
        wait.until(ExpectedConditions.elementToBeClickable(notifyMeMainScreenButton.get(1)));
        notifyMeMainScreenButton.get(1).click();
    }

    private void clickLogoToReturnToHomePage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> logo = driver.findElements(By.cssSelector("img"));
        wait.until(ExpectedConditions.elementToBeClickable(logo.get(1)));
        logo.get(1).click();
    }
}
