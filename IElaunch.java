package freeCrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IElaunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver();
	driver.get("https://facebook.com");
	
	Thread.sleep(5000);
	
	driver.quit();

	}

}
