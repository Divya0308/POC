package com.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pageobjects.AlertsPO;
import com.pageobjects.WaitsPO;

import io.cucumber.java.en.And;

public class WaitsStepDefinitions {
	WaitsPO waitsPO;
	WebDriver driver;

	public WaitsStepDefinitions() {
		this.driver = BrowserLaunch.getDriver();
		// Pass the initialized driver to AlertsPO
		waitsPO = new WaitsPO(this.driver);
	}

	@And("User should click on waits option from the dropdown")
	public void user_should_click_on_waits_option_from_the_dropdown() {
		waitsPO.waitsPracticeOption.click();
	}

	@And("User should validate the title of waits page")
	public void user_should_validate_the_title_of_waits_page() {
		waitsPO.titleOfWaitsPage.isDisplayed();
	}

	@And("User should validate the waits functionality in first textbox")
	public void user_should_validate_the_waits_functionality_in_first_textbox() {
		waitsPO.firstWaitButton.click();
		String inputText = "HEY I HAVE WAITED FOR 5 SECONDS";

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.visibilityOf(waitsPO.firstTextBox));
		waitsPO.firstTextBox.sendKeys(inputText);
		String enteredText = waitsPO.firstTextBox.getText();
		System.out.println("Entered text in first box is: " + enteredText);

	}

	@And("User should validate the waits functionality in second textbox")
	public void user_should_validate_the_waits_functionality_in_second_textbox() {
		waitsPO.secondWaitButton.click();
		String inputText = "HEY I HAVE WAITED FOR 10 SECONDS";

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.visibilityOf(waitsPO.secondTextBox));
		waitsPO.secondTextBox.sendKeys(inputText);
		String enteredText = waitsPO.secondTextBox.getText();
		System.out.println("Entered text in second box is: " + enteredText);
	}

}
