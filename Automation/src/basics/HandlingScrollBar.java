package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar {
		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.bbc.com/");
			int y=driver.findElement(By.xpath("//span[text()='Future Planet']")).getLocation().getY();
			JavascriptExecutor j= (JavascriptExecutor) driver;
			j.executeScript("Window.scrollBy(0,"+y+")");
			
	}

}
