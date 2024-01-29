package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatmenthodinwebdriver {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
		 driver.navigate().to("http://google.com");
		 driver.navigate().forward();
		 driver.navigate().refresh();

	}

}
