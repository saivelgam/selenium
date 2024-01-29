package Radiobuttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Perticulerradiobuttonclick {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		WebElement car=driver.findElement(By.xpath("//input[@value=\"Female\"]"));
		car.click();
		if(car.isSelected()) {
			System.out.println("button is selected");
		}else {
		System.out.println("button is not selected");	
		
		}
     
	}

}
