package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitilemethodinwebdriver {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://google.com");
        String title=driver.getTitle();	
        System.out.println("title");
        }

}
