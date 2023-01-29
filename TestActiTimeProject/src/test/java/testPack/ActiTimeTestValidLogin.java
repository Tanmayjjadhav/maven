package testPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTimeTestValidLogin {
	
	@Test
	public void method1()
	{
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://desktop-r6157p8/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Reporter.log("valid login",true);
	}
	
	@Test
	public void method2()
	{
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://desktop-r6157p8/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin1");
		driver.findElement(By.name("pwd")).sendKeys("manager1");
		driver.findElement(By.id("loginButton")).click();
		Reporter.log("invalid login",true);
	}


}
