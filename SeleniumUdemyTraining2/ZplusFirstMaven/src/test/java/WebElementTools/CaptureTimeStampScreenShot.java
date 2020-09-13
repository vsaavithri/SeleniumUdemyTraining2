package WebElementTools;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




public class CaptureTimeStampScreenShot {
	
	public static WebDriver driver;
	
	public static void CaptureScreenshot() throws IOException {
		
		Date d  = new Date();
		String dateFile = d.toString().replace(":", "_").replace(" " ,"_")+ ".jpg";

		 File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshotFile, new File (".//screenshot//" + dateFile));
	}

	public static void main(String[] args) throws IOException {
	
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println(driver.getTitle().length());
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("VishwaSaavi@gmail.com");
		
		
		CaptureScreenshot();
		
		
			}

}
