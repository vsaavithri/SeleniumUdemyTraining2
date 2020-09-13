package MavenTestCases;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenBrowserChrome {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver","C:\\SAAVITHRI\\Selenium\\Selenium pre-requisite\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://Sathyasai.org");
		String title = driver.getTitle();
		
		System.out.println(title.length());
		
		System.out.println(driver.getTitle());
		driver.close();

	}

}