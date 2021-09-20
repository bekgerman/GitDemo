package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day1 {


		// TODO Auto-generated method stub
@AfterTest
public void afterCase()

{
	System.out.println("I will execute it as AfterTest");
}
	
	@Test (groups= {"group"})
	public void day1()
   {
	System.out.println("Bye");
	}
	
	@BeforeMethod
	public void BMethod()
	{
		System.out.println("I will execute it as BeforeMethod!");
	}
	
	@Test
	public void why()
	{
		System.out.println("See you later!");
	}
	
	
	@Test
	public void noWay()
	{
		System.out.println("There is no way I will see you later");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("I will execute it as AfterMethod");
	}
	
	@Test
	public void ok()
	{
		System.out.println("OK");
	}

}
