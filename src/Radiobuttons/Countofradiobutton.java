package Radiobuttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countofradiobutton {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		List<WebElement> count=driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		System.out.println("total count of radio buttons is :"+count.size());

	}

}
