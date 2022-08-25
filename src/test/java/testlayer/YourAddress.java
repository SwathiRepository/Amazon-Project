package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseAmazonClass;
import pompackage.Pom_Address;
import pompackage.Pom_YourOrder;

public class YourAddress extends BaseAmazonClass {
	
	
Pom_YourOrder Orders;
Pom_Address Address;
	
	public YourAddress() {
		
		super();
	}
	
	@BeforeMethod
	public void initialsetup() {
		initiation();
		Orders=new Pom_YourOrder();
		Address=new Pom_Address();
		Orders.typeemail(prop.getProperty("email"));
		Orders.clickcontinue();
		Orders.password(prop.getProperty("password"));
		Orders.submit();
		
	}
	@Test(enabled=false)
	public void address() {
		Address.address();
	}
	@Test
	public void addaddress() {
		Address.addaddress();
		Address.fullname(prop.getProperty("name"));
		Address.phonenumber(prop.getProperty("phonenumber"));
		Address.homeaddress(prop.getProperty("homeaddress"));
		Address.city(prop.getProperty("city"));
		Address.province();
		Address.provselec();
		Address.postalcode(prop.getProperty("postalcode"));
		Address.defaultadd();
		Address.addaddressbutton();
	}
	@AfterMethod
	public void close(){
		driver.close();
	}

}
