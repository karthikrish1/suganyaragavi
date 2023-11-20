package testngassertion;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testnglistenerr.i1.class)
public class a1 {
	/*
	 * assertion: tech where we will be comparing actual result with obtained result
	 * 
	 * hard:
	 *     provided by assert builtin
	 *     static in nature
	 *     assertion fails=> it will not proceed further
	 *     
	 *soft  
	 *provided by softassert builtin
	 *nonstatic
	 *fail=> it will proceed further
	 *original: assertAll()
	 *
	 *assertEquals(actual, expected)
	 *assertnotEqual(actual, expected)
	 *assertTrue(condition)
	 *assertFalse(condition)
 * 
	 * */
	
	@Test
	public void hs() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		 File f = ob.getScreenshotAs(OutputType.FILE);
		 //FileUtils => apache directoru studio
		 FileUtils.copyFile(f, new File("C:\\Users\\hp\\eclipse-workspace\\9.30maven\\src\\main\\java\\f.png"));
		//Assert.assertEquals(ob.getTitle(), "yahoo");
		Assert.assertNotEquals(ob.getTitle(), "yahoo");
		WebElement ele = ob.findElementByLinkText("Images");
		Assert.assertTrue(ele.isDisplayed());
		Assert.assertFalse(ele.isSelected());
		ob.quit();
	}

}
