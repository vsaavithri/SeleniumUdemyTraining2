package WebElementTools;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestTry {

	public static void main(String[] args) {
		

		
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				System.out.println(driver.getTitle().length());
				driver.get("https://www.hdfcbank.com");
				
				
				WebElement img = driver.findElement(By.xpath("//*[@id=\"parentdiv\"]/img"));
				img.click();
				
				
				
				//switch to main window
				
				driver.switchTo().defaultContent();
				
				//provide the iframe id 
				
				driver.switchTo().frame("google_ads_iframe");
				WebElement submit  = driver.findElement(By.xpath("//*[@id=\"w3-exerciseform\"]/div/button"));
				submit.click();
				
				// how many iframes are there and the ids of it
				
				java.util.List<WebElement> frames = driver.findElements(By.tagName("iframe"));
						System.out.println(frames.size());
								
				// if you find frames you can put them in list 
						
						for (WebElement frame:frames) {
			
			               System.out.println(frame.getAttribute("id"));
				
		}


		}


			




	}


