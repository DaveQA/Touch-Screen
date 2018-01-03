import NewOnYardMainButton.*;
import NotifyMeMainButton.NotifyMeButton;
import SearchPartMainButton.*;
import SearchVehiclesMainButton.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MainTest {
    private static boolean debug = true;
    public static String prefix = "stg";
    public static String url;
    public static WebDriver driver;
    public static String ANSI_RED = "\u001B[31m";
    public static String ANSI_GREEN = "\u001B[32m";
    public static String ANSI_RESET = "\u001B[0m";


    @BeforeClass
    public static void Browser() {
//PC driver setup
        System.setProperty("webdriver.chrome.driver", "\\Users\\dholliday\\Desktop\\Everything Selenium\\SeleniumDrivers\\ChromeDrivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }

    @Test

    public void touchScreenMainTestList() throws InterruptedException {
        PartsSearchHeaderMenuButtonCheckForIsSelected headerButtonsSearchPartTests = new PartsSearchHeaderMenuButtonCheckForIsSelected();
        PartSearchSubMenuButtonsCheckForIsSelected subMenuButtonsSearchPartTests = new PartSearchSubMenuButtonsCheckForIsSelected();
        PartSearchMostPopular mostPopularSearchTests = new PartSearchMostPopular();
        PartsSearchModalPopUp modalPopUpTests = new PartsSearchModalPopUp();
        PartSearchBackButton searchPartsBackButtonTests = new PartSearchBackButton();
        PartsSearchInputField searchPartsInputFieldTests = new PartsSearchInputField();
//======================================================================================================================
        VehicleSearchHeaderMenuButtonCheckForIsSelected searchVehiclesHeaderMenuButtonTests = new VehicleSearchHeaderMenuButtonCheckForIsSelected();
        VehicleSearchSubMenuButtonsCheckForIsSelected searchVehiclesSubMenuButtonTests = new VehicleSearchSubMenuButtonsCheckForIsSelected();
        VehicleSearchModalPopUp searchVehicleModalPopUpTest = new VehicleSearchModalPopUp();
        VehicleSearchInputField searchVehicleInputFieldTests = new VehicleSearchInputField();
        VehicleSearchBackButton searchVehicleBackButtonTests = new VehicleSearchBackButton();
//======================================================================================================================
        NewOnYardTimeSpan newOnYardTimeSpanTests = new NewOnYardTimeSpan();
        NewOnYardNotifyMeButton newOnYardNotifyMeButtonTests = new NewOnYardNotifyMeButton();
//======================================================================================================================
        NotifyMeButton notifyMeTests = new NotifyMeButton();
//======================================================================================================================

        if (prefix.equals("stg")) {
            url = "http://stg-touchscreen.pullapart.com/Home/SetStoreLocationID/4";
        } else if (prefix.equals("uat")) {
            url = "http://stz1-touchscreen.pullapart.com/Home/SetStoreLocationID/4";
        } else if (prefix.equals("prod")) {
            url = "http://touchscreen.pullapart.com/Home/SetStoreLocationID/4";
        }
        if (debug)
            System.out.println(url);
        driver.get(url);

//        headerButtonsSearchPartTests.searchPartMainTest(driver);
//        subMenuButtonsSearchPartTests.partSearchSubMenuButtonsMainTest(driver);
//        mostPopularSearchTests.mostPopularPartSearchLookUpMainTest(driver);
//        modalPopUpTests.modalPopUpCheckMainTest(driver);
//        searchPartsBackButtonTests.backButtonSearchPartMainTest(driver);
//        searchPartsInputFieldTests.inputFieldSearchPartMainTest(driver);
//======================================================================================================================
//        searchVehiclesHeaderMenuButtonTests.searchVehiclesMainTest(driver);
//        searchVehiclesSubMenuButtonTests.searchVehiclesSubMenuButtonsMainTest(driver);
//        searchVehicleModalPopUpTest.vehicleSearchModalPopUpCheckMainTest(driver);
//        searchVehicleInputFieldTests.searchVehicleInputFieldSearchPartMainTest(driver);
//        searchVehicleBackButtonTests.vehicleSearchBackButtonSearchPartMainTest(driver);
//======================================================================================================================
//        newOnYardTimeSpanTests.newOnYardTimeSpanMainTest(driver);
//        newOnYardNotifyMeButtonTests.newOnYardNotifyMeMainTest(driver);
//======================================================================================================================
//        notifyMeTests.notifyMeMainTest(driver);
//======================================================================================================================
    }
}