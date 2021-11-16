package org.Flip;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class FlipKart_Mobiles extends BaseClass {
	
	public FlipKart_Mobiles() {
		PageFactory.initElements (new AjaxElementLocatorFactory(driver, 10), this);
	}
	
	@FindBy(xpath="//div[@class='_4rR01T']")
	private List<WebElement> allMobilesText;
	
	@FindBy(xpath="//div[@class='_30jeq3 _1_WHN1']")
	private List<WebElement> allMobilesPrice;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement nextPage;

	public WebElement getNextPage() {
		return nextPage;
	}

	public List<WebElement> getAllMobilesText() {
		return allMobilesText;
	}

	public List<WebElement> getAllMobilesPrice() {
		return allMobilesPrice;
	}

}
