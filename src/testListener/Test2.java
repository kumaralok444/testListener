package testListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//@Listeners(testListener.TEst1.class)
public class Test2 {
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void setUp(String b)
	{
		if(b.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","D:\\Alok\\jar\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(b.equalsIgnoreCase("firefox"))
		{
		System.setProperty("webdriver.gecko.driver","D:\\Alok\\jar\\geckodriver-v0.11.1-win64 (1)\\geckodriver.exe");
		driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Driver not match");
		}
		driver.get("https://google.co.in");
	}
	@Test
	public void testCase1()
	{
		driver.findElement(By.name("q")).sendKeys("Troy Infotech");
		System.out.println(Thread.currentThread().getId());
		
	}
	@Test
	public void testCase2()
	{
		Assert.assertEquals(driver.getTitle(), "Troy Infotech");// If this statement is false execution will exit from this point
		System.out.println("This part will run after only assertion is true");
		System.out.println(Thread.currentThread().getId());
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
