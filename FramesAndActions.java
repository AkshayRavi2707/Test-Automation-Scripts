
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.HashSet;
import java.util.Iterator;
import com.google.common.collect.Sets;

public class FramesAndActions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//Users//akshayravi//Downloads//SELENIUM//chromedriver");

		WebDriver driver = new ChromeDriver();
		
		// Opening the URL https://jqueryui.com/droppable/
		driver.get("https://jqueryui.com/droppable/");
		
		// switching into the frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		// driver.findElement(By.id("draggable")).click();
		
		// getting the count of number of frames present in the webpage
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		// Performing the action of dragging and dropping it in the box
		Actions a = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		
		// Switching back outside the frame
		driver.switchTo().defaultContent();
		
		
		
		
		

	}

}
