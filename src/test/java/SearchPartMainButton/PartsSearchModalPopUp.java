package SearchPartMainButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PartsSearchModalPopUp {
    private boolean debug = false;
    public WebDriver driver;
    private static String ANSI_RED = "\u001B[31m";
    private static String ANSI_GREEN = "\u001B[32m";
    private static String ANSI_RESET = "\u001B[0m";

    public void modalPopUpCheckMainTest(WebDriver driver1) {
        clickOnSearchPartsLandingPageButton(driver1);
        verifyModalPopUpIsDisplayed();
        returnToMainMenuWithModalWait();
    }

    private void clickOnSearchPartsLandingPageButton(WebDriver driver1) {
        driver = driver1;
        WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> button = driver.findElements(By.cssSelector("button"));
        wait.until(ExpectedConditions.elementToBeClickable(button.get(0)));
        button.get(0).click();
    }

    private void verifyModalPopUpIsDisplayed() {
        List<WebElement> acCompressorPartButton = driver.findElements(By.cssSelector(".results button"));
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.elementToBeClickable(acCompressorPartButton.get(0)));//0
        acCompressorPartButton.get(0).click();

        List<WebElement> acuraMakeButton = driver.findElements(By.cssSelector(".results button"));
        wait.until(ExpectedConditions.elementToBeClickable(acuraMakeButton.get(0)));
        acuraMakeButton.get(0).click();

        List<WebElement> clMakeButton = driver.findElements(By.cssSelector(".results button"));
        wait.until(ExpectedConditions.elementToBeClickable(clMakeButton.get(0)));
        clMakeButton.get(0).click();

        List<WebElement> year2012Button = driver.findElements(By.cssSelector(".results button"));
        wait.until(ExpectedConditions.elementToBeClickable(year2012Button.get(0)));
        year2012Button.get(0).click();

        List<WebElement> buttonToOpenModal = driver.findElements(By.cssSelector(".vehicleInfoContainer button"));
        wait.until(ExpectedConditions.elementToBeClickable(buttonToOpenModal.get(0)));
        buttonToOpenModal.get(0).click();

        List<WebElement> modalOptionButton = driver.findElements(By.cssSelector("button"));
        wait.until(ExpectedConditions.elementToBeClickable(modalOptionButton.get(10)));
        if (modalOptionButton.get(10).isDisplayed()) {
            System.out.println("Modal popup was displayed.");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println("Modal popup was not displayed, please check the application.");
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
        modalOptionButton.get(11).click();
    }

    private void returnToMainMenuWithModalWait() {
        List<WebElement> returnButton = driver.findElements(By.cssSelector("img"));
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.invisibilityOfElementLocated((By.cssSelector(".modal-body"))));
        returnButton.get(1).click();
    }
 }
