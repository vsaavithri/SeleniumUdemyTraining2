package testcase;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBrowsers {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\SAAVITHRI\\Selenium\\Selenium pre-requisite\\geckodriver.exe");
	    FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://Sathyasai.org");

	}

}
