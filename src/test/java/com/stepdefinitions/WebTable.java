package com.stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pageobjects.BasicControlsPO;

import io.cucumber.java.en.Given;

public class WebTable extends WebTableUtils{
	
	WebTableUtils utils;
	WebDriver driver;
	
	// Constructor with WebDriver (explicitly invoking superclass constructor)
    public WebTable(WebDriver driver) {
        super(driver); // Call the parameterized constructor of WebTableUtils
        this.driver = driver;
    }

    // Default constructor (for Cucumber)
    public WebTable() {
        this(BrowserLaunch.getDriver()); // Use DriverFactory to fetch the WebDriver
    }

	@Given("User should validate the web table")
	public void validateWebTable() {
		utils=new WebTableUtils(driver);
		By table=By.xpath("//table[@id='dynamicTable']");
		
		List<WebElement> tableHeaders=driver.findElements(By.xpath("//table[@id='dynamicTable']/thead/tr/th"));
		for(WebElement headers:tableHeaders) {
			System.out.println(headers.getText());
			
		}
		
		List<WebElement>data=driver.findElements(By.xpath("//table[@id='dynamicTable']/tbody/tr/td"));
		for(WebElement tableData:data) {
			System.out.println(tableData.getText());
		}
		
		
		
		
	}

}
