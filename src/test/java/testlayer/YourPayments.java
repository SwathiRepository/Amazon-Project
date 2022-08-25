package testlayer;

//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseAmazonClass;
import pompackage.Pom_YourOrder;
import pompackage.Pom_YourPayments;

public class YourPayments extends BaseAmazonClass {
	
	Pom_YourOrder Orders;
	Pom_YourPayments Payments;
	
	public YourPayments() {
		super();
	}
	
	@BeforeMethod
	public void initialsetup() {
		initiation();
		Payments=new Pom_YourPayments();
		Orders=new Pom_YourOrder();
		Orders.typeemail(prop.getProperty("email"));
		Orders.clickcontinue();
		Orders.password(prop.getProperty("password"));
		Orders.submit();
		
	}
	@Test(enabled=false)
	public void payments() throws InterruptedException {
		Orders.hello1();
		Payments.yourpayments();
	}
	@Test
	public void addpayment() throws InterruptedException {
		Orders.hello1();
		Payments.yourpayments();
	}
	
	/*@AfterMethod
	public void close(){
		driver.close();
	}*/

}
