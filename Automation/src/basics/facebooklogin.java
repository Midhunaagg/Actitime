package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {


		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			boolean loginbutton= driver.findElement(By.xpath("//button[@name='login']")).isDisplayed();
			if(loginbutton==true){
				System.out.println("login button is enabled and pass");
				
			}
			else
			{
				System.out.println("login button is not enabled and fail");
			}

			driver.close();	
			

	}

	}


