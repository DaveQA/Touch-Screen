package NewOnYardMainButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class NewOnYardTimeSpan {
    private boolean debug = false;
    public WebDriver driver;
    private static String ANSI_RED = "\u001B[31m";
    private static String ANSI_GREEN = "\u001B[32m";
    private static String ANSI_RESET = "\u001B[0m";

    public void newOnYardTimeSpanMainTest(WebDriver driver1) {
        newOnYardLandingPage(driver1);
        timeSpan48HourOption();
        timeSpan72HourOption();
    }

      private void newOnYardLandingPage(WebDriver driver) {
        clickMainScreenNewOnYardButton(driver);
        if (driver.findElement(By.cssSelector("body")).getAttribute("innerHTML").contains("Show the latest cars in the past:")
                || driver.findElement(By.cssSelector("body")).getAttribute("innerHTML").contains("We did not find any vehicles for the last 24 Hours.")) {
            System.out.println("New On Yard screen loaded.");
            if (driver.findElements(By.cssSelector(".results")).size() > 0) {
                System.out.println("24 Hour time span found results.");
                System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
                System.out.println("=====================================================================================");
            } else if (driver.findElements(By.cssSelector(".NoResults")).size() > 0) {
                System.out.println("24 Hour time span did not found results, but search was complete.");
                System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
                System.out.println("=====================================================================================");
            }
        } else {
            System.out.println("New On Yard screen did not load, please check the application.");
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
        returnToMainMenu(driver);
    }

    private void timeSpan48HourOption() {
        clickMainScreenNewOnYardButton(driver);

        if (driver.findElements(By.cssSelector(".results")).size() > 0) {
            List<WebElement> timeSpan48HourButton = driver.findElements(By.cssSelector("h3 button"));//results found list of buttons
            timeSpan48HourButton.get(1).click();
            if (driver.findElements(By.cssSelector(".results")).size() > 0) {
                System.out.println("48 Hour time span found results.");
                System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
                System.out.println("=====================================================================================");
            } else {
                System.out.println("48 Hour time span did not found results, but search was complete.");
                System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
                System.out.println("=====================================================================================");
            }
        } else if (driver.findElements(By.cssSelector(".NoResults")).size() > 0) {
            System.out.println("48 Hour time span did not found results, but search was complete.");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println("New On Yard screen did not load, please check the application.");
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
        returnToMainMenu(driver);
    }

    private void timeSpan72HourOption() {
        clickMainScreenNewOnYardButton(driver);

        if (driver.findElements(By.cssSelector(".results")).size() > 0) {
            List<WebElement> timeSpan72HourButton = driver.findElements(By.cssSelector("h3 button"));//results found list of buttons
            timeSpan72HourButton.get(2).click();
            if (driver.findElements(By.cssSelector(".results")).size() > 0) {
                System.out.println("72 Hour time span found results.");
                System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
                System.out.println("=====================================================================================");
            } else {
                System.out.println("72 Hour time span did not found results, but search was complete.");
                System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
                System.out.println("=====================================================================================");
            }
        } else if (driver.findElements(By.cssSelector(".NoResults")).size() > 0) {
            System.out.println("72 Hour time span did not found results, but search was complete.");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println("New On Yard screen did not load, please check the application.");
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
        returnToMainMenu(driver);
    }

    private void clickMainScreenNewOnYardButton(WebDriver driver1) {
        driver = driver1;
        WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> newOnYard = driver.findElements(By.cssSelector("button"));
        wait.until(ExpectedConditions.elementToBeClickable(newOnYard.get(2)));
        newOnYard.get(2).click();
    }

    private void returnToMainMenu(WebDriver driver1) {
        driver = driver1;
        WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> returnButton = driver.findElements(By.cssSelector("img"));
        wait.until(ExpectedConditions.elementToBeClickable(returnButton.get(1)));
        returnButton.get(1).click();
    }
}
