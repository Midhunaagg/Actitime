package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hrefvalue {

		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			WebElement link = driver.findElement(By.linkText("Forgot your password?"));
			String tagname = link.getTagName();
			System.out.println(tagname);
			String url = link.getAttribute("href");
			System.out.println(url);
			driver.close();
	}

}
