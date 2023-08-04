package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class getPropertyData {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		 Properties p = new Properties();
		 p.load(fis);
		  String data = p.getProperty("url");
		  System.out.println(data);
	}

}
