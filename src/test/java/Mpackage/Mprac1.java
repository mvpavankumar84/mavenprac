package Mpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mprac1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Browserdrivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		
		  driver.get("https://demo.guru99.com/test/newtours/register.php");
		  driver.manage().window().maximize();
		  driver.findElement(By.name("firstName")).sendKeys("PFN test firstname");
		  driver.findElement(By.linkText("REGISTER")); 
		  driver.findElement(By.cssSelector(".email")).sendKeys("myemail@gmail.com");
		  driver.findElement(By.cssSelector("input.userName")).sendKeys("usermyemail@gmail.com");
		  //driver.close();
		

		/*
		 * driver.get("https://money.rediff.com/gainers");
		 * driver.findElements(By.xpath("//a[contains(text(),'Softsol India')]"));
		 * driver.close();
		 */

	}

}
