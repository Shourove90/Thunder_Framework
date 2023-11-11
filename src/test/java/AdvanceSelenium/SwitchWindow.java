package AdvanceSelenium;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow {

	public static void main(String[] args) {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//this is where we are locating click here button
		WebElement ClickHereLink = driver.findElement(By.xpath("//a[contains(text(), 'Click Here')]"));
        // this is where we are clicking
		ClickHereLink.click();
       
		
		String maninWindow = driver.getWindowHandle();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> i = windows.iterator();

		while (i.hasNext()) {

			String childWindow = i.next();

			if (!maninWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
			}

		}
		
         //first line we are locating the text
		WebElement newWindowText = driver.findElement(By.xpath("//div[@class='example']/h3"));
        // this line we are verifying what ever the text is on the new window
		Assert.assertEquals(newWindowText.getText(), "New Window");
		
		Assert.assertTrue(newWindowText.isDisplayed());
		Assert.assertFalse(newWindowText.isDisplayed());

		
	}
}
