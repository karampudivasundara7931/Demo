package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\karampudi.vasundara\\eclipse-workspace\\demo\\src\\browser\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.demo.guru99.com/V4/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr525354");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("uqyzAty");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
		
	}
}
