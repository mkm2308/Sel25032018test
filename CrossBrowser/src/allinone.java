import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class allinone {

	WebDriver driver;
		
	@Test
	@Parameters("browser")
	public void openBrowser(String browsername)
	{
	 if (browsername.equalsIgnoreCase("firefox"))
	 {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Manish Mehta\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");		
	  driver = new FirefoxDriver();    
	 }else
	 if (browsername.equalsIgnoreCase("chrome"))
	 {
	  System.setProperty("webdriver.chrome.driver", "C:\\QA - QA - QA\\Selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	 }else
	 if (browsername.equalsIgnoreCase("ie"))
	 {
	  System.setProperty("webdriver.ie.driver", "C:\\QA - QA - QA\\Selenium\\IEDriverServer.exe");
	  driver = new InternetExplorerDriver();
	 }
	 driver.get("http://the-internet.herokuapp.com/");
	}
}
	 