package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPO {
	WebDriver driver;

	@FindBy(xpath = "//div[@id='card']")
	public WebElement adCard;

	@FindBy(xpath = "//div[@id='dismiss-button']")
	public WebElement dismissButton;
	
	@FindBy(xpath="//span[contains(text(),'Close')]")
	public WebElement closeButton;

	@FindBy(xpath = "//a[contains(text(),'Alerts')]")
	public WebElement AlertsLink;

	@FindBy(xpath = "//h1[contains(text(),'AlertsDemo')]")
	public WebElement titleOfAlertsPage;

	@FindBy(xpath = "//button[@id='alertBox']")
	public WebElement alertBox;

	@FindBy(xpath = "//button[@id='confirmBox']")
	public WebElement confirmBox;

	@FindBy(xpath = "//button[@id='promptBox']")
	public WebElement promptBox;

	@FindBy(xpath = "//div[@id='output']")
	public WebElement promptBoxText;

	public AlertsPO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
