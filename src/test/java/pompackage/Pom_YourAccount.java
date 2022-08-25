package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseAmazonClass;

public class Pom_YourAccount extends BaseAmazonClass {
	
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]/span")WebElement Hello;
	@FindBy(xpath="//*[@id=\"nav-al-your-account\"]/a[1]/span")WebElement YourAccount;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[1]/h1")WebElement SelYourAccount;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a/div/div/div/div[2]/h2")WebElement Accountdisp_Orders;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[3]/div[1]/a/div/div/div/div[2]/h2")WebElement Accountdisp_Address;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[2]/div[2]/a/div/div/div/div[2]/h2")WebElement Accountdisp_Security;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[3]/div[2]/a/div/div/div/div[2]/h2")WebElement Accountdisp_Payments;
	
	
	
	
	
	//Initiate Page elements
		public Pom_YourAccount() {
			PageFactory.initElements(driver, this);
		}
		public void selyouraccount() {
			Actions action= new Actions(driver);
			action.moveToElement(Hello).build().perform();
			YourAccount.click();
			boolean result=SelYourAccount.isDisplayed();
			System.out.println(result);
			String a=Accountdisp_Orders.getText();
			System.out.println(a);
			String b=Accountdisp_Address.getText();
			System.out.println(b);
			String c=Accountdisp_Security.getText();
			System.out.println(c);
			String d=Accountdisp_Payments.getText();
			System.out.println(d);
			
		}

}
