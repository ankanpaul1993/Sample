import org.junit.Test;

public class hello {

	@Test
	public void abc() throws Exception {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
 
// Initialize browser
WebDriver driver=new ChromeDriver();
 
// Open facebook
driver.get("http://www.facebook.com");
 
// Maximize browser
 
driver.manage().window().maximize();
		
		System.out.println("Hello");
		
Thread.sleep(5000);		
		

	}

}
