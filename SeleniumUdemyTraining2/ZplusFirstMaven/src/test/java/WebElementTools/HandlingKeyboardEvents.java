package WebElementTools;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingKeyboardEvents {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/");

		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("xyz@gmail.com");

		
		 WebElement outside = driver.findElement(By.xpath("//*[@id=\"logo\"]"));
		 outside.click();
		 

		
		
				
		/*
		 * sendKeys(Keys.chord(Keys.CONTROL ,"c")).build().perform();
		 * 
		 * 
		 * email.click();
		 * 
		 * 
		 * action.sendKeys(Keys.chord(Keys.CONTROL, "v")).perform();
		 */
		
		
		Actions action = new Actions(driver);

		action.keyDown(Keys.CONTROL).sendKeys(Keys.chord("a")).keyUp(Keys.CONTROL).perform(); action.keyDown(Keys.CONTROL).sendKeys(Keys.chord("c")).keyUp(Keys.CONTROL).perform();

		email.click();

		action.keyDown(Keys.CONTROL).sendKeys(Keys.chord("v")).keyUp(Keys.CONTROL).perform();

	}

}
