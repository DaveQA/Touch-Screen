package NewOnYardMainButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class NewOnYardNotifyMeButton {
    private boolean debug = false;
    public WebDriver driver;
    private static String ANSI_RED = "\u001B[31m";
    private static String ANSI_GREEN = "\u001B[32m";
    private static String ANSI_RESET = "\u001B[0m";

    public void newOnYardNotifyMeMainTest(WebDriver driver1) {
        clickNotifyMeButtonInTheNewOnYardSection(driver1);
    }

    private void clickNotifyMeButtonInTheNewOnYardSection(WebDriver driver) {
        clickMainScreenNewOnYardButton(driver);
        if (driver.findElements(By.cssSelector(".results")).size() > 0) {
            List<WebElement> headerNotifyMeButton = driver.findElements(By.cssSelector(".header button"));
            headerNotifyMeButton.get(0).click();
            if (driver.findElement(By.cssSelector("h2")).getAttribute("innerHTML").contentEquals(
                    "How would you like to be notified?")) {
                System.out.println("Notify Me button working as intended");
                System.out.println(ANSI_GREEN + "1Test Passed" + ANSI_RESET);
                System.out.println("=====================================================================================");
            } else {
                System.out.println("Notify Me button not working as intended, please check the application.");
                System.out.println(ANSI_RED + "2Test Failed" + ANSI_RESET);
                System.out.println("=====================================================================================");
            }
        }else{
            List<WebElement> notifyMeButton = driver.findElements(By.cssSelector(".row button"));
            notifyMeButton.get(8).click();
            if (driver.findElement(By.cssSelector("h2")).getAttribute("innerHTML").contains(
                    "How would you like to be notified?")) {
                System.out.println("Notify Me button working as intended");
                System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
                System.out.println("=====================================================================================");
            } else {
                System.out.println("Notify Me button not working as intended, please check the application.");
                System.out.println(ANSI_RED + "3Test Failed" + ANSI_RESET);
                System.out.println("=====================================================================================");
            }
        }
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
