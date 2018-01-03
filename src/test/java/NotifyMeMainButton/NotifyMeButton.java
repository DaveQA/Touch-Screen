package NotifyMeMainButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class NotifyMeButton {
    private boolean debug = false;
    public WebDriver driver;
    private static String ANSI_RED = "\u001B[31m";
    private static String ANSI_GREEN = "\u001B[32m";
    private static String ANSI_RESET = "\u001B[0m";

    public void notifyMeMainTest(WebDriver driver1) {
        clickMainScreenNotifyMeButton(driver1);
        signUpForANotifyMeWithJustEmail();
        signUpForANotifyMeWithJustUSAPhoneNumber();
        signUpForANotifyMeWithJustMexicanPhoneNumber();
    }

    private void signUpForANotifyMeWithJustEmail() {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        List<WebElement> acuraMakeButton = driver.findElements(By.cssSelector(".results button"));
        wait.until(ExpectedConditions.elementToBeClickable(acuraMakeButton.get(0)));
        acuraMakeButton.get(0).click();

        List<WebElement> clModelButton = driver.findElements(By.cssSelector(".results button"));
        wait.until(ExpectedConditions.elementToBeClickable(clModelButton.get(0)));
        clModelButton.get(0).click();

        List<WebElement> year2012Button = driver.findElements(By.cssSelector(".results button"));
        wait.until(ExpectedConditions.elementToBeClickable(year2012Button.get(0)));
        year2012Button.get(0).click();

        List<WebElement> inputEmail = driver.findElements(By.cssSelector("input"));
        inputEmail.get(6).click();
        inputEmail.get(6).sendKeys("dave@pullapart.com");
        List<WebElement> onScreenKeyboardEnterKey = driver.findElements(By.cssSelector(".special"));
        onScreenKeyboardEnterKey.get(2).click();
        List<WebElement> inputNotifyMeButton = driver.findElements(By.cssSelector("input"));
        inputNotifyMeButton.get(20).click();
        if (driver.findElement(By.cssSelector("h2")).getAttribute("innerHTML").contentEquals("You're all set!")) {
            System.out.println("Notify Me was submitted with Email.");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println("Notify Me was not submitted, please check the application.");
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
        returnToMainMenu(driver);
    }

    private void signUpForANotifyMeWithJustUSAPhoneNumber() {
        clickMainScreenNotifyMeButton(driver);
        WebDriverWait wait = new WebDriverWait(driver, 30);

        List<WebElement> acuraMakeButton = driver.findElements(By.cssSelector(".results button"));
        wait.until(ExpectedConditions.elementToBeClickable(acuraMakeButton.get(0)));
        acuraMakeButton.get(0).click();

        List<WebElement> clModelButton = driver.findElements(By.cssSelector(".results button"));
        wait.until(ExpectedConditions.elementToBeClickable(clModelButton.get(0)));
        clModelButton.get(0).click();

        List<WebElement> year2012Button = driver.findElements(By.cssSelector(".results button"));
        wait.until(ExpectedConditions.elementToBeClickable(year2012Button.get(0)));
        year2012Button.get(0).click();

        List<WebElement> inputEmail = driver.findElements(By.cssSelector("input"));
        inputEmail.get(6).click();
        inputEmail.get(7).sendKeys("5555555555");//There are no dashes on the on screen numerical keyboard
        List<WebElement> onScreenKeyboardEnterKey = driver.findElements(By.cssSelector(".special"));
        onScreenKeyboardEnterKey.get(2).click();
        List<WebElement> inputNotifyMeButton = driver.findElements(By.cssSelector("input"));
        inputNotifyMeButton.get(20).click();
        if (driver.findElement(By.cssSelector("h2")).getAttribute("innerHTML").contentEquals("You're all set!")) {
            System.out.println("Notify Me was submitted with USA Phone Number.");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println("Notify Me was not submitted, please check the application.");
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
        returnToMainMenu(driver);
    }

    private void signUpForANotifyMeWithJustMexicanPhoneNumber() {
        clickMainScreenNotifyMeButton(driver);
        WebDriverWait wait = new WebDriverWait(driver, 30);

        List<WebElement> acuraMakeButton = driver.findElements(By.cssSelector(".results button"));
        wait.until(ExpectedConditions.elementToBeClickable(acuraMakeButton.get(0)));
        acuraMakeButton.get(0).click();

        List<WebElement> clModelButton = driver.findElements(By.cssSelector(".results button"));
        wait.until(ExpectedConditions.elementToBeClickable(clModelButton.get(0)));
        clModelButton.get(0).click();

        List<WebElement> year2012Button = driver.findElements(By.cssSelector(".results button"));
        wait.until(ExpectedConditions.elementToBeClickable(year2012Button.get(0)));
        year2012Button.get(0).click();

        List<WebElement> inputEmail = driver.findElements(By.cssSelector("input"));
        inputEmail.get(6).click();
        inputEmail.get(7).sendKeys("8888888888");//There are no dashes on the on screen numerical keyboard
        List<WebElement> onScreenKeyboardEnterKey = driver.findElements(By.cssSelector(".special"));
        onScreenKeyboardEnterKey.get(2).click();
        List<WebElement> countryFlagMX = driver.findElements(By.cssSelector(".CountryFlag"));
        countryFlagMX.get(1).click();
        List<WebElement> inputNotifyMeButton = driver.findElements(By.cssSelector("input"));
        inputNotifyMeButton.get(20).click();
        if (driver.findElement(By.cssSelector("h2")).getAttribute("innerHTML").contentEquals("You're all set!")) {
            System.out.println("Notify Me was submitted with Mexican Phone Number.");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println("Notify Me was not submitted, please check the application.");
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
        returnToMainMenu(driver);
    }

    private void signUpForANotifyMeWithJustNeitherEmailOrPhoneNumber() {
        //Submit button does not go active till an email and/or phone number has been entered
    }

    private void clickMainScreenNotifyMeButton(WebDriver driver1) {
        driver = driver1;
        WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> notifyMeMainScreenButton = driver.findElements(By.cssSelector("button"));
        wait.until(ExpectedConditions.elementToBeClickable(notifyMeMainScreenButton.get(3)));
        notifyMeMainScreenButton.get(3).click();
    }

    private void returnToMainMenu(WebDriver driver1) {
        driver = driver1;
        WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> returnButton = driver.findElements(By.cssSelector("img"));
        wait.until(ExpectedConditions.elementToBeClickable(returnButton.get(1)));
        returnButton.get(1).click();
    }
}
