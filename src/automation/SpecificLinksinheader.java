package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificLinksinheader {

	public static void main(String[] args) {
     ChromeDriver driver=new ChromeDriver();
     driver.get("http://bing.com");
     WebElement header=driver.findElement(By.id("hdr"));
     List<WebElement>links=header.findElements(By.tagName("a"));
     System.out.println(links.size());
     
     for(int i=0;i<links.size();i++) {
    	 
    	 System.out.println(links.get(i).getText());
     }
     

	}

}
