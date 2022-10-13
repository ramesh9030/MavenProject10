package Excelutil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class MultipleBrowsersopen {
	WebDriver driver=null;
	String projcetPath=System.getProperty("user.dir");
	@Parameters("browserName")
	@BeforeTest
	public void setpu(String browserName) {
		System.out.println(browserName);
		if(browserName.equalsIgnoreCase("chrome")){ 
			System.setProperty("webdriver.chrome.driver",projcetPath+ "‪‪‪‪‪\\src\\driver\\chromedriver.exe");
			driver=new ChromeDriver();

		}
		else if(browserName.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver",projcetPath+  "‪‪‪‪‪\\src\\driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver",projcetPath+ "‪‪‪‪‪\\src\\driver\\InternetExplorerDriver.exe");
			driver=new InternetExplorerDriver ();
		}
	}
		@Test
		public void test1() {
			driver.get("www.facebook.com");
			System.out.println(driver.getTitle());
		}


		@AfterTest
		private void close() {
			driver.close();
			System.out.println("Application close");
		}

	}
