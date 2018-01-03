package SearchPartMainButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PartSearchMostPopular {
    private boolean debug = false;
    public WebDriver driver;
    private static String ANSI_RED = "\u001B[31m";
    private static String ANSI_GREEN = "\u001B[32m";
    private static String ANSI_RESET = "\u001B[0m";

    public void mostPopularPartSearchLookUpMainTest(WebDriver driver1) {
        clickOnSearchPartsLandingPageButton(driver1);
        partLookUpUsingMostPopularButtonWithResults();
        partLookUpUsingMostPopularButtonWithNoResults();
        partLookUpUsingMostPopularButtonWithExtraPartSelectionStep();
    }

    private void clickOnSearchPartsLandingPageButton(WebDriver driver1) {
        driver = driver1;
        WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> button = driver.findElements(By.cssSelector("button"));
        wait.until(ExpectedConditions.elementToBeClickable(button.get(0)));
        button.get(0).click();
    }

    private void partLookUpUsingMostPopularButtonWithResults() {
        List<WebElement> acCompressorPartButton = driver.findElements(By.cssSelector(".results button"));
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.elementToBeClickable(acCompressorPartButton.get(0)));
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

        if (driver.findElement(By.className("content")).getText().contains("Other vehicles which may interchange with this model")) {
            System.out.println("Search completed, A/C Compressor for an Acura CL 2012");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else if (driver.findElement(By.className("content")).getText().contains(" returned no results for this location.")) {
            System.out.println("Search completed with no results found.");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println("Search did not complete, please check the application.");
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
        returnToMainMenu();
        mainScreenSearchPartsButton();
    }

    private void partLookUpUsingMostPopularButtonWithNoResults() {
        List<WebElement> windshieldPartButton = driver.findElements(By.cssSelector(".results button"));
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.elementToBeClickable(windshieldPartButton.get(34)));
        windshieldPartButton.get(34).click();

        List<WebElement> daewooMakeButton = driver.findElements(By.cssSelector(".results button"));
        wait.until(ExpectedConditions.elementToBeClickable(daewooMakeButton.get(19)));
        daewooMakeButton.get(19).click();

        List<WebElement> korrandoMakeButton = driver.findElements(By.cssSelector(".results button"));
        wait.until(ExpectedConditions.elementToBeClickable(korrandoMakeButton.get(0)));
        korrandoMakeButton.get(0).click();

        List<WebElement> year2012Button = driver.findElements(By.cssSelector(".results button"));
        wait.until(ExpectedConditions.elementToBeClickable(year2012Button.get(0)));
        year2012Button.get(0).click();

        if (driver.findElement(By.className("content")).getText().contains(" returned no results for this location.")) {
            System.out.println("Search completed, Windshield for a Daewoo Korrando 2012");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else if (driver.findElement(By.className("content")).getText().contains("Other vehicles which may interchange with this model")) {
            System.out.println("Search completed with no results found.");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println("Search did not complete, please check the application.");
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
        returnToMainMenu();
        mainScreenSearchPartsButton();
    }

    private void partLookUpUsingMostPopularButtonWithExtraPartSelectionStep() {
        List<WebElement> hubPartButton = driver.findElements(By.cssSelector(".results button"));
        hubPartButton.get(19).click();

        List<WebElement> bmwMakeButton = driver.findElements(By.cssSelector(".results button"));
        bmwMakeButton.get(10).click();

        List<WebElement> m3ModelButton = driver.findElements(By.cssSelector(".results button"));
        m3ModelButton.get(20).click();

        List<WebElement> year1997Button = driver.findElements(By.cssSelector(".results button"));
        year1997Button.get(15).click();

        List<WebElement> extraHUBButton = driver.findElements(By.cssSelector("button"));
        extraHUBButton.get(4).click();

        if (driver.findElement(By.className("content")).getText().contains(" returned no results for this location.")) {
            System.out.println("Search completed, HUB with the more accurate information option of  for a 1997 BMW M3");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else if (driver.findElement(By.className("content")).getText().contains("Other vehicles which may interchange with this model")) {
            System.out.println("Search completed with no results found.");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println("Search did not complete, please check the application.");
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
        returnToMainMenu();
    }

    private void returnToMainMenu() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> returnButton = driver.findElements(By.cssSelector("img"));
        wait.until(ExpectedConditions.elementToBeClickable(returnButton.get(1)));
        returnButton.get(1).click();
    }

    private void mainScreenSearchPartsButton() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> button = driver.findElements(By.cssSelector("button"));
        wait.until(ExpectedConditions.elementToBeClickable(button.get(0)));
        button.get(0).click();
    }
}
