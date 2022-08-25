package pompackage;



import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseAmazonClass;

public class Pom_YourPayments extends BaseAmazonClass{
	
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[3]/div[2]/a/div/div/div/div[2]/h2")WebElement YourPayments;
	@FindBy(xpath="//*[@id=\"cpefront-mpo-widget\"]/div/div[2]/div[2]/span")WebElement PayDisp;
	@FindBy(linkText="Add a payment method")WebElement AddPayment;
	
	//@FindBy(css="#pp-E0VLf7-26 > span > input")WebElement AddPayment1;
	
	
	public Pom_YourPayments() {
		PageFactory.initElements(driver,this);
	}
	public void yourpayments() throws InterruptedException {
		YourPayments.click();
		boolean result=PayDisp.isDisplayed();
		System.out.println(result);
		AddPayment.click();		
		//AddPayment1.click();
		
	}

}
