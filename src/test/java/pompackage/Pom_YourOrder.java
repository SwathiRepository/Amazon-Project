package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseAmazonClass;

public class Pom_YourOrder extends BaseAmazonClass{
	@FindBy(id="ap_email")WebElement Email;
	@FindBy(id="continue")WebElement Continue;
	@FindBy(id="ap_password")WebElement Password;
	@FindBy(id="signInSubmit")WebElement Submit;
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]/span")WebElement Hello;
	@FindBy(xpath="//*[@id=\"nav_prefetch_yourorders\"]/span")WebElement YourOrders;
	@FindBy(xpath="//*[@id=\"a-page\"]/section/div/div[2]/div[1]/h1")WebElement OrdDisp;
	@FindBy(xpath="//*[@id=\"a-page\"]/section/div/div[3]/ul/li[2]/a")WebElement BuyAgain;
	@FindBy(css="#a-page > section > div > div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(3) > a")WebElement NotYetShipped;
	@FindBy(xpath="//*[@id=\"a-page\"]/section/div/div[3]/ul/li[4]/a")WebElement CancelledOrders;
	
	
	//Initiate Page elements
	public Pom_YourOrder() {
		PageFactory.initElements(driver, this);
	}
	public void typeemail(String email) {
		Email.sendKeys(email);
		
	}
	public void clickcontinue() {
		Continue.click();
	}
	
	public void password(String pwd) {
		Password.sendKeys(pwd);
	}
	public void submit() {
	Submit.click();
	}
	
	public void hello() {
		Actions action= new Actions(driver);
		action.moveToElement(Hello).build().perform();
		YourOrders.click();
		boolean result3=OrdDisp.isDisplayed();
		System.out.println(result3);
			
			
 		}
	public void hello1() {
		Actions action= new Actions(driver);
		action.moveToElement(Hello).build().perform();
		Hello.click();
	}
   public void ord_buyagain() {
			BuyAgain.click();
		}
   public void notyetshipped() {
			NotYetShipped.click();
		}
   public void cancelledorders() {
		CancelledOrders.click();
	}

}
		
