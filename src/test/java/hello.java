import org.junit.Test;
import org.testng.Assert;
//import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class hello {

	@Test
	public void abc() throws Exception {
		// TODO Auto-generated method stub
		
String j="Hello";
		
		Assert.assertEquals("Hello", j);
		
Thread.sleep(5000);		
		

	}
	@Test
	public void def() throws Exception {
		// TODO Auto-generated method stub
		
String j="hi";
		
		Assert.assertEquals("bye", j);
		
Thread.sleep(4000);		
		

	}
}