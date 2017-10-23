package main.java.com.travelex.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {


    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;
    }
// constructor placed in order to make sure driver remains for this java class


    By dropDown  = By.xpath("html/body/div[1]/div[2]/div/section[1]/article/section/article/div/form/div/div[2]/div[1]/div[1]/input");
    By dropDownOnSecondPage = By.xpath(".//*[@id='addMoreCurrency']/div[1]/div/div[1]/input");
    By buyAmount = By.id("x-buy-amount");
    By addCash = By.xpath(".//*[@id='addMoreCurrency']/a[1]/span[2]");
    By addMoreCurrency = By.xpath(".//*[@id='addMoreCurrency']/a[1]");
    By addClear = By.xpath(".//*[@id='addMoreCurrency']/div[1]/div/div[1]/input");
    By addCashBuy=By.id("addCashWidget-buy-amount");
    By radioButtonTravelexMoneyCard=By.xpath("//div[1]/div/fieldset/label[2]/span");
    By radioButtonOnBasketPage=By.xpath(".//*[@id='addMoreCurrency']/div[1]/div/fieldset/label[1]/span");

    By radioButtonOnBasketTravelexCard= By.xpath(".//*[@id='addMoreCurrency']/div[1]/div/fieldset/label[2]/span");
    By clickOnTravelexButtonCard=By.xpath("//article/section[2]/div[1]/div[1]/div/button");
    By clickOnUSdollar=By.linkText("USA - U.S. Dollar (USD)");
    By clickOnAfghanCurrency= By.linkText("Afghanistan - Afghan Afghani (AFN)");
    By clickOnAusCurrency=By.linkText("Australia - Australian Dollar (AUD)");
    By clickOnPayButton = By.xpath("//form/div/div[2]/div[1]/button");
    By storeCollection = By.xpath(".//*[@id='loadMoreStores']");
    By findStore = By.xpath(".//*[@id='navigation-menuitem-9742']/span");
    By newcastleAirport = By.xpath(".//*[@id='searchBtn']");

//    driver.findElement(By.linkText("USA - U.S. Dollar (USD)")).click();



    public WebElement dropDown(){
        return driver.findElement(dropDown);
    }
    public WebElement dropDownOnSecondPage(){
        return driver.findElement(dropDownOnSecondPage);
    }
    public WebElement addMoreCurrency(){
        return driver.findElement(addMoreCurrency);
    }
    public WebElement clickOnPayButton(){
        return driver.findElement(clickOnPayButton);
    }
    public WebElement clickOnUSdollar(){
        return driver.findElement(clickOnUSdollar);
    }
    public WebElement clickOnAfghanCurrency(){
        return driver.findElement(clickOnAfghanCurrency);
    }
    public WebElement clickOnAusCurrency(){
        return driver.findElement(clickOnAusCurrency);
    }
    public WebElement buyAmount(){
        return driver.findElement(buyAmount);
    }
    public WebElement addCash(){
        return driver.findElement(addCash);
    }
    public WebElement addClear(){ 
    	return driver.findElement(addClear); 
    }
    public WebElement addCashBuy(){ 
    	return driver.findElement(addCashBuy); 
    }
    public WebElement radioButtonTravelexMoneyCard(){
    	return driver.findElement(radioButtonTravelexMoneyCard); 
    }
    public WebElement radioButtonOnBasketTravelexCard(){
        return driver.findElement(radioButtonOnBasketTravelexCard);
    }
    public WebElement radioButtonOnBasketPage(){
        return driver.findElement(radioButtonOnBasketPage);
    }
    public WebElement clickOnTravelexButtonCard(){ 
    	return driver.findElement(clickOnTravelexButtonCard); 
    }
    public WebElement storeCollection(){ 
    	return driver.findElement(storeCollection); 
    }
    public WebElement findStore(){ 
    	return driver.findElement(findStore); 
    }
    public WebElement newcastleAirport(){ 
    	return driver.findElement(newcastleAirport); 
    }

    }
