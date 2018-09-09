package stepDefination;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Smoke_test {

	WebDriver driver;
@Given("^open chrome browser and start application$")
public void open_chrome_browser_and_start_application() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\himesh\\Desktop\\selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
   
}

@When("^i enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
public void i_enter_valid_username_and_valid_password(String uname, String upass) throws Throwable {
	driver.findElement(By.id("email")).sendKeys(uname);
	driver.findElement(By.id("pass")).sendKeys(upass);
  
}

@Then("^user should be able login successfully$")
public void user_should_be_able_login_successfully() throws Throwable {
	driver.findElement(By.id("u_0_2")).click();
   
}

}
