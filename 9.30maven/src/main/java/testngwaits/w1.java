package testngwaits;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class w1 {
	
	//waits=> synchronisatio tech
	
	// conditional  =>    explicit wait 
	//unconditional  => implicit wait , thread.sleep()
	
	//implicit wait : once it is declared all the code which is present after it will take the time limit
	
	// code is correct:  executes within time limit,it will proceed further(will not wait for completin of time limit)
	// code s wrong: it will wait for the completion of time limit , then it will throw up error

	@Test
	public void hs() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		ob.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.println(ob.getTitle());//5
		System.out.println(ob.getCurrentUrl());//5
		ob.navigate().refresh();//5
		ob.findElementByLinkText("dhivya");//5
		ob.quit();
	}//5
}
