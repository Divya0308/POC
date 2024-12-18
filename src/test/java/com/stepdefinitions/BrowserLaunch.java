package com.stepdefinitions;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BrowserLaunch {

 
	    static WebDriver driver;

	    @BeforeClass
	    public static void browserLaunch() {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe"); // Update this path

	        // Initialize the ChromeDriver
	        driver = new ChromeDriver();
	        
	        // Maximize the browser window
	        driver.manage().window().maximize();
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        // Optionally navigate to a URL
	        //driver.get("file://C:/Users/mdivya/Documents/dynamicwebtable.html");
	        //driver.get("https://www.hyrtutorials.com/");
	       // driver.get("file://C:/Users/mdivya/Documents/Registrationform.html");
		    //driver.get("file:///C:/Users/mdivya/Documents/shadowroot.html");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    }

	    @AfterClass
	    public static void tearDown() {
	        // Quit the driver and close all browser windows
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	    public static WebDriver getDriver() {
	        return driver;
	    }
	} 


