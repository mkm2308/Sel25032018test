import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mkm {
	
	static WebDriver driver;
	
	public static void main(String [] args){
	
	mkm.openBrowser();
	}
	
	public static void openBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Manish Mehta\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		//driver.manage().window().maximize();
		System.out.println("testing");
	}
}
