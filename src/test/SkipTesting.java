package test;

import org.testng.SkipException;
import org.testng.annotations.Test;

import base.Config;

public class SkipTesting extends Config{
	@Test
	public void goingToSkipThis (){
		System.out.println ("I am going to skip this test");
		APPLICATION_LOGS.debug("This TC is going to skip");
		throw new SkipException ("Skipping because this tc is no longer needed");


	}
	// Don't execute the test at all
	@Test (enabled=false)
	public void disableTest (){
		System.out.println ("I am NOT going to skip this test");
	}

	// enabled=true  - execute the test all the time
	@Test
	public void notGoingToSkipThis (){
		System.out.println ("I am NOT going to skip this test");
	}


}
