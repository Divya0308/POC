package com.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pageobjects.RegistrationFormPO;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class DataTableUsage {
	WebDriver driver;
	RegistrationFormPO rfpo;

	public DataTableUsage() {
		this.driver = BrowserLaunch.getDriver();
		// Pass the initialized driver to AlertsPO
		rfpo = new RegistrationFormPO(this.driver);
	}
	
	@Given("I am on Registration page")
	public void titleOfRegistratonPage() {
		rfpo.titleOfRegistationPage.isDisplayed();
		
	}
	
	@When("I fill the following details")
	public void fillDetails(DataTable dataTable) {
		// Convert the DataTable into a list of maps
	    List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);

	    for (Map<String, String> user : users) {
	        // Extract data for each row
	        String name = user.get("name");
	        String email = user.get("email");
	        String password = user.get("password");
	        String age = user.get("age");
	        
	       	rfpo.inputName.sendKeys(name);
        	rfpo.inputEmail.sendKeys(email);
        	rfpo.inputPassword.sendKeys(password);
        	rfpo.inputAge.sendKeys(age);
        	rfpo.registerButton.click();
        	rfpo.successMessage.isDisplayed();
	        // Print the data for debugging
	        System.out.println("Registering user: " + name + ", Email: " + email + ", Age: " + age);

	     driver.navigate().back();
	        driver.findElements(By.xpath("//input")).forEach(element -> element.clear());





	        // Add verification logic if needed
	    }
	    
	
}
//	@When("I fill the registration form with {""}, {""}, {String}, and {int}")
//	public void fillForm(String name1, String email1, String password1, int age1) {
//	    System.out.println("Name: " + name1);
//	    System.out.println("Email: " + email1);
//	    System.out.println("Password: " + password1);
//	    System.out.println("Age: " + age1);
//	}

	@When("I fill the registration form with {string}, {string}, {string}, and {string}")
	public void i_fill_the_registration_form_with_and(String name, String email, String password, String age) {
	   rfpo.inputName.sendKeys(name);
	   rfpo.inputEmail.sendKeys(email);
	   rfpo.inputPassword.sendKeys(password);
	   rfpo.inputAge.sendKeys(age);
	   rfpo.registerButton.click();
	   rfpo.successMessage.isDisplayed();
	   driver.navigate().back();
	   List<WebElement>list= driver.findElements(By.tagName("input"));
	   for(WebElement element:list) {
		   element.clear();
	   }
	}
	
}