package Radiobuttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nameofradiobutton {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://nxtgenaiacademy.com/demo-site/");
    List<WebElement> buttons=driver.findElements(By.xpath("//input[@type='radio']"));
  //  WebElement name=driver.findElement(By.xpath("//input[@type='radio']"));
    for(int i=0;i<buttons.size();i++) {
   System.out.println(buttons.get(i).getAttribute("value"));//(for multiple)
  //  System.out.println(name.getAttribute("value")); //(for single)
    }
    
	}
}
