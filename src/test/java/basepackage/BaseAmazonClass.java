package basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import utility.TimeUtils;

public class BaseAmazonClass {
	
	public static Properties prop=new Properties();
	public static WebDriver driver;
	//Step1
	//Constructor creation
	public BaseAmazonClass() {
		//code to read properties from config file
		    try {
		FileInputStream file=new FileInputStream("C:\\Users\\16477\\AmazonEcommerce\\src\\test\\java\\environmentvariables\\Config.properties");
		    prop.load(file);
	}
		    catch(FileNotFoundException e) {
		    	e.printStackTrace();
		    }
		    catch(IOException a) {
		    	a.printStackTrace();
		    }
	}
    //Step2
	//Method Creation to keep all common commands
		    public static void initiation(){
		    	String browsername=prop.getProperty("browser");
		    	if(browsername.equals("Chrome")) {
		    		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		    		driver=new ChromeDriver();
		    		}
		    		else if(browsername.equals("InternerExplorer")) {
		    			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		    			driver=new InternetExplorerDriver();
		    			
		    		}
		    	driver.manage().window().maximize();
		    	driver.manage().timeouts().pageLoadTimeout(TimeUtils.Implicitwait, TimeUnit.SECONDS);
		    	driver.get(prop.getProperty("url"));
		    	}
		    	
		    }

