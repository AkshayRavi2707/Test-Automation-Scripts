import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelsSearchScript {

	public static void main(String[] args) {
		
		//Simple Script to Automate the Searching of Rooms in Burj-al-arab, Dubai
		
		System.setProperty("webdriver.chrome.driver", "//Users//akshayravi//Downloads//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		// jumeriah.com - Burj-al-arab
		driver.get("https://www.jumeirah.com/en/stay/dubai/burj-al-arab-jumeirah");
		
		//Closing the popup
		driver.findElement(By.id("balipopup_close")).click();
		
		//Clicking on Book Now option
		driver.findElement(By.xpath("//div[@class = 'right-aligned']/button")).click();
		
		//Clicking on Adults add option
		
		WebElement e1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/span[1]/img"));
		
		
		for(int i = 1; i< 3;i++)
		{
			e1.click();
		}
			
		// Clicking on Children option
		WebElement e2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/span[1]/img"));
		e2.click();
		
		
		
		// Continuing to Dates
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		// From Date
		driver.findElement(By.cssSelector("//div[@aria-label='Fri Apr 17 2020']/div/span[1]")).click();
		
		//To Date
		driver.findElement(By.xpath("//div[@aria-label='Wed Apr 22 2020']/div/span[1]")).click();
		
		// Searching for Rooms
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div[3]/div[2]/div[1]/button")).click();
		 

	}

}
