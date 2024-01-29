package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imagessrcpractice1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("src=\"https://th.bing.com/th?u=https%3a%2f%2fth.bing.com%2fth%3fid%3dORMS.86493415b19bb640b0015b7f1e47fb92%26pid%3dWdp&ehk=QI9YJfQwAF9pSY10hk7HcS37Ih80tFfVJv13OLPQMRI%3d&w=186&h=88&c=8&rs=2&o=6&pid=WP0\"")).click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
       
        if(url.contains("ar-AA1lunLj?ocid=BingHPCTop")) {
        System.out.println("test case pass");
        }
        else{
        	System.out.println("testcase pass");
        }
        
	}

}
