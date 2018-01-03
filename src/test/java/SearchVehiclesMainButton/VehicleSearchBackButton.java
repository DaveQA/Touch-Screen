package SearchVehiclesMainButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class VehicleSearchBackButton {
    private boolean debug = false;
    public WebDriver driver;
    private static String ANSI_RED = "\u001B[31m";
    private static String ANSI_GREEN = "\u001B[32m";
    private static String ANSI_RESET = "\u001B[0m";

    public void vehicleSearchBackButtonSearchPartMainTest(WebDriver driver1) {
        mainScreenSearchPartsButton(driver1);
        backButtonOnTheSearchPartsPartScreen();
//        backButtonOnTheSearchPartsMakeScreen();
//        backButtonOnTheSearchPartsModelScreen();
//        backButtonOnTheSearchPartsYearScreen();
//        backButtonOnTheSearchPartsCantFindYourPage();
//        returnToMainMenu();
    }

    private void backButtonOnTheSearchPartsPartScreen() {
        List<WebElement> backButton = driver.findElements(By.cssSelector(".scrollarea button"));
        backButton.get(2).click();
        if (driver.findElement(By.cssSelector("h2")).getAttribute("innerHTML").contentEquals("Welcome to Pull-A-Part!" +
                "  How would you like to begin your search?")) {
            System.out.println("Back button from Vehicle Search screen working as intended.");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println("Back button from Search Parts Part screen not working, please check the application.");
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
    }

    private void backButtonOnTheSearchPartsMakeScreen() {
        mainScreenSearchPartsButton(driver);
        List<WebElement> partButton = driver.findElements(By.cssSelector(".results button"));
        partButton.get(0).click();

        List<WebElement> backButton = driver.findElements(By.cssSelector(".scrollarea button"));
        backButton.get(2).click();
        if (driver.findElement(By.cssSelector("h2")).getAttribute("innerHTML").contentEquals("What type of part are you looking for?")) {
            System.out.println("Back button from Search Parts Make screen working as intended.");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println("Back button from Search Parts Make screen not working, please check the application.");
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
    }

    private void backButtonOnTheSearchPartsModelScreen() {
        List<WebElement> partButton = driver.findElements(By.cssSelector(".results button"));
        partButton.get(0).click();
        List<WebElement> makeButton = driver.findElements(By.cssSelector(".results button"));
        makeButton.get(0).click();

        List<WebElement> backButton = driver.findElements(By.cssSelector(".scrollarea button"));
        backButton.get(2).click();
        if (driver.findElement(By.cssSelector("h2")).getAttribute("innerHTML").contentEquals("What make of vehicle are you looking for?")) {
            System.out.println("Back button from Search Parts Model screen working as intended.");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println("Back button from Search Parts Model screen not working, please check the application.");
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
    }

    private void backButtonOnTheSearchPartsYearScreen() {
        List<WebElement> makeButton = driver.findElements(By.cssSelector(".results button"));
        makeButton.get(0).click();
        List<WebElement> yearButton = driver.findElements(By.cssSelector(".results button"));
        yearButton.get(0).click();

        List<WebElement> backButton = driver.findElements(By.cssSelector(".scrollarea button"));
        backButton.get(0).click();
        if (driver.findElement(By.cssSelector("h1")).getAttribute("innerHTML").contentEquals("We couldn't find the page you're looking for.")) {
            System.out.println("Back button from Search Parts Year screen working as intended.");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println("Back button from Search Parts Year screen not working, please check the application.");
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
    }

    private void backButtonOnTheSearchPartsCantFindYourPage() {
        List<WebElement> back = driver.findElements(By.cssSelector("button"));
        back.get(4).click();

        List<WebElement> yearButton = driver.findElements(By.cssSelector(".results button"));
        yearButton.get(0).click();

        List<WebElement> backButton = driver.findElements(By.cssSelector(".scrollarea button"));
        backButton.get(2).click();

        if (driver.findElement(By.cssSelector("h2")).getAttribute("innerHTML").contains(" are you looking for?")) {
            System.out.println("Back button from Search Parts Results page working as intended.");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        } else {
            System.out.println("Back button from Search Parts Results page not working, please check the application.");
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("=====================================================================================");
        }
        returnToMainMenu();
    }

    private void mainScreenSearchPartsButton(WebDriver driver1) {
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
