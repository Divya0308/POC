package com.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.pageobjects.BasicControlsPO;
import com.pageobjects.DropdownsPO;

import io.cucumber.java.en.And;

public class DropdownsStepdefinitions {
	DropdownsPO dropdownPO;

	// No-argument constructor
	public DropdownsStepdefinitions() {
		// Initialize DropdownsPO with the shared WebDriver instance
		dropdownPO = new DropdownsPO(BrowserLaunch.getDriver());
	}

	@And("Validate the dropdown page title is displayed or not")
	public void titleOfDropdownPage() {
		dropdownPO.titleOfDropdowns.isDisplayed();

	}

	@And("User should click on dropdown link")
	public void dropdownLink() {
		dropdownPO.dropdownLink.click();
	}

	@And("User should click on dropdowns link")
	public void clickOnDropdownLink() {
		Select se = new Select(dropdownPO.selectCourse);
		se.selectByValue("java");
		System.out.println("Java is selected");

	}

	@And("Select Course name and IDE name from dropdown")
	public void selectCourseIDE() {
		Select se = new Select(dropdownPO.selectIDE);
		se.selectByValue("vs");
		// Get all selected options and print them
		List<WebElement> selectedValues = se.getAllSelectedOptions();
		for (WebElement option : selectedValues) {
			System.out.println("Selected IDE is: " + option.getText());
		}
	}

	@And("Click on Home link")
	public void clickOnHomeLink() {
		dropdownPO.homelink.click();

	}

}
