package testngdependency;

import org.testng.annotations.Test;

public class d2 {
	//dependsOnGroups:  create connection between group and test cases
	
	@Test(priority=0,groups="L")
	public void t1()
	{
		System.out.println("test case 1");
	}
	
	@Test(priority=1,groups="t")
	public void t2()
	{
		System.out.println("test case 2");
	}
	
	@Test(priority=2,dependsOnGroups= {"L","t"})
	public void g()
	{
		System.out.println("test case 3");
	}
	
	//L:  t1,t2   : pass      g:pass
	// even 1 fail            g: skip

}
