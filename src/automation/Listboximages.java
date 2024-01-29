package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listboximages {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/indian-holidays");
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("no of images"+" "+images.size());
		
		
	}

}
