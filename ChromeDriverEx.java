package freeCrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class ChromeDriverEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.opera.driver", "D:\\Selenium\\operadriver.exe");
		WebDriver driver=new OperaDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(5000);
		
		driver.close();*/
		
		
		String path = "D:\\Selenium\\operadriver.exe";
        OperaOptions options = new OperaOptions();
        options.setBinary("C:\\Program Files\\Opera\\56.0.3051.43\\opera.exe");
        System.setProperty("webdriver.opera.driver",path);
        //webDriver = new OperaDriver(options);
		

	}

}
