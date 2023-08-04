package basics;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;

public class VtigerDropdown {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		WebElement target = driver.findElement(By.partialLinkText("Resources"));
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement Login = driver.findElement(By.xpath("//span[text()='Login']"));
		a.doubleClick(Login).perform();
		String expectedtitle = "vtiger";
		String actualTitle = driver.getTitle();
		if(actualTitle.contains(expectedtitle))
			System.out.println(actualTitle);
		
		
		
		
	}
	
}