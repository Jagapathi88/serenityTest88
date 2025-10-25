package cap.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest2 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  WebElement ele = driver.findElement(By.id("mousehover"));
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].scrollIntoView(true);", ele);
	  
	  WebElement iframe1 = driver.findElement(By.id("courses-iframe"));
	  driver.switchTo().frame(iframe1);
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Courses")).click();
	  //driver.switchTo().defaultContent();
	  driver.findElement(By.linkText("REST API")).click();
  }
}
