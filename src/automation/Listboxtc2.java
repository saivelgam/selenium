package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listboxtc2 {

	public static void main(String[] args) {
		
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.mercurytravels.co.in/");
	 
	List<WebElement> t=driver.findElements(By.tagName("select"));
	
	System.out.println(t.size());
	for(int i=0;i<t.size();i++) {
		System.out.println(t.get(i).getText());
	}

	}

}
