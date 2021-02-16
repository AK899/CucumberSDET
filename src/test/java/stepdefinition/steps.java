package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	
	WebDriver driver;
	/*@Given("Login application present")
	public void login_application_present()  
	{
	  // i should be on the home page //https://opensource-demo.orangehrmlive.com/index.php/auth/login  
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Aman\\Aman\\Eclipse_Selenium_Training\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");	
	
	}*/
	
	@Given("We shud be in Login Page")
    public void we_shud_be_in_login_page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Aman\\Aman\\Eclipse_Selenium_Training\\chromedriver\\chromedriver.exe");
        //Start a new instance of Chrome Driver
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(3000);
    }

@When("Enter valid name")
public void enter_valid_name() throws InterruptedException {
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    Thread.sleep(2000);    
}

@When("Enter valid password")
public void enter_valid_password() throws InterruptedException {
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    Thread.sleep(2000);
}


@When("click on login button when valid")
public void click_on_login_button_when_valid() throws InterruptedException {
    driver.findElement(By.id("btnLogin")).click();
    Thread.sleep(3000);
}

@Then("Login Should be Success")
public void login_should_be_success() throws InterruptedException {
    String expected =driver.findElement(By.id("welcome")).getText();
    String actual="Welcome Paul";
    Assert.assertEquals(expected, actual);
    driver.findElement(By.id("welcome")).click();
    Thread.sleep(3000);
    driver.close();
    
    
}

//Invalid
@Given("We shud be in Login Page1")
public void we_shud_be_in_login_page1() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Aman\\Aman\\Eclipse_Selenium_Training\\chromedriver\\chromedriver.exe");
    //Start a new instance of Chrome Driver
    driver = new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/");
    Thread.sleep(3000);
}

@When("Enter Invalid name")
public void enter_invalid_name() throws InterruptedException {
    driver.findElement(By.id("txtUsername")).sendKeys("Aman");
    Thread.sleep(2000);
}

@When("Enter Invalid pwd")
public void enter_invalid_pwd() throws InterruptedException {
    driver.findElement(By.id("txtPassword")).sendKeys("pwd");
    Thread.sleep(2000);
}

@When("Click on Login button when invalid")
public void click_on_login_button_when_invalid() throws InterruptedException {
    driver.findElement(By.id("btnLogin")).click();
    Thread.sleep(3000);
}
@Then("Login fails")
public void login_fails() throws InterruptedException {
    String error=driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
    String actualError = "Invalid credentials";
    Assert.assertEquals(error, actualError);
    Thread.sleep(3000);
    driver.close();
    
}

}



