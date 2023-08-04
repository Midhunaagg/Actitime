package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/hidden-division-popup");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='cd-popup-trigger']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='cd-popup-close img-replace']")).click();

	}

}
