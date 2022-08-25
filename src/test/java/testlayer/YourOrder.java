package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseAmazonClass;
//import pompackage.PomLogin;
import pompackage.Pom_YourOrder;

public class YourOrder extends BaseAmazonClass {
Pom_YourOrder Orders;
	
	public YourOrder() {
		
		super();
	}
	
	@BeforeMethod
	public void initialsetup() {
		initiation();
		Orders=new Pom_YourOrder();
		Orders.typeemail(prop.getProperty("email"));
		Orders.clickcontinue();
		Orders.password(prop.getProperty("password"));
		Orders.submit();
		
	}
	
	@Test(priority=1, enabled=false)
	public void yourorders() {
		
		Orders.hello();
		
	}
	@Test(priority=2,enabled=false)
	public void ord_buyagain() {
	
		Orders.hello();
		Orders.ord_buyagain();
	}
	@Test(priority=3, enabled=false)
	public void notyetshipped() {
	
		Orders.hello();
		Orders.notyetshipped();;
	}
	@Test(priority=4)
	public void cancelledorders() {
	
		Orders.hello();
		Orders.cancelledorders();
	}
	@AfterMethod
	public void close(){
		driver.close();
	}

}
