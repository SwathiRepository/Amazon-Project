package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import basepackage.BaseAmazonClass;

public class Pom_SortBy extends BaseAmazonClass {
	
	@FindBy(xpath="//*[@id=\"a-autoid-0-announce\"]/span[1]")WebElement SortBy;	
	@FindBy(linkText="Price: High to Low")WebElement SortByList1;
	@FindBy(linkText="Price: Low to High")WebElement SortByList2;
	@FindBy(linkText="Avg. Customer Review")WebElement SortByList3;
	@FindBy(linkText="Newest Arrivals")WebElement SortByList4;
	@FindBy(className="a-dropdown-prompt")WebElement Disptxt1;
	@FindBy(className="a-dropdown-prompt")WebElement Disptxt2;
	@FindBy(className="a-dropdown-prompt")WebElement Disptxt3;
	@FindBy(className="a-dropdown-prompt")WebElement Disptxt4;
	
	
	public Pom_SortBy() {
		PageFactory.initElements(driver, this);
	}
	
	public void sortby() {
		SortBy.click();
		
	}
	public void sortbylist1() {
		
		Actions action= new Actions(driver);
		action.moveToElement(SortByList1).build().perform();
		SortByList1.click();
		
	}
	public void sortbylist2() {
		Actions action= new Actions(driver);
		action.moveToElement(SortByList2).build().perform();
		SortByList2.click();
	}
	public void sortbylist3() {
		Actions action= new Actions(driver);
		action.moveToElement(SortByList3).build().perform();
		SortByList3.click();
	}
	public void sortbylist4() {
		Actions action= new Actions(driver);
		action.moveToElement(SortByList4).build().perform();
		SortByList4.click();
	}
	public void disptxt1() {
		String result1=Disptxt1.getText();
		System.out.println(result1);
	}
	public void disptxt2() {
		String result2=Disptxt2.getText();
		System.out.println(result2);
	}

	public void disptxt3() {
		String result3=Disptxt3.getText();
		System.out.println(result3);
	}
	public void disptxt4() {
		String result4=Disptxt4.getText();
		System.out.println(result4);
	}

}
