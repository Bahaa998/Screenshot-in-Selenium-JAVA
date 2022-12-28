package MyTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ClassTest {

	public static void main(String[] args) throws IOException, InterruptedException {
//		System.setProperty("webDriver.chrome.driver",
//				"‪C:\\Users\\ECC\\OneDrive\\Desktop\\selenium_dev\\chromedriver.exe");
				
//		// FireFox Driver
//		System.setProperty("webDriver.gecko.driver", "‪F:\\FireFoxDriver\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		
		// Edge Driver
		System.setProperty("webDriver.Egde.driver", "‪F:\\EgdeDriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user" + Keys.TAB + "secret_sauce" + Keys.ENTER);
		
		
// *******************************(((( Process of taking a screenshot ))))************************************
		
		Date currentDate = new Date();
		
		String TheActualDate = currentDate.toString().replace(":", "_");
		
		
		TakesScreenshot Capture = ((TakesScreenshot)driver);
		File srcFile = Capture.getScreenshotAs(OutputType.FILE);
		File Destination = new File(".\\QA_Secreenshots\\" + TheActualDate + ".png");
		FileUtils.copyFile(srcFile, Destination);
		
// *******************************(((( Process of taking a screenshot ))))************************************


	}

}
