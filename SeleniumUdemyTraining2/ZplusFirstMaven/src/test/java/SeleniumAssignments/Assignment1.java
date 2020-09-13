package SeleniumAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println(driver.getTitle().length());
		driver.get("https://www.google.com");
		
	WebElement web1 = driver.findElement(By.name("q"));
	web1.sendKeys("Way2Automation.com");
	
	WebElement web2 = driver.findElement(By.className("gNO89b"));
	web2.click();
	
	}

	}


