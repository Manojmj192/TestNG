package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel {

	
	@Test
	public void openGoogle() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		
		

	}
	@Test
	public void openBing() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://bing.com");
		

	}
	
	
	
}
