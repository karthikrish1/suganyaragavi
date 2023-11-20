package testngdependency;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class real {
	ChromeDriver ob;
	@Test(priority=0,description="visiting mycontactform.com",groups="y")
	public void visiting()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		
	}
	
	@Test(priority=1,description="maximising",groups="y")
	public void max()
	{
		ob.manage().window().maximize();
	}
	
	@Test(priority=2,description="refreshing",invocationCount=3,groups="y")
	public void refreshing()
	{
		ob.navigate().refresh();
	}
	
	@Test(priority=3,description="login",dependsOnGroups="y")
	public void loging()
	{
		//id=user
				ob.findElementById("user").sendKeys("Dhivyakarthi123");
				
				//name=pass
				ob.findElementByName("pass").sendKeys("12345");
				
				//classname: btn_log
				ob.findElementByClassName("btn_log").click();
	}
	
	@Test(priority=4,description="closing",dependsOnGroups="y",timeOut=3000)
	public void closing() throws InterruptedException
	{
		Thread.sleep(2000);
		ob.quit();
	}

}
