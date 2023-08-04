package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphone {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
       WebDriver driver= new ChromeDriver();
       driver. manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.get("https://www.flipkart.com/");
       driver.findElement(By.name("q")).sendKeys("iphone 14 pro max"+Keys.ENTER);
       List<WebElement> allNames = driver.findElements(By.xpath("//div[contains(text(),APPLE iPhone 14 Pro')]"));
       allpri
    		   
	}

}