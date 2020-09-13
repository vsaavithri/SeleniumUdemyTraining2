package findingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintingLinksinBlock {

	public static void main(String[] args) {
		
		

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();

			driver.get("https://www.wikipedia.org");
			
			
			WebElement block = driver.findElement(By.xpath("//*[@id=\'www-wikipedia-org\']/div[6]/div[3]/div[9]"));

			//Select select = new Select(web1);
			// select.selectByValue("ar");x
			// to find all elements within the drop down.

			java.util.List<WebElement> links  = block.findElements(By.tagName("a"));
			// total count of values can also be checked as $$("option") in the console
			
			// total counts on links, you can check this in your console - $$("a");

			System.out.println("The Total number of Links is  " + links.size());

			/*for (int i = 0; i < links.size(); i++) {
				//System.out.println(allvalues.get(i).getText()); - This will get all attribute
				System.out.println(links.get(i).getAttribute("lang"));*/
			
			for(WebElement link : links) {
				
				System.out.println(link.getText()+ " URL is " + link.getAttribute("href"));
						
		}

	}
	}


			
			
			
			

	
