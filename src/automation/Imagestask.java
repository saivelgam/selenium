package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imagestask {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/indian-holidays");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	driver.findElement(By.xpath("//img[@src='https://www.mercurytravels.co.in/admin/public/upload_files/themes/Adventure Tour Packages/Adventure.jpg']")).click();
	       String url=driver.getCurrentUrl();
	       System.out.println(url);
	       Thread.sleep(3000);
	       if(url.contains("adventure-holiday-packages")) {
	    	   System.out.println("testcase pass");
	       }else {
	    	   System.out.println("testcase fail");
	       }
	       
	}

}
