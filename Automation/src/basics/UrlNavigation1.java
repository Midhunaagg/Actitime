package basics;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlNavigation1 {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String Url = driver.getCurrentUrl();
		if(Url.equals("https://www.gogole.com")) {
			System.out.println("Url is navigating successfully and pass");
		}
		else {
			System.out.println("Url is not navigating successfully and fail");
		}
		driver.close();

	}

}

