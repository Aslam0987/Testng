package Bottle;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Jenkinstest {
	
	@Test
	public void test()
	{
		
		System.out.println("test");
		
		Assert.assertEquals(10,11);
		
		Assert.assertEquals(11, 11);
	}

}
