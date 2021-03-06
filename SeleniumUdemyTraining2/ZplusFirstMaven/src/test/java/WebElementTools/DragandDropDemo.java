package WebElementTools;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDropDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement draggable  = driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
		WebElement dropable = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(draggable,dropable).perform();
		
		

	}

}
