package Radiobuttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Statuscheck {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		List<WebElement> elements=driver.findElements(By.xpath("//input[type='radio']"));
		for (int i=0;i<elements.size();i++) {
			String data=elements.get(i).getAttribute("value");
			System.out.println("radio button name is "+data);
		}

	}

}