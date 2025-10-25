package cap.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewTestShadow {
  @Test
  public void f() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("chrome://downloads/");
	  JavascriptExecutor js =  (JavascriptExecutor)driver;
	  String a ="document.querySelector(\"downloads-app\").shadowRoot.querySelector(\"responsive-side-pane-layout >div >downloads-searchbox \").shadowRoot.querySelector(\"header >fluent-text-input\").shadowRoot.querySelector(\"div >input\")";
	  WebElement ele = (WebElement)js.executeScript("return document.querySelector(\"downloads-manager\").shadowRoot.querySelector(\"downloads-toolbar\").shadowRoot.querySelector(\"cr-toolbar\").shadowRoot.querySelector(\"div#centeredContent >cr-toolbar-search-field\").shadowRoot.querySelector(\"div#content >div\")");
	 // js.executeScript("arguments[0].click;", ele);
	 // String s = "arguments[0].setAttribute('value','Jaga')";
	 // js.executeScript("arguments[0].value='Jaga'", ele);
	  //ele.sendKeys("jaga");
	  
	  Actions action = new Actions(driver);
	  action.moveToElement(ele).click().sendKeys("jaga").build().perform();
  }
}
