package AutiomationFrameWorkTestCasesProjectTestcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import AutiomationFramework.TestCasesProjectPages.LoginPage;

public class ValidLoginCredentialsTestcase {
	
	LoginPage loginpage;
	@BeforeClass
	@Parameters({"Browser"})
	public void Init(String Br)
	{
		loginpage=new LoginPage(Br);
		
	}
	
	@Test(priority=1)
	public void TestLoginWithValidCrdentials()
	{
		
		loginpage.DoLogin("Admin", "admin123");
	}

}
