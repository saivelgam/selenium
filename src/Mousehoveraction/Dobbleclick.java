package Mousehoveraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dobbleclick {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement dble=driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
		Actions act=new Actions(driver);
		act.doubleClick(dble).click().build().perform();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

}
