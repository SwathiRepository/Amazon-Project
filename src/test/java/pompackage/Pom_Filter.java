package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseAmazonClass;

public class Pom_Filter extends BaseAmazonClass {
	
	@FindBy(xpath="//*[@id=\"p_n_feature_seven_browse-bin/23777354011\"]/span/a/div/label/i")WebElement Filter1;
	//@FindBy(css="#p_n_feature_seven_browse-bin\\/23777354011 > span > a > div > label > i")WebElement FilSelected;
	@FindBy(xpath="//*[@id=\"p_n_size_browse-vebin/10379651011\"]/span/a/span/span/button/span")WebElement Filter2;
	@FindBy(xpath="//*[@id=\"p_n_feature_five_browse-bin/10366965011\"]/span/a/span/div")WebElement Filter3;
	@FindBy(linkText="FREE Shipping")WebElement Filter4;
	
	
	
	
	public Pom_Filter() {
		PageFactory.initElements(driver, this);
	}
	
	public void sleevefilter() { 
		Filter1.click();
	
				
	}
	public void sizefilter() {
		Filter2.click();
		boolean result=Filter2.isEnabled();
		System.out.println(result);
	}
	public void colorfilter() {
		Filter3.click();
		
	}
	public void shippingfilter() {
		Filter4.click();
			
	}

}
