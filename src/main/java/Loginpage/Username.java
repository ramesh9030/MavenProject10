package Loginpage;


 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Username {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","‪‪‪‪‪\\src\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("www.facebook.com");
		System.out.println(driver.getTitle());
	}

}
