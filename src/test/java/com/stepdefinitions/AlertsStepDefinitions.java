package com.stepdefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.pageobjects.AlertsPO;
import com.pageobjects.DropdownsPO;

import io.cucumber.java.en.And;

public class AlertsStepDefinitions {
	AlertsPO alertsPO;
	WebDriver driver;

	public AlertsStepDefinitions() {
		this.driver = BrowserLaunch.getDriver();
		// Pass the initialized driver to AlertsPO
		alertsPO = new AlertsPO(this.driver);
	}

	@And("User should click on Alerts option from the dropdown")
	public void clickOnAlertsOption() {
		alertsPO.AlertsLink.click();

	}

	@And("User should validate title of alerts page")
	public void titleOfAlertsPage() {

//		Alert a = driver.switchTo().alert();
//		if (alertsPO.adCard.isDisplayed()) {
//			// First, try dismissing or closing the ad card
//			if (alertsPO.dismissButton.isDisplayed()) {
//				alertsPO.dismissButton.click();
//			} else if (alertsPO.closeButton.isDisplayed()) {
//				alertsPO.closeButton.click();
//			}
//			System.out.println("Ad card is displayed and closed.");
//		}

		// Validate that the title of the alerts page is displayed
		if (alertsPO.titleOfAlertsPage.isDisplayed()) {
			System.out.println("Title of Alerts Page is displayed.");
		}
	}

	@And("User should click on click me button in display alert box")
	public void validateAlertbox() {
		alertsPO.alertBox.click();
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	@And("User should click on click me button in confirm box")
	public void validateConfirmbox() {
		alertsPO.confirmBox.click();
		Alert a = driver.switchTo().alert();
		a.accept();

	}

	@And("User should click on click me button in prompt box")
	public void validatePromptbox() {
		alertsPO.promptBox.click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("Divya");
		a.accept();
	}

	@And("User should validate the text in prompt box output")
	public void validateTextinPromptBox() {
		String prompttext = alertsPO.promptBoxText.getText();
		System.out.println("The entered text is: " + prompttext);

	}
}