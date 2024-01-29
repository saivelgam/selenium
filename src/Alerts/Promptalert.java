package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promptalert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
		Thread.sleep(2000);
		
	//	driver.switchTo().alert().sendKeys("hai hello");
	//	driver.switchTo().alert().accept();
		Alert al=driver.switchTo().alert();
		al.sendKeys("hai hello namasthe");
		al.accept();
		
		
		
	
		

	}

}
