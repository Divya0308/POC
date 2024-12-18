package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicControlsPO {
	WebDriver driver;
	@FindBy(xpath="//img[@title='HYR']")
	public WebElement titleOfPage;
	
	@FindBy(xpath="//a[contains(text(),'Selenium Practice')]")
	public WebElement seleniumPracticeLink;
	
	@FindBy(xpath="//a[contains(text(),'Basic Controls')]")
	public WebElement basicControlsLink;
	
	@FindBy(xpath="//input[@id='firstName']")
	public WebElement firstNameTextBox;
	
	@FindBy(xpath="//input[@id='lastName']")
	public WebElement lastNameTextBox;
	
	@FindBy(xpath="//input[@id='femalerb']")
	public WebElement femaleRadiobutton;
	
	@FindBy(xpath="//input[@id='spanishchbx']")
	public WebElement languagesKnownCheckbox;
	
	@FindBy(xpath="//button[@id='registerbtn']")
	public WebElement registerButton;
	
	@FindBy(xpath="//label[contains(text(),'Registration is Successful')]")
	public WebElement successfulMessage;
	
	@FindBy(xpath="//a[contains(text(),'Click here to navigate to the home page')]")
	public WebElement navigateHomePageLink;
	
	@FindBy(xpath="//div[@id='dismiss-button']")
	public WebElement dismissButton;

	public BasicControlsPO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
