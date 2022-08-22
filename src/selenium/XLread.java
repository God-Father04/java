package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XLread {
	
	public static String readData(int row,int col) throws IOException {
		String Path="C:\\Users\\Admin\\eclipse-workspace\\Java\\Screenshot\\Data.xlsx";
		File file=new File(Path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		String s=sheet.getRow(row).getCell(col).getStringCellValue();
		return s;
			}

	public static void main(String[] args) throws IOException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//
//		//step-2 maximize window
//		driver.manage().window().maximize();


		System.out.println(readData(0,0));
		System.out.println(readData(0,1));
		System.out.println(readData(1,2));
		System.out.println(readData(2,0));
		System.out.println(readData(2,1));
		

	}

}
