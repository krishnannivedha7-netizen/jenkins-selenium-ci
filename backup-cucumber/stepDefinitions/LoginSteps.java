package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

  WebDriver driver;
    
@Before
public void setup() {
driver = new ChromeDriver();
        
}

@Given("the user navigates to the login page")
public void the_user_navigates_to_the_login_page() {
   driver.get("https://the-internet.herokuapp.com/login");
}

@When("the user enters valid username and password")
public void the_user_enters_valid_username_and_password() {
  driver.findElement(By.id("username")).sendKeys("tomsmith");
driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
   }

  @When("the user enters invalid username and password")
  public void the_user_enters_invalid_username_and_password() {
      driver.findElement(By.id("username")).sendKeys("wrongusername");
        driver.findElement(By.id("password")).sendKeys("wrongpassword");
      driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @When("the user clicks login without entering credentials")
    public void the_user_clicks_login_without_entering_credentials() {
       driver.findElement(By.cssSelector("button[type='submit']")).click();
    }
    
    @When("the user enters username {string} and password {string}")
  public void the_user_enters_username_and_password(String username, String password) {
    driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
      driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

  @Then("the user should be redirected to the secure area page")
    public void the_user_should_be_redirected_to_the_secure_area_page() {
      System.out.println("Current URL: " + driver.getCurrentUrl());
}

    @Then("an error message {string} should be displayed")
  public void an_error_message_should_be_displayed(String expectedMessage) {
    String actualMessage = driver.findElement(By.id("flash")).getText();
  System.out.println(actualMessage);
}

    @Then("an error message should be displayed")
   public void an_error_message_should_be_displayed() {
      String message = driver.findElement(By.id("flash")).getText();
     System.out.println(message);
 }
    @After
   public void teardown() {
        driver.quit();
   }
}
