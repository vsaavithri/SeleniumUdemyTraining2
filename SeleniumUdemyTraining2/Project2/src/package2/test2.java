package package2;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import ST2020.Calculator1;

public class test2 {
	
	Calculator1 calc = new Calculator1();
	
	public void addmetest2()
	
	{
		calc.Add();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		test2 t2 = new test2();
//		t2.addmetest2();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.Sathyasai.org");
	


}
}