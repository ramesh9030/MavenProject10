package Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class CalenderDemo1 {
	
	static WebDriver driver;
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/home");
		driver.findElement(By.xpath("//*[@id=\"checkin\"]")).click();
		String month="April 2020";
		String day="13";
		while(true) {
			String text=driver.findElement(By.xpath("//caption")).getText();
			if(text.equals(month)) {
				break;	
			}
			else {
				driver.findElement(By.xpath("/html/body/meso-native-marquee/section/div/div/div[1]/section/div/div[2]/div[2]/section[3]/form/section/div[4]/div[1]/div/div/div/button[2]")).click();
			}
		}
	}
}
