package cap.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathClass {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver = new ChromeDriver();
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  driver.findElement(By.xpath("//input[@value='radio1']")).click();
  }
}
