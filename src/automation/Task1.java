package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
	private static boolean displaystatus;


	public static void main(String[] args) {
		// open browser navigate to bing.com
		
	   ChromeDriver driver=new ChromeDriver();
	   driver.get("http://bing.com");
	   
	   //count number of links and get names of links
       List<WebElement> links=driver.findElements(By.tagName("a"));
       System.out.println(links.size());
       
       for (int i=0;i<links.size();i++) {
    	   
    	   System.out.println(links.get(i).getText());
    	   //verify the name of the images whether link is present or not if it is present print test case pass else fail
    	   
    	 WebElement images=driver.findElement(By.tagName("a"));
    	displaystatus = images.isDisplayed(); 
    	 if(displaystatus) {
    		 System.out.println("testcase pass");
    		 }else {System.out.println("testcase Fail");
    		 driver.close();    		 
    		   
    	   }
    	   
       }
	}

}
