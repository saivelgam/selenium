package Checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nameofcheckbox {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		WebElement name=driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
		name.click();
		System.out.println(name.getAttribute("value"));

	}

}
