package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class browser {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\karampudi.vasundara\\eclipse-workspace\\demo\\src\\browser\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		/*login page 
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("vasusrikaram@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.cssSelector("#ap_password")).sendKeys("Cutethali@1234");
		driver.findElement(By.id("signInSubmit")).click();*/
		//searching product
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("per");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("/html/body/div[1]/header/div/div[2]/div/div[2]/div/div[1]/div"));
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("perfume"))
			{
				option.click();
				break;
			}
		}
		//scrolling
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//scroll through pixel
		js.executeScript("window.scrollBy(0,800)", "");
		//scroll page till we find element
		//WebElement pf = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[17]/div/div/div/div/div[2]/div[1]/h2/a/span"));
		//js.executeScript("arguments[0].scrollIntoView();", pf);
		//scroll page till buttom
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/div/div/div[2]/div[1]/h2/a/span")).click();
	}

}
