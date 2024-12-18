package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowHandlesPO {
	WebDriver driver;

	@FindBy(xpath = "//a[contains(text(),'Window Handles')]")
	public WebElement windowHandlesOption;

	@FindBy(xpath = "//h1[contains(text(),'Window Handles Practice')]")
	public WebElement titleOfWindowHandlesPage;

	@FindBy(xpath = "//button[@id='newWindowBtn']")
	public WebElement newWindowButton;

	@FindBy(xpath = "//button[@id='newTabBtn']")
	public WebElement newTabButton;

	@FindBy(xpath = "//h1[contains(text(),'Basic Controls')]")
	public WebElement newWindowTitle;

	@FindBy(xpath = "//h1[contains(text(),'AlertsDemo')]")
	public WebElement newTabTitle;

	@FindBy(xpath = "//input[@class='whTextBox']")
	public WebElement textBox;

	public WindowHandlesPO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
