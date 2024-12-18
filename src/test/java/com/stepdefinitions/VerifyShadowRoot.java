package com.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;

public class VerifyShadowRoot extends BrowserLaunch {

    @Given("User should identify shadow root element")
    public void shadowRoot() {
        // Locate the shadow host element
        WebElement shadowHost = driver.findElement(By.cssSelector("#shadow-host"));

        // Use JavascriptExecutor to access the shadow root
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Access the shadow root without casting to WebElement
        Object shadowRoot = js.executeScript("return arguments[0].shadowRoot", shadowHost);

        // Now use the shadowRoot to locate the shadow DOM elements
        WebElement input = (WebElement) ((JavascriptExecutor) driver)
            .executeScript("return arguments[0].querySelector('#shadow-input')", shadowRoot);

        String expectedText = "I have entered into Shadow";
        input.click();
        input.sendKeys(expectedText);

        // Retrieve and print the entered text
        String actualText = input.getAttribute("value");
        System.out.println("Expected Text: " + expectedText);
        System.out.println("Actual Text: " + actualText);

        // Locate the button inside the shadow DOM and click it
        WebElement button = (WebElement) ((JavascriptExecutor) driver)
            .executeScript("return arguments[0].querySelector('#shadow-button')", shadowRoot);
        button.click();
    }
}
