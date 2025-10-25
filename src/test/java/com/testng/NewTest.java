package com.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	
	
	

  @Parameters( {"username"})
  @Test(groups = {"smoke"}, dependsOnMethods = {"test2"},dependsOnGroups = {"regression"})
  public void test1(@Optional("jaha") String name) {
	  System.out.println(name);
	  
	  String browser = "Chrome";
	 int a = 10;
	 int b=9;
	 int c =(a>b?a:b);
  }
  
  
  @Test(groups= {"regression"},dataProvider ="dataProviderMet",invocationCount = 3,threadPoolSize = 2)
  public void test2()
  {
	  System.out.println("s8");
  }
  
  @DataProvider(parallel = true, name = "jajaj")
  public Object[][] dataProviderMet() throws  IOException
  {
	  File file = new File("//src/haha");
	  FileInputStream src = new FileInputStream(file);
	  XSSFWorkbook workbook = new XSSFWorkbook(src);
	  XSSFSheet sheet = workbook.getSheet("sheet1");
	  
	  int noOfRows = sheet.getPhysicalNumberOfRows();
	  int noOfCells = sheet.getRow(0).getLastCellNum();
	  Object[][] obj = new Object[noOfRows][noOfCells];
	  for(int i=0;i<noOfRows;i++ )
	  {
		  for(int j=0;j<noOfCells;j++)
		  {
			  obj[i][j]= sheet.getRow(i).getCell(j).getStringCellValue();
		  }
	  }
	  workbook.close();
	  src.close();
	  return obj;
  }
}
