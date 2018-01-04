package SearchPartMainButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PartsSearchInputField {
    private boolean debug = false;
    public WebDriver driver;
    private static String ANSI_RED = "\u001B[31m";
    private static String ANSI_GREEN = "\u001B[32m";
    private static String ANSI_RESET = "\u001B[0m";

    public void inputFieldSearchPartMainTest(WebDriver driver1) {
        clickOnSearchPartsMainButton(driver1);
        VerifyOnScreenKeyboardPopUpIsDisplayed();
        typingWithTheOnScreenKeyboard();
        returnToMainMenu();
    }

    private void VerifyOnScreenKeyboardPopUpIsDisplayed() {
        List<WebElement> inputField = driver.findElements(By.cssSelector("input"));
        inputField.get(0).click();
        if (driver.findElement(By.cssSelector(".keyboardBackground")).isDisplayed()) {
            System.out.println("On screen keyboard was displayed.");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println("On screen keyboard was not displayed, please check the application");
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
    }

    private void typingWithTheOnScreenKeyboard() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> keyboardKeys = driver.findElements(By.cssSelector(".key"));
        keyboardKeys.get(15).click();//t
        keyboardKeys.get(14).click();//r
        keyboardKeys.get(21).click();//a
        keyboardKeys.get(36).click();//n
        keyboardKeys.get(22).click();//s
        keyboardKeys.get(37).click();//m
        keyboardKeys.get(18).click();//i
        keyboardKeys.get(22).click();//s
        keyboardKeys.get(22).click();//s
        keyboardKeys.get(18).click();//i
        keyboardKeys.get(19).click();//o
        keyboardKeys.get(36).click();//n
        List<WebElement> enterButtonOnScreenKeyboard = driver.findElements(By.cssSelector(".special"));
        enterButtonOnScreenKeyboard.get(2).click();//Enter

        List<WebElement> resultsList = driver.findElements(By.cssSelector(".results"));
        wait.until(ExpectedConditions.elementToBeClickable(resultsList.get(0)));
        if (driver.findElement(By.cssSelector("h2")).getAttribute("innerHTML").contentEquals
                ("What type of part are you looking for?")) {
            System.out.println("Search using on screen keyboard completed.");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println("Search using on screen keyboard was not completed, please check application.");
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
    }

    private void clickOnSearchPartsMainButton(WebDriver driver1) {
        driver = driver1;
        WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> button = driver.findElements(By.cssSelector("button"));
        wait.until(ExpectedConditions.elementToBeClickable(button.get(0)));
        button.get(0).click();
    }

    private void returnToMainMenu() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> returnButton = driver.findElements(By.cssSelector("img"));
        wait.until(ExpectedConditions.elementToBeClickable(returnButton.get(1)));
        returnButton.get(1).click();
    }
}
