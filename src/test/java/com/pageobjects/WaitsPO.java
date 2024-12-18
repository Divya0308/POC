package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WaitsPO {
	WebDriver driver;

	@FindBy(xpath = "//a[contains(text(),'Waits Practice')]")
	public WebElement waitsPracticeOption;

	@FindBy(xpath = "//h1[contains(text(),'Waits Demo')]")
	public WebElement titleOfWaitsPage;

	@FindBy(xpath = "//button[@id='btn1']")
	public WebElement firstWaitButton;

	@FindBy(xpath = "//button[@id='btn2']")
	public WebElement secondWaitButton;

	@FindBy(xpath = "//input[@id='txt1']")
	public WebElement firstTextBox;

	@FindBy(xpath = "//input[@id='txt2']")
	public WebElement secondTextBox;

	public WaitsPO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// If you dont implement the above method, u will get null pointer exception.

}
