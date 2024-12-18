package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginValidationOrangeHRM {

@FindBy(xpath="//input[@name='username']")
public WebElement userName;

@FindBy(xpath="//input[@name='password']")
public WebElement password;

@FindBy(xpath="//button[@type='submit']")
public WebElement loginButton;

@FindBy(xpath="//div[@class='oxd-alert oxd-alert--error']/div[1]/p")
public WebElement invalidCredentialsMessage;



}
