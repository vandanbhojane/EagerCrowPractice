package Keywords;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.xyz.utilities.ReadConfig;

public class Keywords {
	public static Logger logger;
	static ReadConfig readconfig=new ReadConfig();
	static Robot robot=null;
	
	public static void openBrowser(String browserName) {
		
		logger =Logger.getLogger("EagerCrow");
		PropertyConfigurator.configure("Log4j.properties");//Added logger

		switch (browserName) {
		case "Chrome": {
			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			Constants.setDriver(new ChromeDriver());
			//System.out.println(browserName + " Browser Open Successfully");
			break;
		}
		case "FireFox": {
			System.setProperty("webdriver.gecko.driver", "E:\\java video\\Testing Data\\WebDrivers\\geckodriver.exe");
			Constants.setDriver(new FirefoxDriver());
			//System.out.println(browserName + " Browser Open Successfully");
			break;
		}

		case "IE": {
			System.setProperty("webdriver.ie.driver", "E:\\java video\\Testing Data\\WebDrivers\\IEDriverServer.exe");
			Constants.setDriver(new InternetExplorerDriver());
			//System.out.println(browserName + " Browser Open Successfully");
			break;
		}
		default:
			System.out.println("Invalid Browser:" + browserName + " Please enter FireFox/IE/Chrome");
			break;
		}
		Constants.getDriver().manage().window().maximize();
		System.out.println("Opne browser is "+browserName);

	}
 
  public static  void openURL() {
	Constants.getDriver().get(readconfig.getApplicationURL());

}

  public static void captureScreenShot() {
		TakesScreenshot ts = (TakesScreenshot) Constants.getDriver();
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + "ScreenShot"+ timeStamp () + ".png");
		//File target = new File(System.getProperty("user.dir") + "/Screenshots/" + "logo1"+ ".png");

		try {
			FileUtils.copyFile(source, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static String timeStamp() {	
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
	
	 public  static void minimize() {	
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		 robot.delay(500);
		 robot.keyPress(KeyEvent.VK_ALT);
		 robot.keyPress(KeyEvent.VK_SPACE);	
		 robot.keyPress(KeyEvent.VK_N);
		 robot.delay(150);
		 robot.keyRelease(KeyEvent.VK_N);
		 robot.keyRelease(KeyEvent.VK_SPACE);
		 robot.keyRelease(KeyEvent.VK_ALT);
	 	}
	 
	 public static void robotClassSnap()
	   {
		 BufferedImage as=robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			File file=new File("./Screenshots/robosnap.png");
			try {
				ImageIO.write(as, "png", file);
					} catch (IOException e) {
				e.printStackTrace();
			}
	     }
	 
	 public static void clickOperation(WebElement element) {
		 Constants.setDriver(element);
		 Constants.getElement().click();
		
	}
	}