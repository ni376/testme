package user_login;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class test_steps {
	static WebDriver driver;
	private CharSequence Password;
	private CharSequence Username;
	@Given("^navigate to Home Page$")
	public void navigate_to_Home_page() {
		System.setProperty("webdriver.chrome.driver", "c://driver9999//chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		String t =  driver.getTitle();
		System.out.println(t);
		Assert.assertEquals(t, "Home");
	}
	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_Username_and_Password() throws Throwable{
		driver.findElement(By.linkText("SignIn")).click();
		String t2= driver.getTitle();
		System.out.println(t2);
		Assert.assertEquals("Login", t2);
		driver.findElement(By.name("userName")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("Login")).click();
		Thread.sleep(2000);
		String t3= driver.getTitle();
		System.out.println(t3);
		Assert.assertEquals("Home", t3);
		
	}
	@Then("^Message Login Successful$")
	public void message_Login_Successful(){
		System.out.println("Login Successful");
		driver.findElement(By.name("SignOut"));
		driver.close();
	}
}
