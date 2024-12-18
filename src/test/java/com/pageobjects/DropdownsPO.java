package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownsPO {
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Dropdowns')]")
	public WebElement dropdownLink;

	@FindBy(xpath = "//h1[contains(text(),'HTML Dropdowns')]")
	public WebElement titleOfDropdowns;

	@FindBy(xpath = "//select[@id='course']")
	public WebElement selectCourse;

	@FindBy(xpath = "//select[@id='ide']")
	public WebElement selectIDE;

	@FindBy(xpath = "//div//li[@class='hub-home']")
	public WebElement homelink;

	public DropdownsPO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
