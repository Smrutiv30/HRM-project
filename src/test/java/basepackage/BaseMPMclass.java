package basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.TimeUtils;


//step 1
public class BaseMPMclass {
  public static  Properties prop =new Properties(); // create object for properties
   public static WebDriver driver; //reference variable for webdriver
   
    public BaseMPMclass() { //create constructor
    	try {
    	FileInputStream file= new FileInputStream("C:\\Users\\Viren Patel\\eclipse-workspace\\Mpmanagement\\src\\test\\java\\environmentvariables\\Config.properties");
    	prop.load(file);
    	
    } // this area the some exception if file not found 
    	catch(FileNotFoundException e)  {
    		e.printStackTrace();
    	}                                  // this are thing i need to do first
    	catch(IOException a) {
    		a.printStackTrace();
    	}
    }
    	// step 2
    	public static void initiate() {   
    		//driver path  
    		//maximize window, timeout, url
    		
    		 String browsername =prop.getProperty("browse");
    		 if(browsername.equals("Friefox")) {
    			 System.setProperty("webdriver.gecko.driver", "gecko.exe");
    			 driver = new FirefoxDriver();
    			 }
    			 else if(browsername.equals("chrome")) {
    				 System.setProperty("webdriver.chrome.driver","chorme.exe");
    				 driver = new ChromeDriver();
    			
    	driver.manage().timeouts().pageLoadTimeout(TimeUtils.timepage ,TimeUnit.SECONDS);
    	driver.get(prop.getProperty("url"));
    }}
}


