package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationFormPO {
	WebDriver driver;
	
	@FindBy(xpath="//h1[contains(text(),'User Registration')]")
	public WebElement titleOfRegistationPage;
	
	@FindBy(xpath="//input[@id='name']")
	public WebElement inputName;
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement inputEmail;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement inputPassword;
	
	@FindBy(xpath="//input[@id='age']")
	public WebElement inputAge;
	
	@FindBy(xpath="//button[@id='registerButton']")
	public WebElement registerButton;
	
	@FindBy(xpath="//h1[contains(text(),'Registration Successful!')]")
	public WebElement successMessage;

	public RegistrationFormPO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
