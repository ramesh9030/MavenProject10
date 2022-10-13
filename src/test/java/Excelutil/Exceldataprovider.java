package Excelutil;

import org.apache.poi.ss.format.CellDateFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exceldataprovider {
	WebDriver driver;
	@BeforeTest
	public void setUpTest() {
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver","\\driver\\chromedriver.exe");
		driver=new ChromeDriver();

	}

	@Test(dataProvider="test1data")
	public void test1(String username,String password) throws Exception {
		System.out.println(username+"|"+password);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_b")).click();
		driver.quit();

	}
	@DataProvider(name="test1data")
	public Object[][] getData() {
		String excelPath="C:\\Eclipse\\Mavenproject\\Excel\\excelsheet.xlsx";
		Object data[][]=testData(excelPath, "sheet1");
		return data;
	}
	public   Object[][]testData(String excelPath,String sheetName) {
		Excelfile excel=new Excelfile(excelPath, sheetName);
		int rowCount=excel.getRowCount();
		int colCount=excel.getcolCount();
		Object data[][]=new Object[rowCount-1][colCount];	
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				String CellData=excel.getCellDataString(i, j);
				//System.out.print(CellData+"|");
				data[i-1][j]=CellData;
			}
			//System.out.println();
		}
		return data;

	}

}
