package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseAmazonClass;
import pompackage.Pom_Search;
import pompackage.Pom_SortBy;
import pompackage.Pom_YourOrder;

public class Search_SortBy extends BaseAmazonClass {
	
	Pom_SortBy Sortby;
	Pom_YourOrder Orders;
	Pom_Search Search;
	
	
	public Search_SortBy() {
		super();
	}
	
	@BeforeMethod
	public void initialsetup() {
		initiation();
		Sortby=new Pom_SortBy();
		Orders=new Pom_YourOrder();
		Search=new Pom_Search();
		Orders.typeemail(prop.getProperty("email"));
		Orders.clickcontinue();
		Orders.password(prop.getProperty("password"));
		Orders.submit();
		
	}
	
	@Test(priority=2)
	public void sortby1() {
		Search.search(prop.getProperty("search"));
		Search.searchbtn();
		Sortby.sortby();
		Sortby.sortbylist1();
		Sortby.disptxt1();
	}
	@Test(priority=1)
	public void sortby2() {
		Search.search(prop.getProperty("search"));
		Search.searchbtn();
		Sortby.sortby();
		Sortby.sortbylist2();
		Sortby.disptxt2();
	}
	@Test(priority=3)
	public void sortby3() {
		Search.search(prop.getProperty("search"));
		Search.searchbtn();
		Sortby.sortby();
		Sortby.sortbylist3();
		Sortby.disptxt3();
	}
	@Test(priority=4)
	public void sortby4() {
		Search.search(prop.getProperty("search"));
		Search.searchbtn();
		Sortby.sortby();
		Sortby.sortbylist4();
		Sortby.disptxt4();
	}
	@AfterMethod
	public void close(){
		driver.close();
	}

}
