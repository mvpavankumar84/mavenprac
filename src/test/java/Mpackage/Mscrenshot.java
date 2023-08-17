package Mpackage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mscrenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Browserdrivers\\chromedriver_win32\\chromedriver.exe");
		
        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Maximize the browser
        driver.manage().window().maximize();
 
        // Launch Website
        driver.get("https://demo.guru99.com/test/newtours/register.php");
    
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("pradeep");
        TakesScreenshot scrnshot=((TakesScreenshot)driver);
        File srcfile=scrnshot.getScreenshotAs(OutputType.FILE);
        
        File destfile=new File("E:\\selenium\\failedsshot_" + datestamp()+ ".png");
        
        FileUtils.copyFile(srcfile, destfile);
        
	}
	
	public static String datestamp() {
		return new SimpleDateFormat ("dd.mm.yy.hh.mm.ss").format(new Date());
	}

}
