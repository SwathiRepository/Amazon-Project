package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseAmazonClass;
import pompackage.Pom_Filter;
import pompackage.Pom_Search;
import pompackage.Pom_YourOrder;

public class Search_Filter extends BaseAmazonClass {
	
	Pom_YourOrder Orders;
	Pom_Filter Filter;
	Pom_Search Search;
	
	public Search_Filter() {
		super();
	}
	
	@BeforeMethod
	public void initialsetup() {
		initiation();
		Filter=new Pom_Filter();
		Orders=new Pom_YourOrder();
		Search=new Pom_Search();
		Orders.typeemail(prop.getProperty("email"));
		Orders.clickcontinue();
		Orders.password(prop.getProperty("password"));
		Orders.submit();
		Search.search(prop.getProperty("search"));
		Search.searchbtn();
		
	}
	
	@Test(priority=1)
	public void filter1() { 
		Filter.sleevefilter();
	}
	@Test(priority=2)
	public void filter2() {
		Filter.sizefilter();
	}
	@Test(priority=3)
	public void filter3() {
		Filter.colorfilter();
	}
	@Test(priority=4)
	public void filter4() {
		Filter.shippingfilter();
	}
	@AfterMethod
	public void close(){
		driver.close();
	}

}
