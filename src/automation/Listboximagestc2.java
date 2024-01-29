package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listboximagestc2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
       List<WebElement> images=driver.findElements(By.tagName("img"));
       System.out.println("num of images"+" "+images.size());
       
       for(int i=0;i<images.size();i++) {
    	System.out.println(images.get(i).getAttribute("src"));   
    	   
       }
	}

}
