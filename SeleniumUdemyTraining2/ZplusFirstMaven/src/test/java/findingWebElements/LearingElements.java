package findingWebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearingElements {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println(driver.getTitle().length());
		driver.get("https://www.gmail.com");

		/*
		 * driver.findElement(By.id("identifierId")); WebElement element1 =
		 * driver.findElement(By.name("identifier"));
		 * element1.sendKeys("Vishwasaavi@gmail.com"); WebElement nextele2 =
		 * driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span"));
		 * nextele2.click();
		 */

		driver.findElement(By.name("identifier")).sendKeys("Vishwasaavi@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		/*
		 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.getMessage(); }
		 */
		driver.findElement(By.name("password")).sendKeys("Sairam");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span")).getText();

	}

}
