package Checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countnumofchckboxs {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		List<WebElement> count=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		System.out.println("total num of checkboxes is :"+count.size());

	}

}
