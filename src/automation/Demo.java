package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://admin-demo.nopcommerce.com/login");
	    driver.navigate().forward();
	    driver.navigate().refresh();
		
		
	}

}
