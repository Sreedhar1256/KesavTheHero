package kesavaro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://localhost:9090/DQAM";
		String expectedTitle = "Data Quality Assessment Manager v8.1";
		String actualTitle = "";
		driver.get(baseUrl);
		String currentUrl = driver.getTitle();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
       
  if (expectedTitle.equals(currentUrl)) {
	  System.out.println(currentUrl);
	  System.out.println("Test Passed!");
  }else
  {
	  System.out.println("Test Failed");
  }
  driver.close();
	}

}
