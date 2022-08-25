package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basepackage.BaseAmazonClass;

public class Pom_Address extends BaseAmazonClass {
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]/span")WebElement Hello;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[3]/div[1]/a/div/div/div/div[2]/h2")WebElement Address;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/h1")WebElement AddDisp;
	@FindBy(xpath="//*[@id=\"ya-myab-address-add-link\"]/div/div")WebElement AddAddress;
	@FindBy(id="address-ui-widgets-enterAddressFullName")WebElement FullName;
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")WebElement PhoneNumber;
	@FindBy(id="address-ui-widgets-enterAddressLine1")WebElement HomeAddress;
	@FindBy(id="address-ui-widgets-enterAddressCity")WebElement City;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-enterAddressStateOrRegion\"]/span/span")WebElement Province;
	@FindBy(id="address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_8")WebElement ProvSelec;
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")WebElement PostalCode;
	@FindBy(id="address-ui-widgets-use-as-my-default")WebElement Default;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input")WebElement AddAddressButton;
	@FindBy(xpath="//*[@id=\"yaab-alert-box\"]/div/h4")WebElement SavedAddress;
	
	
	//Initiate Page elements
		public Pom_Address() {
			PageFactory.initElements(driver, this);
		}
		public void address() {
			Hello.click();
			Address.click();
			boolean result4=AddDisp.isDisplayed();
			System.out.println(result4);
		}
		public void addaddress() {
			Hello.click();
			Address.click();
			AddAddress.click();
		}
		public void fullname(String name) {
			FullName.sendKeys(name);
			
		}
		public void phonenumber(String number) {
			PhoneNumber.sendKeys(number);
			
		}
		public void homeaddress(String address) {
			HomeAddress.sendKeys(address);
			
		}
		public void city(String name) {
			City.sendKeys(name);
			
		}
		public void province() {
			Province.click();
			
		}
		public void provselec() {
			Actions action= new Actions(driver);
			action.moveToElement(ProvSelec).build().perform();
			ProvSelec.click();
			
		}
		public void postalcode(String code) {
			PostalCode.sendKeys(code);
			
		}
		public void defaultadd() {
			Default.click();
			
		}
		public void addaddressbutton() {
			AddAddressButton.click();
			String actual=SavedAddress.getText();
			Assert.assertEquals(actual, "Address saved");
			System.out.println(actual);
		}
		

}
