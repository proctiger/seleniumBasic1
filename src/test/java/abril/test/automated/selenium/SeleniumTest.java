package abril.test.automated.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumTest extends SeleniumBase{

	public static void open(String url){
		driver.get(url);
	}
	
	public static String getTitle(){
		return driver.getTitle();
	}
	
	public static List<WebElement> getAllLinks(){
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for (WebElement webElement : allLinks) {
			System.out.println(webElement);
		}
		
		System.out.println("qtdade de links : "+ allLinks.size());
		return allLinks;
	}

	public static WebElement findLinkByText(String linkText){
		return driver.findElement(By.linkText(linkText));
	}
	
	
	public static void clickOnLink(WebElement link){
		link.click();
		
	}
	
}
