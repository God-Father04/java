package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void Capture(WebDriver driver, String name) throws IOException {
		
		TakesScreenshot ss=(TakesScreenshot) driver;
		
		File source=ss.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\Admin\\eclipse-workspace\\Java\\Screenshot\\"+name+".png");
		
		FileHandler.copy(source, dest);
		
		System.out.println("ScreenShot Caputre");
		
	}

	
	}


