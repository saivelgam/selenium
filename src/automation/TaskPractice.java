package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskPractice {

	public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://bing.com");
	List<WebElement> links=driver.findElements(By.tagName("a"));
	List<WebElement> s=driver.findElements(By.xpath("//a[@href='images?FORM=Z9LH']"));
	System.out.println(links.size());
	System.out.println(s.size());
	for(int i=0;i<links.size();i++) {
		
	String name=s.get(i).getText();	
		
     System.out.println(name);
     
     if(s.get(i).isDisplayed()) {
    	 
    System.out.println("pass");
    
     }
     else {
    	 
    System.out.println("fail");	 
     }
 
    }
	}

}