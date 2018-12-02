package freeCrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[2]/div/div[3]/form/div/input[1]")).sendKeys("srinu0469");
		driver.findElement(By.xpath("html/body/div[2]/div/div[3]/form/div/input[2]")).sendKeys("srinu0469");
		driver.findElement(By.xpath("html/body/div[2]/div/div[3]/form/div/div/input")).click();

	}

}
