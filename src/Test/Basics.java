package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics {


		// TODO Auto-generated method stub
	@AfterSuite
	public void aSuite()
	{
		System.out.println("I will execute it as AfterSuite");
	}
	@Test
	public void demo() 
	{
System.out.println("Hello");
	}
	
	@Test (groups= {"group"})
	public void realMadrid()
	{
		System.out.println("Real Madrid");
	}

	@BeforeTest
	public  void execution()
	{
		System.out.println("I will execute it as BeforeTest");
	}

}

