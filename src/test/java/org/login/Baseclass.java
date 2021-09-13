package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	
public static WebDriver driver;

public static Select s;
	
	
	public static void launchDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\AdactinAutomation\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	}
	
	public  void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public WebElement locatorByid(String id) {
		return driver.findElement(By.id(id));
	}
	
	public WebElement locatorByxpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	
	public void btnclick(WebElement element) {
		element.click();
	}
	
	public void selectByIndex(WebElement element, int index) {
		s= new Select(element);
		s.selectByIndex(index);
	}
	
	public void selectByValue(WebElement element, String value) {
		s= new Select(element);
		s.selectByValue(value);
	}
	
	public void selectByText(WebElement element, String text) {
		s= new Select(element);
		s.selectByVisibleText(text);
	}
	
	public static void enterText(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public String gettingText(WebElement element) {
		return element.getText();
	}
	
	
}
