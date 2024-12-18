package com.stepdefinitions;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import com.pageobjects.BasicControlsPO;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class BasicControlsStepdefintions extends BrowserLaunch {
	BasicControlsPO bc;
	Properties props = new Properties();

	// No-argument constructor
	public BasicControlsStepdefintions() {
		// Initialize BasicControlsPO with the shared WebDriver instance
		bc = new BasicControlsPO(BrowserLaunch.getDriver());
	}

	@Given("User should validate title of page")
	public void validateTitleOfPage() {

//		Assert.assertEquals("HYR", title);
		bc.titleOfPage.isDisplayed();

	}

	@And("User should move to selenium practice link to see options in the dropdown")
	public void moveToSeleniumPracticeLink() {
		Actions actions = new Actions(driver);
		actions.moveToElement(bc.seleniumPracticeLink).perform();

	}

	@And("User should click on Basic Controls option from the drop down")
	public void clickOnBasicControls() {
		bc.basicControlsLink.click();
	//	bc.dismissButton.click();

	}

	@Given("User should send the text into the FirstName and LastName text boxes")
	public void sendText() throws IOException {
		System.out.println("Current working directory: " + System.getProperty("user.dir"));

		FileReader fileReader = new FileReader("C:\\Users\\mdivya\\git\\Automation\\CucumberPOC\\TestData.properties");
		props.load(fileReader);
		String firstName = props.getProperty("firstName");
		String lastName = props.getProperty("lastName");
		System.out.println("First name is:" + firstName);
		System.out.println("Last name is:" + lastName);
		bc.firstNameTextBox.sendKeys(firstName);
		bc.lastNameTextBox.sendKeys(lastName);

	}

	@And("User should select any one gender radio button")
	public void genderRadioButton() {
		bc.femaleRadiobutton.click();

	}

	@And("User should click on any of the check boxes from the Languages known")
	public void languagesCheckBox() {
		bc.languagesKnownCheckbox.click();

	}

	@And("User should click on Register button")
	public void clickOnRegisterButton() {
		bc.registerButton.click();
	}

	@Given("User should validate the successful message after clicking on register button")
	public void validateSuccessfulMessage() {
		bc.successfulMessage.isDisplayed();
		String successfulMessage = bc.successfulMessage.getText();
		System.out.println("Successful Message is: " + successfulMessage);
	}

	@And("User should click on the link to go back to home page")
	public void clickOnBackToHomePageLink() {
		bc.navigateHomePageLink.click();
		bc.titleOfPage.isDisplayed();

	}

}
