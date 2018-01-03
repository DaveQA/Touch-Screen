package SearchPartMainButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PartSearchSubMenuButtonsCheckForIsSelected {
    private boolean debug = false;
    public WebDriver driver;
    private static String ANSI_RED = "\u001B[31m";
    private static String ANSI_GREEN = "\u001B[32m";
    private static String ANSI_RESET = "\u001B[0m";

    public void partSearchSubMenuButtonsMainTest(WebDriver driver1) {
        mostPopularButtonIsActive(driver1);
        aThroughHButtonIsActive();
        iThroughPButtonIsActive();
        aThroughZButtonIsActive();
        clickLogoToReturnToHomePage();
    }

    private void mostPopularButtonIsActive(WebDriver driver1) {
        driver = driver1;
        WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> button = driver.findElements(By.cssSelector("button"));
        wait.until(ExpectedConditions.elementToBeClickable(button.get(0)));
        button.get(0).click();

        if (driver.findElement(By.cssSelector("h3 button:nth-child(1)")).getAttribute("class").contains("selected")) {
            System.out.println("Most Popular button is active");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println("Most popular button is not active, please check the application.");
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
    }

    private void aThroughHButtonIsActive() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("h3 button:nth-child(2)"))));
        driver.findElement(By.cssSelector("h3 button:nth-child(2)")).click();
        if (driver.findElement(By.cssSelector("h3 button:nth-child(2)")).getAttribute("class").contains("selected")) {
            System.out.println("A-H button is active");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println("Most Popular button is not active, please check the application.");
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
    }

    private void iThroughPButtonIsActive() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("h3 button:nth-child(3)"))));
        driver.findElement(By.cssSelector("h3 button:nth-child(3)")).click();
        if (driver.findElement(By.cssSelector("h3 button:nth-child(3)")).getAttribute("class").contains("selected")) {
            System.out.println("I-P button is active");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println("I-P button is not active, please check the application.");
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
    }

    private void aThroughZButtonIsActive() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("h3 button:nth-child(4)"))));
        driver.findElement(By.cssSelector("h3 button:nth-child(4)")).click();
        if (driver.findElement(By.cssSelector("h3 button:nth-child(4)")).getAttribute("class").contains("selected")) {
            System.out.println("Q-Z button is active");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println("Q-Z button is not active, please check the application.");
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
