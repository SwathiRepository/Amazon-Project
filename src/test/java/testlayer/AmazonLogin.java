package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basepackage.BaseAmazonClass;
import pompackage.PomLogin;
//import testdata.ExcelSheet;


public class AmazonLogin extends BaseAmazonClass {
	
	PomLogin Login;
	
	public AmazonLogin() {
		
		super();
	}
	
	@BeforeMethod
	public void initialsetup() {
		initiation();
		Login=new PomLogin();
		
	}
	
	@Test
	public void signin(){
		Login.typeemail(prop.getProperty("email"));
		Login.clickcontinue();
		Login.password(prop.getProperty("password"));
		Login.submit();
		Login.payments();
		//Login.security();
		//Login.address();
		//Login.hello();
		
		}
	@AfterMethod
	public void close(){
		driver.close();
	}
	/*@Test
	public void Search() {
		Search.search("shirts");
		Search.searchbtn();
		Search.filter();
		Search.displaytext1();*/
		
		
		
		
		//Search.sortby();
		//Search.sortbylist();
		//Search.displaytext();
		
	//}
	
	
	/*@DataProvider
	public Object[][] Details(){
		Object result[][]=ExcelSheet.readdata("Sheet1");
		return result;
	}*/
	



}
