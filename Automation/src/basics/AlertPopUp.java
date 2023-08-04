package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopUp {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a = driver.switchTo().alert();//to transfer the control
		a.dismiss();
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		/*boolean t = driver.findElement(By.id("demo")).isDisplayed();

		if (t==true) {
			System.out.println(text+" text is present");
		} else {
			System.out.println(text+" text is not present");
		}*/
		driver.close();
	}

}
