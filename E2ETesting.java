import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2ETesting {

	public static void main(String[] args) {
		
		
		// Script to search for hotels in Toronto and flights from Vancouver to Toronto on travelocity.com
		
		System.setProperty("webdriver.chrome.driver", "//Users//akshayravi//Downloads//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.travelocity.com/");
		
		//Check-in Date
		 driver.findElement(By.xpath("//*[@id=\"hotel-checkin-wrapper-hp-hotel\"]/label/span[2]")).click();
		 driver.findElement(By.xpath("//*[@id=\"hotel-checkin-wrapper-hp-hotel\"]/div/div/div[2]/table/tbody/tr[3]/td[2]/button")).click();
			
		//Check-out Date
		 driver.findElement(By.xpath("//*[@id=\"hotel-checkout-wrapper-hp-hotel\"]/label/span[2]")).click();
		 driver.findElement(By.xpath("//*[@id=\"hotel-checkout-wrapper-hp-hotel\"]/div/div/div[2]/table/tbody/tr[3]/td[7]/button")).click();
		 
		
		// Selecting Toronto as location
		 WebElement source = driver.findElement(By.xpath("//input[@data-lob = 'HOTELS']"));
		 source.sendKeys("Toronto");
		 source.sendKeys(Keys.ARROW_DOWN);
		 source.click();
		 
		 
		// Selecting number of Rooms
		Select s = new Select(driver.findElement(By.id("hotel-rooms-hp-hotel")));
		s.selectByValue("1");
		
		// Selecting the number of Adults
		Select s1 = new Select(driver.findElement(By.id("hotel-1-adults-hp-hotel")));
		s1.selectByValue("2");
		
		// Selecting the number of Children
		Select s2 = new Select(driver.findElement(By.id("hotel-1-children-hp-hotel")));
		s2.selectByValue("2");
		
		// Selecting age of child1
		Select s3 = new Select(driver.findElement(By.id("hotel-1-age-select-1-hp-hotel")));
		s3.selectByValue("3");
		
		// Selecting age of child2
		Select s4 = new Select(driver.findElement(By.id("hotel-1-age-select-2-hp-hotel")));
		s4.selectByValue("2");
		
		// Adding a flight checkbox
		driver.findElement(By.id("hotel-add-flight-checkbox-hp-hotel")).click();
		
		// Search bar to select the source location as Vancouver
		
		WebElement source1 = driver.findElement(By.xpath("//*[@id=\"hotel-flight-origin-hp-hotel\"]"));
		 source1.sendKeys("Vancouver");
		 source1.sendKeys(Keys.ENTER);
		 source1.click();
		 
		// Clicking on Search button
		 driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		
		
		}

}
