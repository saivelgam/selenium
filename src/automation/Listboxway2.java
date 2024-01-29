package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxway2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		WebElement TH=driver.findElement(By.id("Theams"));
	    TH.sendKeys("family");
	    
	    Select st=new Select(TH);
	    st.selectByValue("family");
	    st.selectByIndex(4);
	    
	    

	}

}
