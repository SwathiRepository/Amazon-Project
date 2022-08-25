package pompackage;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;//import org.testng.annotations.Test;
//import org.openqa.selenium.support.ui.Select;

import basepackage.BaseAmazonClass;

public class PomLogin extends BaseAmazonClass {
	
	//Object Repository
	@FindBy(id="ap_email")WebElement Email;
	@FindBy(id="continue")WebElement Continue;
	@FindBy(id="ap_password")WebElement Password;
	@FindBy(id="signInSubmit")WebElement Submit;
	@FindBy(id="twotabsearchtextbox")WebElement Search;
	@FindBy(css="#nav-search-submit-button")WebElement SearchButton;
	@FindBy(xpath="//*[@id=\"a-autoid-0-announce\"]/span[1]")WebElement SortBy;	
	@FindBy(linkText="Price: High to Low")WebElement SortByList;
	@FindBy(className="a-dropdown-label")WebElement DisplayText;
	@FindBy(css="#p_36\\/12035760011 > span > a > span")WebElement Filter;
	@FindBy(xpath="//*[@id=\"p_36/12035760011\"]/span/a/span")WebElement FilDisp;
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]/span")WebElement Hello;
	@FindBy(xpath="//*[@id=\"nav_prefetch_yourorders\"]/span")WebElement YourOrders;
	@FindBy(xpath="//*[@id=\"a-page\"]/section/div/div[2]/div[1]/h1")WebElement OrdDisp;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[3]/div[1]/a/div/div/div/div[2]/h2")WebElement Address;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/h1")WebElement AddDisp;
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(2) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")WebElement Security;
	@FindBy(xpath="//*[@id=\"ap_cnep_header\"]")WebElement SecDisp;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[3]/div[2]/a/div/div/div/div[2]/div/span")WebElement Payments;
	@FindBy(xpath="//*[@id=\"cpefront-mpo-widget\"]/div/div[2]/div[2]/span")WebElement PayDisp;
	
	
	
	
	//Initiate Page elements
	public PomLogin() {
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
	public void search(String search) {
		Search.sendKeys(search);
	}
	public void searchbtn() {
		SearchButton.submit();
	}
	public void sortby() {
		SortBy.click();
		
		
	}
	public void sortbylist() {
		
		Actions action= new Actions(driver);
		action.moveToElement(SortByList).build().perform();
		SortByList.click();
		
	}
	public void filter() {
		Actions action= new Actions(driver);
		action.moveToElement(Filter).build().perform();
		Filter.click();
	
		
	}
	public void displaytext1() {
		boolean result1=FilDisp.isDisplayed();
		System.out.println(result1);
	}
	
	public void displaytext() {
		boolean result=DisplayText.isDisplayed();
		System.out.println(result);
	}
	public void hello() {
		Actions action= new Actions(driver);
		action.moveToElement(Hello).build().perform();
		YourOrders.click();
		boolean result3=OrdDisp.isDisplayed();
		System.out.println(result3);
		
		
	}
	public void address() {
		Hello.click();
		Address.click();
		boolean result4=AddDisp.isDisplayed();
		System.out.println(result4);
	}
	public void security() {
		Hello.click();
		Security.click();
		boolean result5=SecDisp.isDisplayed();
		System.out.println(result5);
		
	}
	public void payments() {
		Hello.click();
		Payments.click();
		boolean result6=PayDisp.isDisplayed();
		System.out.println(result6);
		
	}
	
	public String verify() {
		return driver.getTitle();
	}
	

}
