package firsttestngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTestNGFile {
	
	
	public String baseURL="https://web-dev.bridgestonehub.com";
	WebDriver driver=new FirefoxDriver();
  @Test
  public void verifyURL() {
	  driver.get(baseURL);
	  driver.quit();
  }
}
