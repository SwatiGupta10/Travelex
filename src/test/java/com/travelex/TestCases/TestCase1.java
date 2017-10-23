package test.java.com.travelex.TestCases;

import main.java.com.travelex.Pages.BasePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

//import java.util.logging.Logger;


public class TestCase1 {

    static Logger log = Logger.getLogger(TestCase1.class);


    @Test(priority = 0)
    public void ClickOnDropDownAndSelectCurrency() {

        log.info(" 1. Adding first currency");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.travelex.co.uk/");
        BasePage home = new BasePage(driver);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        home.dropDown().click();
        log.info(" 2. Clicked on dropdown");
        home.clickOnUSdollar().click();
        home.buyAmount().clear();
        home.buyAmount().sendKeys("101.22");
        home.clickOnPayButton().click();


        log.info("Scenario 2: Add Cash by Travelex Money Card");


        BasePage addTocash = new BasePage(driver);
        addTocash.addMoreCurrency().click();
        addTocash.dropDownOnSecondPage().click();
        addTocash.clickOnAusCurrency().click();
        addTocash.addCashBuy().clear();
        addTocash.addCashBuy().sendKeys("100.00");
        addTocash.radioButtonOnBasketTravelexCard().click();
        addTocash.clickOnTravelexButtonCard().click();


        log.info(" Scenario3: Add Cash by cash link");


        BasePage addCashSecondTime = new BasePage(driver);
        addCashSecondTime.addMoreCurrency().click();
        addCashSecondTime.dropDownOnSecondPage().click();
        addCashSecondTime.clickOnAfghanCurrency().click();
        addCashSecondTime.addCashBuy().clear();
        addCashSecondTime.addCashBuy().sendKeys("200.00");
        addCashSecondTime.radioButtonTravelexMoneyCard().click();
        addCashSecondTime.clickOnTravelexButtonCard().click();

        driver.quit();
    }

    @Test
    public void findStore() {
        log.info("Scenario 4: find a store Store Collection");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.travelex.co.uk/");

        BasePage FindStore = new BasePage(driver);
        FindStore.findStore().click();
        FindStore.newcastleAirport().click();
        driver.quit();


    }

    static {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\com.travelex\\com.travelex\\src\\test\\java\\com\\travelex\\TestCases\\resources\\geckodriver.exe");
    }

}