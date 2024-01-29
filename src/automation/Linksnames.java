package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linksnames {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://bing.com");
		List<WebElement> list=driver.findElements(By.tagName("a"));
         for(int i=0;i<list.size();i++) {
        	 System.out.println(list.get(i).getText());
        	 
         }
         
	}

}
