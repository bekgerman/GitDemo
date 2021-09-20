package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {


		// TODO Auto-generated method stub
	@Test
	public void WebLoginHomeLogin()
	{
		System.out.println("WebLoginHomeLoan");
	}
	
	
	@Test
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHomeLoan");
		
	}

	@Parameters({"URL"})
	@Test
	public void SigninHomeLoan(String uName)
	{
		System.out.println("SigninHomeLoan");
		System.out.println(uName);
	}
	
	@Test (groups= {"group"})
	public void MobileLogHomeLoan()
	{
		System.out.println("MobileLogHomeLoan");
	}
	
	@Test(dataProvider="getData")
	public void HomeLoan(String username, String password)
	{
		System.out.println("HomeLoan");
		System.out.println(username);
		System.out.println(password);
	}
	
	
	@Test (dependsOnMethods= {"SigninHomeLoan"})
	public void APIHomeLoan()
	{
		System.out.println("APIHpmeLoan");
	}
	@DataProvider
	public Object[][] getData()
	{
		//1 set: username password - good credit history
		//2 set username password - no credit history
		//3 set username password - bad credit history
		
		Object[][] data=new Object[3][2];
		//[3]- columns/ running 3 times;    [2]-rows/ has 2 values
		//1set
		data[0][0]= "1stName";
		data[0][1]= "1stPassword";
		
		//2 set
		data[1][0]= "2ndName";
		data[1][1]= "2ndPassword";  
		
		//3 set
		data[2][0]= "3rdName";
		data[2][1]= "3rdPassword";
		return data;
		
		
	}
	}


