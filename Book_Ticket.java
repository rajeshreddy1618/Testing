package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Book_Ticket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver  driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com/flights/");
		//maximize browser window
		driver.manage().window().maximize();
		
		driver.findElement(By.id("hp-widget__sfrom")).clear();
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys("HYD");
	Thread.sleep(1000);
	driver.findElement(By.linkText("Hyderabad,India HYD")).click();
	


	driver.findElement(By.id("hp-widget__sTo")).clear();
	driver.findElement(By.id("hp-widget__sTo")).sendKeys("BOM");

	

	



	}

}
