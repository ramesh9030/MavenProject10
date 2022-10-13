package Excelutil;

import org.testng.annotations.Test;

public class Exceldata {
	public static void main(String[] args) {
	
		String projectPath= System.getProperty("user.dir");
		Excelfile excel=new Excelfile(projectPath+"\\Excel\\excelsheet.xlsx", "sheet1");
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);
		
}
}
