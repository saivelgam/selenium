package Mousehoveraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoperticulerelement {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
		Actions act=new Actions(driver);
		act.contextClick(ele);
		Thread.sleep(2000);
		WebElement editlink=driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
		act.moveToElement(editlink).click().build().perform();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
       //its taking as delate  element as move to perticuler element
	}

}
