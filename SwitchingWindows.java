import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.HashSet;
import java.util.Iterator;
import com.google.common.collect.Sets;


public class SwitchingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "//Users//akshayravi//Downloads//SELENIUM//chromedriver");

		WebDriver driver = new ChromeDriver();
		
		// Opening herokuapp.com website
		driver.get("https://the-internet.herokuapp.com/");
		
		// choosing mutliple windows option
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.getTitle();
		
		// choosing "click here" inside multiple windows option
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
		System.out.println(driver.getTitle());
		
		// Getting the Id of the new window
		Set<String>ids = driver.getWindowHandles();
		
		// Iterator for iterating through the set for multiple rows
		Iterator<String> it = ids.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		// Toggling to the child window
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		
		// Toggling back to the parent window
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		

	}

}
