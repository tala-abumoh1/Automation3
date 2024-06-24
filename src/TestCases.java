
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases {

	
	WebDriver driver =new ChromeDriver();


	@BeforeTest//do something before the test 
	public void Setup() {
			driver.get("https://www.saucedemo.com/" );
			driver.manage().window().maximize();
	}

	
	@Test(priority=1)//for testing 
	public void Login() throws InterruptedException  {
	
	Thread.sleep(2000);
		//driver.get("https://www.google.co.uk/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	

	@Test(priority=2)
	public void AddToCart() throws InterruptedException{
		Thread.sleep(2000);
	driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	}

	
	@Test(priority=2)
	public void addToCart() throws InterruptedException{
		Thread.sleep(2000);
	driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
	}

	
	@Test(priority=3)
	public void CheckoutProcess() throws InterruptedException{
	Thread.sleep(2000);
	driver.findElement(By.id("shopping_cart_container")).click();

	}

}
