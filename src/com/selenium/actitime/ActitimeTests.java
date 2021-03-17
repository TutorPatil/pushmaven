package com.selenium.actitime;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.DefaultEditorKit.CopyAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
import com.google.common.io.Files;



public class ActitimeTests {
	
	//static String URL = "http://demo.actitime.com";
	
	static String URL = "https://qa.sfp.ocs.oc-test.com/sfp1/vm-ui/login";
	public static WebDriver driver = new ChromeDriver();
	
	
	
	public static void main(String[] args) throws IOException {
			launchBrowser();
		
		 	driver.get("https://demo.sfp.ocs.oc-test.com/sfp7/vm-ui/login");
	        String username = "admin";
	        String password = "Welcome1!";
	        driver.findElement(By.id("username")).sendKeys(username);
	        driver.findElement(By.id("password")).sendKeys(password);
	        driver.findElement(By.xpath("/html/body/div/form/button")).click();
		
		
	        driver.findElement(By.xpath("//a[text()='Admin Admin']")).click();
	        driver.findElement(By.xpath("//a[text()='Log Out']")).click();
	        
		
	}
	
	
	public static void javaScriptExecutor()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		String title  = (String) js.executeScript("return document.title");		
		System.out.println(title);		
		js.executeScript("alert('Welcome')");		
		driver.switchTo().alert().accept();
		
		
		driver.get("https://google.com");
		
		
		long len = (Long) js.executeScript("return document.getElementsByTagName('a').length");
		System.out.println(len);
		
	
		
		
		
	}
	
	
	public static void javaScriptExecutorEx2()
	{
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		WebElement loginbtn = driver.findElement(By.id("loginButton"));
		
		
		js.executeScript("arguments[0].value='admin'", username);		
		js.executeScript("arguments[0].value='manager'", password);
		js.executeScript("arguments[0].click()", loginbtn);
		
		
		
		
		
		
		
	}
	
	
	public static void synchronizationExample()
	{
		
			
			launchBrowser();		
			driver.findElement(By.name("username")).sendKeys("admin");		
			driver.findElement(By.name("pwd")).sendKeys("manager");		
			driver.findElement(By.id("loginButton")).click();	
			
			//Implicitwait
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			
			
			// Explicit Wait
			WebDriverWait wait = new WebDriverWait(driver, 50);			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='logout']")));
			
						
			// FluentWait Example
			 Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
				       .withTimeout(30, TimeUnit.SECONDS)
				       .pollingEvery(1, TimeUnit.SECONDS)
				       .ignoring(NoSuchElementException.class);

				   WebElement foo = wait1.until(new Function<WebDriver, WebElement>() {
				     public WebElement apply(WebDriver driver) {
				       return driver.findElement(By.className("logout"));
				     }
				   });
				 
				   
				 driver.findElement(By.className("logout")).click();
			
		}
		
		
	
	
	
	public static void captureScreenShot(String filename)
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("./results/"+filename+ ".png");
		
		//Now to copy the screenshot captured to the destination
		try {
			Files.copy(source, destination);
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
	
	public static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./utilities/chromedriver.exe");
		driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "./utilities/geckodriver.exe");
	 	//driver = new FirefoxDriver();
		driver.get(URL);
		
		driver.manage().window().maximize();
		
		// This is to wait for 20 Seconds Max before throwing the Exception, it has a polling time of 500 MS 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	
	public static void sleep(long mSeconds)
	{
		
		try {
			Thread.sleep(mSeconds);
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	public static void closeBrowser()
	{
		driver.quit();
	}
	
	public static boolean loginToActiTime()
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		boolean result = driver.findElement(By.xpath("//a[@id='logoutLink']")).isDisplayed();
		
		if (result)
			return true;
		else
			return false;
	}
	
	
	
	

}
