package testngwaits;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ex {
	//create an object for webdriver wait class
	//pass driver instance and time imit as input
	//call untill method
	//call conditions 
// code is correct:  executes within time limit,it will proceed further(will not wait for completin of time limit)
	// code s wrong: it will wait for the completion of time limit , then it will throw up error
	@Test
	public void hs() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		
		WebDriverWait w= new WebDriverWait(ob,5);
		
		//title
		//w.until(ExpectedConditions.titleIs("yaoo"));
		
		//w.until(ExpectedConditions.titleContains("oo"));
		
		//alert
		//w.until(ExpectedConditions.alertIsPresent());
		
		//visbility of an element
		// finding the element and checking its visibility
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Images")));
		
		//visibility of more elements
		//collecting all the images and checking its visibility
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
		
		//element to be clickable
		//finding the element and checking whether it is clickable or not
		w.until(ExpectedConditions.elementToBeClickable(By.linkText("Privacy")));
		
		ob.quit();
	}
}
