package com.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
    public void setUp() {
        // Initialize the WebDriver
        BrowserLaunch.browserLaunch();
    }

//    @After
//    public void tearDown() {
//        // Quit the driver
//        BrowserLaunch.tearDown();
//    }

}
