package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramesPO {
	WebDriver driver;

	@FindBy(xpath = "//a[contains(text(),'Frames Practice')]")
	public WebElement framesPracticeOption;

	@FindBy(xpath = "//h1[contains(text(),'Frames Practice')]")
	public WebElement titleOfFramesPage;

	@FindBy(xpath = "//select[@id='course']")
	public WebElement courseDropdown;

	@FindBy(xpath = "//input[@id='femalerb']")
	public WebElement femaleRadioButton;

	@FindBy(xpath = "//input[@id='englishchbx']")
	public WebElement englishCheckBox;

	@FindBy(xpath = "//iframe[@id='frm1']")
	public WebElement enterFrame1;

	@FindBy(xpath = "//iframe[@id='frm2']")
	public WebElement enterFrame2;

	@FindBy(xpath = "//iframe[@id='frm3']")
	public WebElement enterFrame3;

	@FindBy(xpath = "//select[@id='ide']")
	public WebElement ideDropdown;

	@FindBy(xpath = "//input[@class='frmTextBox']")
	public WebElement frameTextBox;

	public FramesPO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
