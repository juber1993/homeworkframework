package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mySecondTest {
	@BeforeClass
	public void beforeClass(){
		System.out.println (" ***** @BeforeClass ");
	}
	@Test (priority=1)
	public void myTst(){
		System.out.println (" MY TEST CASE!! ");
	}

	@Test (priority=2)
	public void myTest2(){
		System.out.println (" MY TEST CASE 2!! ");
	}


	@BeforeSuite
	public void beforeSuite(){
		System.out.println (" ***** TEST SUITE STARTED");
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println (" ***** TEST SUITE Ended");

	}

	@BeforeMethod
	public void beforeMethod(){
		System.out.println (" ***** Before Method");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println (" ***** After Method");

	}



	@BeforeTest
	public void beforeTest(){
		System.out.println (" ***** BEFORE TEST ");
	}
	@AfterTest
	public void afterTest(){
		System.out.println (" ***** After Test annotation");

	}


	@AfterClass
	public void afterClass(){
		System.out.println (" ***** @AfterClass");

	}

}
