package com.cucumber.framework.IMDb_page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.configreader.ObjectRepo;

import com.cucumber.framework.helper.Wait.WaitHelper;
import com.cucumber.framework.helper.genericHelper.GenericHelper;

public class Top_Rated_show_page {

	
	WebDriver driver;
	//private final Logger log = LoggerHelper.getLogger(Top_Rated_show_page.class);
	WaitHelper waitHelper;
	Actions actions;
	
	
	@FindBy(xpath=".//a[text()='Documentation']")
	WebElement Documentation;
	
	@FindBy(xpath=".//a[text()='Twitter']")
	WebElement VerifyTwitterIcon;
	
	@FindBy(xpath=".//a[text()='Gitter Channel']")
	WebElement VerifyGitterChannel;

	@FindBy(xpath=".//h1[text()='API']")
	WebElement VerifyApiReference;
	
	@FindBy(xpath=".//a[text()='API Reference']")
	WebElement ApiReference;
	
	@FindBy(xpath=".//label[@for='toggle-all']")
	WebElement clearcompleted;
	
	@FindBy(xpath=".//button[@class='clear-completed']")
	WebElement clearcompletedbutton;
	
	@FindBy(xpath=".//a[text()='Completed']")
	WebElement ClickCompleted;
	
	@FindBy(xpath=".//a[text()='Active']")
	WebElement clickActive_Button;
	
	@FindBy(xpath=".//a[text()='All']")
	WebElement clickAll_buttons;
	
	@FindBy(xpath=".//h4[text()='Official Resources']")
	WebElement officialResources;
	
	@FindBy(xpath=".//h1[text()='Introduction']")
	WebElement Introduction;
	
	@FindBy(xpath=".//label[text()='Test1']")
	WebElement verify_Top_rated_show_screen;
	
	@FindBy(xpath=".//div[text()='Game of Thrones: The Last Watch']")
	WebElement Game_of_thrones_link;
	
	@FindBy(xpath=".//label[text()='Test1']")
	WebElement Verify_Game_of_thrones_title;
	
	@FindBy(xpath=".//a[text()='Discussions on GitHub']")
	WebElement VerifyDiscussion;

	@FindBy(xpath=".//span[@itemprop='ratingValue']")
	WebElement verify_rating_value;
	
	@FindBy(xpath=".//span[@itemprop='ratingCount']")
	WebElement verify_rating_count;
	
	public Top_Rated_show_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//
	}
	public void ClickCompleted() throws InterruptedException
	{
		waitHelper.waitForElement(driver, ClickCompleted,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, ClickCompleted,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(ClickCompleted);
		actions.click().build().perform();
	}
	
	public void clickActive_Buttons() throws InterruptedException
	{
		waitHelper.waitForElement(driver, clickActive_Button,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, clickActive_Button,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(clickActive_Button);
		actions.click().build().perform();
	}
	public void clickAll_button() throws InterruptedException
	{
		waitHelper.waitForElement(driver, clickAll_buttons,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, clickAll_buttons,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(clickAll_buttons);
		actions.click().build().perform();
	}
	
	public void clickAPiReference() throws InterruptedException
	{
		waitHelper.waitForElement(driver, ApiReference,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, ApiReference,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(ApiReference);
		actions.click().build().perform();
	}
	
	public void Documentation() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Documentation,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Documentation,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Documentation);
		
		actions.click().build().perform();
	}
	public void clearcompleted() throws InterruptedException
	{
		waitHelper.waitForElement(driver, clearcompleted,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, clearcompleted,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(clearcompleted);
		
		actions.click().build().perform();
		
		actions = new Actions(driver);
		actions.moveToElement(clearcompletedbutton);
		
		actions.click().build().perform();
	}
	
	public String verify_Top_rated_show_screen()
	{
		//return new GenericHelper().isDisplayed(successMsgObject);
		
		return new GenericHelper().getElementText(verify_Top_rated_show_screen);
	}
	
	public String verifyApiReference()
	{
		//return new GenericHelper().isDisplayed(successMsgObject);
		
		return new GenericHelper().getElementText(VerifyApiReference);
	}
	
	public String VerifyTwitterIcon()
	{
		//return new GenericHelper().isDisplayed(successMsgObject);
		
		return new GenericHelper().getElementText(VerifyTwitterIcon);
	}
	
	public String officialResources()
	{
		//return new GenericHelper().isDisplayed(successMsgObject);
		
		return new GenericHelper().getElementText(officialResources);
	}
	
	public String Introduction()
	{
		//return new GenericHelper().isDisplayed(successMsgObject);
		
		return new GenericHelper().getElementText(Introduction);
	}
	
	public String DocumentationScreen()
	{
		//return new GenericHelper().isDisplayed(successMsgObject);
		
		return new GenericHelper().getElementText(officialResources);
	}
	
	public void ClickTwitterIcon() throws InterruptedException
	{
		waitHelper.waitForElement(driver, VerifyTwitterIcon,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, VerifyTwitterIcon,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(VerifyTwitterIcon);
		
		actions.click().build().perform();
	}
	
	public void clickGitterChannel() throws InterruptedException
	{
		waitHelper.waitForElement(driver, VerifyTwitterIcon,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, VerifyTwitterIcon,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(VerifyGitterChannel);
		
		actions.click().build().perform();
	}
	
	public String VerifyGitterChannel()
	{
		//return new GenericHelper().isDisplayed(successMsgObject);
		
		return new GenericHelper().getElementText(VerifyGitterChannel);
	}
	
	public String Verify_Game_of_thrones_title()
	{
		//return new GenericHelper().isDisplayed(successMsgObject);
		
		return new GenericHelper().getElementText(Verify_Game_of_thrones_title);
	}
	
	public String VerifyDiscussiononGithub()
	{
		//return new GenericHelper().isDisplayed(successMsgObject);
		return new GenericHelper().getElementText(VerifyDiscussion);
	}
	public void clickDiscussiononGithub() throws InterruptedException
	{
		waitHelper.waitForElement(driver, VerifyDiscussion,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, VerifyDiscussion,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(VerifyDiscussion);
		
		actions.click().build().perform();
	}
	
}
