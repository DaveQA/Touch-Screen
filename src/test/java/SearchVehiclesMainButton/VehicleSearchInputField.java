package SearchVehiclesMainButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class VehicleSearchInputField {
    private boolean debug = false;
    public WebDriver driver;
    private static String ANSI_RED = "\u001B[31m";
    private static String ANSI_GREEN = "\u001B[32m";
    private static String ANSI_RESET = "\u001B[0m";

    public void searchVehicleInputFieldSearchPartMainTest(WebDriver driver1) {
        clickOnSearchPartsMainButton(driver1);
        verifyOnScreenKeyboardPopUpIsDisplayed();
        typingWithTheOnScreenKeyboard();
        returnToMainMenu();
    }

    private void verifyOnScreenKeyboardPopUpIsDisplayed() {
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
        keyboardKeys.get(24).click();//F
        keyboardKeys.get(18).click();//I
        keyboardKeys.get(21).click();//A
        keyboardKeys.get(15).click();//T
        List<WebElement> enterButtonOnScreenKeyboard = driver.findElements(By.cssSelector(".special"));
        enterButtonOnScreenKeyboard.get(2).click();//Enter

        List<WebElement> resultsList = driver.findElements(By.cssSelector(".results"));
        wait.until(ExpectedConditions.elementToBeClickable(resultsList.get(0)));
        if (driver.findElement(By.cssSelector("h2")).getAttribute("innerHTML").contentEquals
                ("What make of vehicle are you looking for?")) {
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
        wait.until(ExpectedConditions.elementToBeClickable(button.get(1)));
        button.get(1).click();
    }

    private void returnToMainMenu() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> returnButton = driver.findElements(By.cssSelector("img"));
        wait.until(ExpectedConditions.elementToBeClickable(returnButton.get(1)));
        returnButton.get(1).click();
    }
}
