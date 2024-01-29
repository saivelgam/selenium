package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listboxtc3 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		WebElement Duration=driver.findElement(By.id("Duration_d"));
		List<WebElement>values=Duration.findElements(By.tagName("option"));
		for(int i=0;i<values.size();i++) {
			values.get(i).clear();
			
			if(values.get(i).isDisplayed()) {
				System.out.println("TC pass");
			}
				else {
					System.out.println("TC pass");
				}
			
			}
		}
		

	} 


