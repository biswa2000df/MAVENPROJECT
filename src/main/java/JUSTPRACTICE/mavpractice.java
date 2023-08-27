package JUSTPRACTICE;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class mavpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.ie.driver", "C:\\Users\\biswa\\Downloads\\edge\\msedgedriver.exe");
//		WebDriver driver;
//		EdgeOptions caps =  new EdgeOptions();
//     caps.setCapability("browserVersion", "11.edge-latest");
//     caps.setCapability("platformName", "win11");
//     caps.setCapability("requireWindowFocus", true);
//     caps.setCapability("ie.ensureCleanSession", true);
//     caps.setCapability("ignoreZoomSetting", true);
//     caps.setCapability("nativeEvents", true);
//     caps.setCapability("ignoreProtectedModeSettings", true);
//     driver = new EdgeDriver(caps);
//     
     
//     InternetExplorerOptions ieOptions = new InternetExplorerOptions();
//     ieOptions.attachToEdgeChrome();
//     ieOptions.withEdgeExecutablePath("C:\\Users\\biswa\\Downloads\\edge\\IEDriverServer.exe");
//     
//     WebDriver driver = new InternetExplorerDriver(ieOptions);
//     driver.get("http://www.bing.com");
//     WebElement elem = driver.findElement(By.id("sb_form_q"));
//     elem.sendKeys("IE mode", Keys.RETURN);
//     driver.close();
		System.setProperty("webdriver.ie.driver", "C:\\Users\\biswa\\Downloads\\edge\\IEDriverServer.exe");
//		InternetExplorerOptions edgeIe11Options = new InternetExplorerOptions();
//		Map<String, Object> ops = (Map<String, Object>) edgeIe11Options.getCapability("se:ieOptions");
//		ops.put("ie.edgechromium", true);
//		ops.put("ie.edgepath", "C:\\Users\\biswa\\Downloads\\edge\\msedgedriver.exe");
//		InternetExplorerDriver driver = new InternetExplorerDriver(edgeIe11Options);
//		driver.get("https://wikipedia.com");    
		InternetExplorerOptions ieOptions = new InternetExplorerOptions();
//	     ieOptions.attachToEdgeChrome();
//	     ieOptions.withEdgeExecutablePath("C:\\Users\\biswa\\Downloads\\edge\\msedgedriver.exe");
//	     DesiredCapabilities caps = new DesiredCapabilities();
		ieOptions.setCapability("ignoreZoomSetting", true);
	     WebDriver driver = new InternetExplorerDriver(ieOptions);
	     driver.manage().window().maximize();
	     driver.get("http://www.bing.com");
//	     WebElement elem = driver.findElement(By.id("sb_form_q"));
//	     elem.sendKeys("IE mode", Keys.RETURN);
	     driver.close();
    }

	

}
