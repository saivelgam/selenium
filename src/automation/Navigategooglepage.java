package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigategooglepage {

	public static void main(String[] args) {
		 //open Browser navigate to google page 
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		
		////get name of link
		
		String lname=driver.findElement(By.linkText("images")).getText();
		System.out.println(lname);
		
		//click on link
		
		driver.findElement(By.linkText("images")).click();
		
		//capture URL
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();

	}

}
