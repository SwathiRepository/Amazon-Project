package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseAmazonClass;

public class Pom_LoginSecurity extends BaseAmazonClass {
	
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]/span")WebElement Hello;
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(2) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")WebElement Security;
	@FindBy(id="auth-cnep-edit-name-button")WebElement SecEdit;
	@FindBy(id="ap_customer_name")WebElement SecNewName;
	@FindBy(id="cnep_1C_submit_button")WebElement SecSave;
	@FindBy(xpath="//*[@id=\"auth-success-message-box\"]/div/h4")WebElement SecSaveConf;
	
	
	//Initiate Page elements
		public Pom_LoginSecurity() {
			PageFactory.initElements(driver, this);
		}
		public void security() {
			Actions action= new Actions(driver);
			action.moveToElement(Hello).build().perform();
			Hello.click();
			Security.click();
			SecEdit.click();
		}
		public void secnewname(String newname) {
			SecNewName.clear();
			SecNewName.sendKeys(newname);
			SecSave.click();
			String result=SecSaveConf.getText();
			System.out.println(result);
		}

}
