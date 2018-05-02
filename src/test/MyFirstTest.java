package test;

import org.testng.SkipException;
import org.testng.annotations.Test;

import base.Config;
import locators.Locators;
import values.Values;
@Test

public class MyFirstTest extends Config {


	Locators  loc= new Locators ();
	Values val= new Values();


	public void testingFramework(){

		APPLICATION_LOGS.debug("My Test Started");
		System.out.println ("testingEmail");

		typeByXpath(loc.emailxpath, val.Email);
		APPLICATION_LOGS.debug("User was able to type their email. email name was: "+ val.Email);
		typeByXpath(loc.idxpath, val.Pass );
	}
	@Test (enabled=false)
	public void skipping() {
		typebyXpath2(loc.signbutton);
		APPLICATION_LOGS.debug("My TEST Ended");
		throw new SkipException("This will skip");

	}



}
