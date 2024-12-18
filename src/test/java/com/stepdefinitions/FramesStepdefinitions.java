package com.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.network.model.WebSocketFrameSent;
import org.openqa.selenium.support.ui.Select;

import com.pageobjects.FramesPO;
import com.pageobjects.WaitsPO;

import io.cucumber.java.en.And;

public class FramesStepdefinitions {

	FramesPO framesPO;
	WebDriver driver;

	public FramesStepdefinitions() {
		this.driver = BrowserLaunch.getDriver();
		// Pass the initialized driver to AlertsPO
		framesPO = new FramesPO(this.driver);
	}

	@And("User should click on frames practice option from the dropdown")
	public void user_should_click_on_frames_practice_option_from_the_dropdown() {
		framesPO.framesPracticeOption.click();
	}

	@And("User should validate the title of frames page")
	public void user_should_validate_the_title_of_frames_page() {
		framesPO.titleOfFramesPage.isDisplayed();

	}

	@And("User should move into frame1 and test the functionality in frame1")
	public void user_should_move_into_frame1_and_test_the_functionality_in_frame1() {
		driver.switchTo().frame(framesPO.enterFrame1);
		Select se = new Select(framesPO.courseDropdown);
		se.selectByIndex(2);
		String selectedCourse = se.getFirstSelectedOption().getText();
		System.out.println("The selected course in frame1 is:" + selectedCourse);
		System.out.println("Functionality is working fine in frame1");
		driver.switchTo().parentFrame();

	}

	@And("User should move into frame2 and test the functionality in frame2")
	public void user_should_move_into_frame2_and_test_the_functionality_in_frame2() {
		driver.switchTo().frame(framesPO.enterFrame2);
		framesPO.femaleRadioButton.click();
		framesPO.englishCheckBox.click();
		System.out.println("Functionality is working fine in frame2");
		driver.switchTo().parentFrame();

	}

	@And("User should move to frame3 and test the functionality in frame3")
	public void user_should_move_to_frame3_and_test_the_functionality_in_frame3() {
		driver.switchTo().frame(framesPO.enterFrame3);
		driver.switchTo().frame(framesPO.enterFrame1);
		Select se = new Select(framesPO.ideDropdown);
		se.selectByIndex(2);
		String selectedIDE = se.getFirstSelectedOption().getText();
		System.out.println("The selected course in frame1 is:" + selectedIDE);
		System.out.println("Functionality is working fine in frame3");
		driver.switchTo().parentFrame();

	}

	@And("User should finally come out from the frames and enter the text in the displayed textbox")
	public void user_should_finally_come_out_from_the_frames_and_enter_the_text_in_the_displayed_textbox() {
		String inputText = "I am out from all the frames";
		framesPO.frameTextBox.sendKeys(inputText);
		String expectedText = framesPO.frameTextBox.getAttribute("Value");
		System.out.println("The text is:" + expectedText);

	}

}
