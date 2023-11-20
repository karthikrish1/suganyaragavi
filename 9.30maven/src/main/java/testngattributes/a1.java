package testngattributes;

import org.testng.annotations.Test;

public class a1 {
	
	/*testng : test next generation
	 * 
	 * testing framework
	 * inpsired from JUNIt
	 * attributes,annotations, assertions, parallel, suite
	 * automatic report generation
	 * 
	 * Test cases
	 *     nonstatic
	 *     @Test
	 *     default : alphabetical order
	 *     
	 * priority:  arrange the test case in a particular ordr     
	 * description: short note on the testcase    
	 * groups  
	 * invocation count :  run the same test case for multiple time  
	 * enabled=false 
	 * timeout-> fix time limit for test case  
	 * */
	
@Test(priority=0,description="ONE",groups="kavi",invocationCount=4,enabled=false)
public void m1()
{
	System.out.println("Test case 1");
	}

@Test(priority=1,description="Two",groups="kavi")
public void ab()
{
	System.out.println("Test case 2");
	}

@Test(priority=2,description="THREEEe",groups="Ragavi")
public void m2()
{
	System.out.println("Test case 3");
	}
	

}
