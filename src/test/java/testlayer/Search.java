package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basepackage.BaseAmazonClass;
import pompackage.Pom_Search;
import pompackage.Pom_YourOrder;
import testdata.ExcelSheet;

public class Search extends BaseAmazonClass{
	
	Pom_YourOrder Orders;
	Pom_Search Search;
	
	public Search() {
		super();
	}
	@BeforeMethod
	public void initialsetup() {
		initiation();
		Orders=new Pom_YourOrder();
		Search=new Pom_Search();
		Orders.typeemail(prop.getProperty("email"));
		Orders.clickcontinue();
		Orders.password(prop.getProperty("password"));
		Orders.submit();
		
	}
	@DataProvider
	public Object[][] Details(){
		Object result[][]=ExcelSheet.readdata("Sheet1");
		return result;
	}
	
	@Test(dataProvider="Details")
	public void AmzSearch(String search) {
		Search.search(search);
		Search.searchbtn();
	}
	@AfterMethod
	public void close(){
		driver.close();
	}
	

}
