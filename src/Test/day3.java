package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {


		// TODO Auto-generated method stub
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass is executed before any method in the Class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("I will execute it as AfterClass");
	}
	
	@Test
	public void WebLoginCarLogin()
	{
		System.out.println("WebLoginCarLoan");
		System.out.println("WebLoginCarLoan");
		System.out.println("WebLoginCarLoan");
		System.out.println("WebLoginCarLoan");
		System.out.println("WebLoginCarLoan");
		System.out.println("WebLoginCarLoan");
	}
	
	@Parameters({ "URL", "APIKey/username" })
	@Test
	public void MobileLoginCarLoan(String urlname, String key)
	{
		System.out.println("MobileLoginCarLoan");
		System.out.println(urlname);
		System.out.println(key);
	}

	@BeforeSuite
	public void bSuite()
	{
		System.out.println("I will execute it as BeforeSuite");
	}
	
	@Test
	public void LoginAPICarLoan()
	{
		System.out.println("LoginAPICarLoan");
	}
	}


