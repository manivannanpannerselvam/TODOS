package com.cucumber.framework.stepdefinition.IMDb_step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.cucumber.framework.IMDb_page.Search_test_page;
import com.cucumber.framework.IMDb_page.Top_Rated_show_page;
import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.java.en.Then;

public class Top_Rated {

	//private final Logger log = LoggerHelper.getLogger(Search_Test_step.class);

	Top_Rated_show_page Movie_page;
	

@Then("^I click Documentation icon in official Resources$")
public void click_the_Menu_icon_in_IMDb_screen() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	Movie_page.Documentation();
}

@Then("^click the Top Rated Shows icon$")
public void click_the_Top_Rated_Shows_icon() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	//Movie_page.Top_Rated_Shows();
}

@Then("^click clear completed icon in todos screen$")
public void ClearCompleted() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	Movie_page.clearcompleted();
}

@Then("^click completed icon in todos screen$")
public void click_completedScreen() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	Movie_page.ClickCompleted();
}

@Then("^click the Active button in todos screen$")
public void click_ClickActiveButton() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	Movie_page.clickActive_Buttons();
}

@Then("^click the All button in todos screen$")
public void clickAllbutton() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	Movie_page.clickAll_button();
}

@Then("^I click Api Reference icon in official Resources$")
public void clickApiReference() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	Movie_page.clickAPiReference();
}

@Then("^Verify Api Reference data is displayed \"([^\"]*)\"$")
public void verifyApiReference(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	if(Movie_page.verifyApiReference().contains(arg1))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println(" ----> fail ");
		  Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
	}
}
@Then("^Verify Twitter data is displayed \"([^\"]*)\"$")
public void TwitterData(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	if(Movie_page.VerifyTwitterIcon().contains(arg1))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println(" ----> fail ");
		  Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
	}
}




@Then("^Verify Top Rated shows screen is displayed \"([^\"]*)\"$")
public void verify_Top_Rated_shows_screen_is_displayed(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	if(Movie_page.verify_Top_rated_show_screen().contains(arg1))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println(" ----> fail ");
		  Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
	}
}
@Then("^Verify todos data is displayed \"([^\"]*)\"$")
public void VerifyTodosDisplayed(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	if(Movie_page.verify_Top_rated_show_screen().contains(arg1))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println(" ----> fail ");
		  Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
	}
}

@Then("^Verify Official Resources data is displayed \"([^\"]*)\"$")
public void VerifyOfficialResources(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	if(Movie_page.officialResources().contains(arg1))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println(" ----> fail ");
		  Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
	}
}

@Then("^Verify Documentation data is displayed \"([^\"]*)\"$")
public void VerifyDocumentationScreen(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	if(Movie_page.Introduction().contains(arg1))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println(" ----> fail ");
		  Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
	}
}

@Then("^I click Twitter icon in Community Screen$")
public void click_the_Game_of_Thrones_The_Last_Watch_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	
	Movie_page.ClickTwitterIcon();
}

@Then("^I click Gitter channel icon in Community Screen$")
public void clickGitterChannel() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	
	Movie_page.clickGitterChannel();
}



@Then("^I click Discussionn github icon in Community Screen$")
public void clickDiscussionGithub() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	
	Movie_page.clickDiscussiononGithub();
}
@Then("^Verify Gitter channel data is displayed \"([^\"]*)\"$")
public void VerifyGitterChannel(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	
	if(Movie_page.VerifyGitterChannel().equals(arg1))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
		
		  Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
	}
	
}



@Then("^Verify todos text box  is displayed \"([^\"]*)\"$")
public void VerifyTodosTextBox(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	
	if(Movie_page.Verify_Game_of_thrones_title().equals(arg1))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
		
		  Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
	}
	
}


@Then("^Verify Discussion on github data is displayed \"([^\"]*)\"$")
public void verifydiscussion_Github(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	
	if(Movie_page.VerifyDiscussiononGithub().equals(arg1))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
		
		  Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
	}
	
}



}
