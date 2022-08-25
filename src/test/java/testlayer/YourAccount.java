package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseAmazonClass;
import pompackage.Pom_YourAccount;
import pompackage.Pom_YourOrder;

public class YourAccount extends BaseAmazonClass{
	
Pom_YourAccount Account;
Pom_YourOrder Orders;
	
	public YourAccount() {
		
		super();
	}
	
	@BeforeMethod
	public void initialsetup() {
		initiation();
		Account=new Pom_YourAccount();
		Orders=new Pom_YourOrder();
		Orders.typeemail(prop.getProperty("email"));
		Orders.clickcontinue();
		Orders.password(prop.getProperty("password"));
		Orders.submit();
		
	}
	@Test
	public void youraccount() {
		Account.selyouraccount();
	}
	@AfterMethod
	public void close(){
		driver.close();
	}

}
