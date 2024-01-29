package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Getcurrenturlmethod {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		String URL=driver.getCurrentUrl();
		System.out.println("URL");

	}

}
