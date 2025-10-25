package cap.test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException, IOException {

	  
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--headless=new");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
	  Select s= new Select(driver.findElement(By.id("dropdown-class-example")));
	  s.selectByIndex(1);
	  Thread.sleep(Duration.ofSeconds(2));
	  s.selectByVisibleText("Option2");
	  
	  driver.findElement(By.xpath("//input[contains(@id,'name')]")).sendKeys("Jaga");
	  driver.findElement(By.xpath("//input[starts-with(@id,'alertbtn')]")).click();
	  
	  Alert a = driver.switchTo().alert();
	 // a.accept();
	  a.dismiss();
	  
	  
	  WebElement mouseHover = driver.findElement(By.id("mousehover"));
	  Actions action =new Actions(driver);
	  //action.moveToElement(mouseHover).click().build().perform();
	  
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  jse.executeScript("arguments[0].scrollIntoView(true)", mouseHover);
	  action.moveToElement(mouseHover).perform();
	  
	  driver.navigate().to("https://practice.expandtesting.com/drag-and-drop");
	  Thread.sleep(Duration.ofSeconds(5));

	  WebElement drag1 = driver.findElement(By.id("column-a"));
	  WebElement drag2 = driver.findElement(By.id("column-b"));
	  jse.executeScript("arguments[0].scrollIntoView(true);", drag1);
	  Thread.sleep(Duration.ofSeconds(2));

	  action.dragAndDrop(drag1, drag2).build().perform();
	  
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\target\\screenshots\\screenshot.png"));
	  
	  Set<String> windows = driver.getWindowHandles();
	  Iterator<String> it = windows.iterator();
	  
	  driver.switchTo().window(it.next());
	  
	  
	  
	  
	  
  }
}
