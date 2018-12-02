package freeCrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Htmlunitdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new HtmlUnitDriver();
		driver.get("https://facebook.com");
		String str=driver.getTitle();
		System.out.println(str);
		
		driver.findElement(By.xpath(".//*[@id='email']")).click();
		
		
		

	}

}
