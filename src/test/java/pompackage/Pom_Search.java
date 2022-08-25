package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseAmazonClass;

public class Pom_Search extends BaseAmazonClass {

	@FindBy(id="twotabsearchtextbox")WebElement Search;
	@FindBy(css="#nav-search-submit-button")WebElement SearchButton;
	
	
	public Pom_Search() {
		PageFactory.initElements(driver, this);
	}
	public void search(String search) {
		Search.sendKeys(search);
	}
	public void searchbtn() {
		SearchButton.submit();
	}
}
