package Mpackage;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.print.attribute.standard.DateTimeAtProcessing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Mconstructor {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Browserdrivers\\chromedriver_win32\\chromedriver.exe");
		
		        // Instantiate a ChromeDriver class.
		        WebDriver driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        // Maximize the browser
		        driver.manage().window().maximize();
		 
		        // Launch Website
		        driver.get("https://demo.guru99.com/test/newtours/register.php");
		    
         driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("pradeep");

         TakesScreenshot scrShot =((TakesScreenshot)driver);

       //Call getScreenshotAs method to create image file

               File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
               
               System.out.println(timestamp());
               

           //Move image file to new destination

               File DestFile=new File("E:\\selenium\\test_" +timestamp()+ ".png");

               //Copy file at destination
               
               FileUtils.copyFile(SrcFile, DestFile);
               

	}
	
	public static String timestamp() {
       return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

}
