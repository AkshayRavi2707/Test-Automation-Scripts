import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Simple Script which Automates the Viewing of Tech Specs of a Mac Model in Apple Website (Custom Xpath and CSS)
public class SimpleAutomationScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "//Users//akshayravi//Downloads//SELENIUM//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.apple.com/ca/");
		
		// Selecting mac
		driver.findElement(By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[2]/a")).click();
		
		// Selecting Macbook Air
		driver.findElement(By.cssSelector("span.chapternav-new")).click();
		
		// Selecting Tech Specs
		driver.findElement(By.xpath("//a[@data-analytics-title = 'specs']")).click();
		
		

	}

}
