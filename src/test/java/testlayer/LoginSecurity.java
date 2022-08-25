package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseAmazonClass;
import pompackage.Pom_LoginSecurity;
import pompackage.Pom_YourOrder;

public class LoginSecurity extends BaseAmazonClass {
	
	Pom_YourOrder Orders;
	Pom_LoginSecurity Security;
		
		public LoginSecurity() {
			
			super();
		}
		
		@BeforeMethod
		public void initialsetup() {
			initiation();
			Security=new Pom_LoginSecurity();
			Orders=new Pom_YourOrder();
			Orders.typeemail(prop.getProperty("email"));
			Orders.clickcontinue();
			Orders.password(prop.getProperty("password"));
			Orders.submit();
			
		}
		@Test
		public void security() {
			Security.security();
			Security.secnewname(prop.getProperty("name"));
		}
		@AfterMethod
		public void close(){
			driver.close();
		}

}
