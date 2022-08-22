package selenium;

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

public class XLfile {
	public static String readData(int c,int r) throws IOException {
		//step-1
		String path=System.getProperty("user.dir")+"\\Screenshot\\Data.xlsx";
		//step-2
		File file=new File(path);
		//step-3
		FileInputStream fis=new FileInputStream(file);
		//step-4
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//step-5 locate sheet under workbook
		XSSFSheet sheet=wb.getSheetAt(0);
		//step-6 get row from sheet context
		XSSFRow row=sheet.getRow(r);
		//step-7 get cell
		XSSFCell cell=row.getCell(c);
		//step-8
		String value=cell.getStringCellValue();
		//step-9
		//wb.close();
		System.out.println(value);
		return value;
	}
	public static String writeData(int r,int c, String val) throws IOException {
		String path=System.getProperty("user.dir")+"\\Screenshot\\Data.xlsx";
		//step-2
		File file=new File(path);
		//step-3
		FileInputStream fis=new FileInputStream(file);
		//step-4
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//step-5 locate sheet under workbook
		XSSFSheet sheet=wb.getSheetAt(0);
		XSSFRow row=sheet.createRow(r);
		XSSFCell cell=row.createCell(c);
		cell.setCellValue(val);
		FileOutputStream os=new FileOutputStream(path);
		wb.write(os);
		return path;
		
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");

		//step-1 launch browser
		WebDriver driver=new ChromeDriver();

		//step-2 maximize window
		driver.manage().window().maximize();

		//step-3 open webpage
		driver.get("https://opensource-demo.orangehrmlive.com/");

		//step-4 
		driver.findElement(By.id("txtUsername")).sendKeys(readData(0,0));

		//step-5
		driver.findElement(By.id("txtPassword")).sendKeys(readData(1,0));

		//step-6
		driver.findElement(By.id("btnLogin")).click();
		
		readData(0,0);
		writeData(5,0, driver.getCurrentUrl());

		//Step-7 
		Thread.sleep(8000);
		//driver.close();


	}

}
