package com.stepdefinitions;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.pageobjects.FramesPO;
import com.pageobjects.WindowHandlesPO;

import io.cucumber.java.en.And;

public class WindowHandlesStepdefinitions {
	WebDriver driver;
	WindowHandlesPO windowHandlesPO;

	public WindowHandlesStepdefinitions() {
		this.driver = BrowserLaunch.getDriver();
		// Pass the initialized driver to AlertsPO
		windowHandlesPO = new WindowHandlesPO(this.driver);
	}

	@And("User should click on Window Handles from dropdown")
	public void user_should_click_on_window_handles_from_dropdown() {
		windowHandlesPO.windowHandlesOption.click();

	}

	@And("User should validate the title of page")
	public void user_should_validate_the_title_of_page() {
		windowHandlesPO.titleOfWindowHandlesPage.isDisplayed();

	}

	@And("User should click on open new window button")
	public void user_should_click_on_open_new_window_button() {
		String parentWindowHandle = driver.getWindowHandle();
		windowHandlesPO.newWindowButton.click();
		Set<String> windowHandles = driver.getWindowHandles();

		// Iterate through the window handles
		for (String handle : windowHandles) {
			if (!handle.equals(parentWindowHandle)) {
				// Switch to the new window or tab
				driver.switchTo().window(handle);
				System.out.println("Switched to New Window: " + handle);
				windowHandlesPO.newWindowTitle.isDisplayed();
				driver.close();
			}

		}
		// Switch back to the original (parent) window
		driver.switchTo().window(parentWindowHandle);
		System.out.println("Switched back to Parent Window");

	}

	@And("User should click on open new tab button")
	public void user_should_click_on_open_new_tab_button() {
		String parentWindowHandle = driver.getWindowHandle();
		windowHandlesPO.newTabButton.click();
		Set<String> windowHandles = driver.getWindowHandles();

		// Iterate through the window handles
		for (String handle : windowHandles) {
			if (!handle.equals(parentWindowHandle)) {
				// Switch to the new window or tab
				driver.switchTo().window(handle);
				System.out.println("Switched to New Window: " + handle);
				windowHandlesPO.newTabTitle.isDisplayed();
				driver.close();
			}

		}
		// Switch back to the original (parent) window
		driver.switchTo().window(parentWindowHandle);
		System.out.println("Switched back to Parent Window");

	}

	@And("User should verify functionality in new tab")
	public void user_should_verify_functionality_in_new_tab() {

	}

	@And("User should come back to parent window and enter the text")
	public void user_should_come_back_to_parent_window_and_enter_the_text() {
		String inputText = "Hey I am back to parent window";
		windowHandlesPO.textBox.sendKeys(inputText);
		String expectedText = windowHandlesPO.textBox.getText();
		System.out.println("Text is: " +expectedText);

	}

}
