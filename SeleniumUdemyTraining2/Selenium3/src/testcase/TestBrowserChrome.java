package testcase;

import org.openqa.selenium.chrome.ChromeDriver;


public class TestBrowserChrome {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\SAAVITHRI\\Selenium\\Selenium pre-requisite\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://Sathyasai.org");
		
		

	}

}