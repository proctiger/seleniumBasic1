package abril.test.automated.test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import abril.test.automated.selenium.SeleniumTest;


public class TestsHome {
	String url = "http://www.abrileducacao.com.br/";
	
	
	

	@Test
	public void Test1(){
		SeleniumTest.open(url);
		System.out.println(SeleniumTest.getTitle());
	}
	
	@Test
	public void htmlUnitTest(){
		SeleniumTest.open(url);
		SeleniumTest.getAllLinks();
	}

	
	@Test
	public void clickLinkTest(){
		WebElement link = SeleniumTest.findLinkByText("Investidores");
		SeleniumTest.clickOnLink(link);
		System.out.println(SeleniumTest.getTitle());
	}
	
}
