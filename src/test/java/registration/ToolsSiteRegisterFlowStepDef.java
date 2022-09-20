package registration;
import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsSiteRegisterFlowStepDef {
	public static WebDriver driver;
	 @Given("I open Chrome browser$")
	    public void i_open_chrome_browser() throws Throwable {
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Shalini\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		  
	    }

	    @When("I navigate to tools4testing page")
	    public void i_navigate_to_tools4testing_page() throws Throwable {
	    	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.get("https://www.registration.tools4testing.com/");
	    }

	    @Then("I click on Register button")
	    public void i_click_on_register_button() throws Throwable {
	        driver.findElement(By.id("signupopener")).click();
	    }
	    @Then("I provide {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}  {string} {string}")
	    public void i_provide(String firstName, String lastName, String dob, String email, String country, String phoneNumber, String address, String gender, String occupation, String subscribeNewsletter, String password, String confirmpassword) {
	    	driver.findElement(By.id("firstname")).sendKeys(firstName);
	    	driver.findElement(By.id("lastname")).sendKeys(lastName);
	    	driver.findElement(By.id("dateOfBirth")).sendKeys(dob);
	    	driver.findElement(By.id("email")).sendKeys(email);
	    	driver.findElement(By.id("country")).sendKeys(country);
	    	driver.findElement(By.id("phone")).sendKeys(phoneNumber);
	    	driver.findElement(By.id("address")).sendKeys(address);
	    	driver.findElement(By.id("mgender")).sendKeys(gender);
	    	driver.findElement(By.id("occupation")).sendKeys(occupation);
	    	driver.findElement(By.id("password")).sendKeys(password);
	    	driver.findElement(By.id("occupation")).sendKeys(occupation);
	    	driver.findElement(By.id("confirmPassword")).sendKeys(confirmpassword);
	    	String digit1 = driver.findElement(By.id("digit1")).getText();
	    	String digit2 = driver.findElement(By.id("digit2")).getText();
	    	String answer = Integer.parseInt(digit1)+Integer.parseInt(digit2)+"";
	    	driver.findElement(By.id("answer")).sendKeys(answer);
	    	System.out.println("###########"+digit1);
	    	System.out.println("###########"+digit1);
	    	driver.findElement(By.id("newsletter")).click();
	    	System.out.println("#####"+driver.findElement(By.id("newsletter")).isSelected());
	    	
	    }
	    @And("I click on Submit button")
	    public void i_click_on_submit_button() throws Throwable {
	    	driver.findElement(By.id("signupSubmit")).click();
	    }
	   
	    @Then("Success message is displayed {string}")
	    public void success_message_is_displayed_something(String successMessage) throws Throwable {
	    	assertNotNull(driver.findElement(By.linkText(successMessage)));
	    }
	    @Then("I Close the browser")
	    public void i_close_the_browser() throws Throwable {
	    	driver.close();
	    }

	    }

