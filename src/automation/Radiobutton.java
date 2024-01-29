package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
	//	ChromeDriver driver=new ChromeDriver();
	//	driver.get("https://nxtgenaiacademy.com/demo-site/");
      //  driver.manage().window().maximize();
        
       // int count=driver.findElements(By.xpath("//input[@type=\"radio\"]")).size();
      //  System.out.println("num of radio buttons in webpage is "+count);
    //  WebElement lname= driver.findElement(By.id("vfb-31-1"));
   //     System.out.println(lname.getText());
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		int count=driver.findElements(By.xpath("//input[@type=/radio\"]")).size();
	    System.out.println("num of radio buttons in webpage is "+count);
		
	}

}
