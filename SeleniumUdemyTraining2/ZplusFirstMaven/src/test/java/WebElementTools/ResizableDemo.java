package WebElementTools;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResizableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// user jquery link
		
				//https://jqueryui.com/resources/demos/slider/default.html
				
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
				
				WebElement resizable = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
				
				
							 
				 		 
				Actions action = new Actions(driver);
				
				// drag by 200, 200
				action.dragAndDropBy(resizable, 200,200).perform();
				
				


	}

}
