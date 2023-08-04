package basics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPropertyFile {


		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

		public static void main(String[] args) throws IOException {
			FileInputStream fis = new FileInputStream("\\Users\\midhu\\OneDrive\\Desktop\\actitime.property.txt");
			Properties p = new Properties();
			p.load(fis);
			String url = p.getProperty("url");
			String un = p.getProperty("username");
			String pw = p.getProperty("password");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			
			
			
		}
		

	}



