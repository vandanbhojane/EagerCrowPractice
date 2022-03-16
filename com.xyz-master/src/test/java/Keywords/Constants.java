package Keywords;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@SuppressWarnings("unused")
public class Constants {
	private static WebDriver driver;
	private static WebElement element;	
	private static FileInputStream fis;	

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Constants.driver = driver;
	} 
	public static WebElement getElement() {
		return element;
	}

	public static void setDriver(WebElement element) {
		Constants.element = element;
	}
	
	public static FileInputStream getFile() {
		return fis;
	}

	public static void setFile(File file) throws FileNotFoundException {
		Constants.fis = new FileInputStream(file);
	}
}
