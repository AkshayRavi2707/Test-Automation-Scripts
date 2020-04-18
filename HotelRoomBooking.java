import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HotelRoomBooking {

	public static void main(String[] args) {
		
		// Script to Search for Rooms in Emirates Palace Abu Dhabi
		
		System.setProperty("webdriver.chrome.driver", "//Users//akshayravi//Downloads//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//Emirates Palace website
		driver.get("https://www.mandarinoriental.com/abu-dhabi/emirates-palace/luxury-hotel");
		
		// Selecting number of Rooms
		Select s = new Select(driver.findElement(By.id("rooms-14")));
		s.selectByValue("3");
		
		// Clicking on From Date Calendar box
		driver.findElement(By.id("checkin-14")).click();
		
		// Selecting the From Date as April 20th, 2020
		driver.findElement(By.xpath("//*[@id=\"property-masthead-console\"]/div[2]/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[4]/td[2]/a"))
.click();		
		
		
		//Cliking on the To Date Calendar box
		driver.findElement(By.id("checkout-14")).click();
		
		// Selecting the To Date as April 23rd, 2020
		driver.findElement(By.xpath("//*[@id=\"property-masthead-console\"]/div[2]/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[4]/td[5]/a")).click();
		
		// Number of Guests
		Select s1 = new Select(driver.findElement(By.id("guests-14")));
		s1.deselectByValue("3");
		
		
		// Check Rates
		driver.findElement(By.xpath("//button[@data-file = 'PropertyConsoleForm.vue']")).click();
		
		
		// Displaying Rooms for the chosen Selection
		driver.findElement(By.xpath("//button[@class = 'button search cta show-for-medium']")).click();
		
		
		
		

	}

}
