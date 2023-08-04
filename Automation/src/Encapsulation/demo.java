package Encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("chrome://settings/appearance");
	driver.findElement(By.id("knob")).click();


}
}