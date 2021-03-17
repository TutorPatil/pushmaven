package com.selenium.actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFPLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./utilities/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	

		driver.get("https://demo.sfp.ocs.oc-test.com/sfp7/vm-ui/login");
		String username = "admin";
		String password = "Welcome1!";
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div/form/button")).click();
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//a[text()='Admin Admin']")).click();
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		
		/*
		 * WebElement element1 =
		 * driver.findElement(By.xpath("//*[@id='navbar-collapse']/ul[2]/li/a"));
		 * Thread.sleep(3000); WebElement element =
		 * driver.findElement(By.xpath("//a[text()='Log Out']"));
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor)driver;
		 * 
		 * js.executeScript("arguments[0].click()", element1);
		 * js.executeScript("arguments[0].click()", element);
		 * 
		 */
	}

}
