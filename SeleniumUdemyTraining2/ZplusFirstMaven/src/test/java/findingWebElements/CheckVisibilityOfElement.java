package findingWebElements;

import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckVisibilityOfElement {

	public static WebDriver driver;

	public static boolean isElementDisplayed(By by) {
		
	
		try {
		driver.findElement( by);

		return true;
		
	}catch(Throwable t) {
		
		return false;
	}
		
	}
	
	
                
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.wikipedia.org");

		// is displayed - checks for the visibility of the element and not the display
		// of that element
		// is enabled - checks for the enable/disabled feature of that element
		// is selected - check if an e
		// Then what is the scope to ensure the element is presnet or not?

		// System.out.println(driver.findElement(By.xpath("//*[@id=\'js-link-box-en\']/strong")).isDisplayed());

		CheckVisibilityOfElement check1 = new CheckVisibilityOfElement();
		Boolean c1 = check1.isElementDisplayed(By.xpath("//*[@id=\'js-link-box-en\']/strong"));

		System.out.println(c1);

	}

}
