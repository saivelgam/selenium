package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LInks {

	public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://bing.com");
        List<WebElement> link=driver.findElements(By.tagName("a"));
        System.out.println(link.size());
        driver.close();
        
	}

}
