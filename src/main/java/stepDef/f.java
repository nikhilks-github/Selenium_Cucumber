package stepDef;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class f {
  @Test
  public void test() throws IOException {
	  File src = new File("C:\\Users\\a07208trng_b4b.04.25\\Desktop\\sampledata.xlsx"); 
	  FileInputStream fs = new FileInputStream(src);
	  XSSFWorkbook wb = new XSSFWorkbook(fs);
	  XSSFSheet sh = wb.getSheetAt(0);
	  System.out.println("First Row number" +sh.getFirstRowNum());
	  System.out.println("Last Row number"+ sh.getLastRowNum());
	  int rowcount = sh.getLastRowNum() - sh.getFirstRowNum() ; 
	  int numofcolumns = sh.getRow(0).getPhysicalNumberOfCells();
	  System.out.println("Row cunr is "+rowcount);
	  System.out.println("no of columns" + numofcolumns);
	  /*System.out.println(sh.getRow(0).getCell(0).getStringCellValue()+ "\t\t"+ sh.getRow(0).getCell(1).getStringCellValue());
	  System.out.println(sh.getRow(1).getCell(0).getStringCellValue()+ "\t\t"+ sh.getRow(1).getCell(1).getStringCellValue());
	  System.out.println(sh.getRow(2).getCell(0).getStringCellValue()+ "\t\t"+ sh.getRow(2).getCell(1).getStringCellValue());*/
	  
	  for(int i = 1; i<=rowcount; i++ )
	  {
		  WebDriver driver = null;
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.25\\Desktop\\cucumber_training_nikhil\\chromedriver_win32 (3)\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get("http://demowebshop.tricentis.com/");
		   driver.manage().window().maximize();
		   driver.findElement(By.linkText("Log in")).click();
		   driver.findElement(By.id("Email")).sendKeys(sh.getRow(i).getCell(0).getStringCellValue());
		   driver.findElement(By.id("Password")).sendKeys(sh.getRow(i).getCell(1).getStringCellValue());
		   driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		
	  }
	   XSSFRow header = sh.getRow(0);
	   XSSFCell head = header.createCell(2);
	   FileOutputStream fos = new FileOutputStream(src); 
	   sh.getRow(0).getCell(2).setCellValue("Status");
	   sh.getRow(1).getCell(2).setCellValue("PASS");
	   sh.getRow(2).getCell(2).setCellValue("PASS");
	   wb.write(fos);
  }
}
