package org.alt;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPageFrame extends BaseClass {
	public FirstPageFrame() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="singleframe")
	private WebElement firstFrame;
	
	@FindBy(xpath="(//a[@class='analystic'])[2]")
	private WebElement iframeInner;
	
	@FindBy(xpath="//input[@type='text']")
	private List<WebElement> textbox;

	public WebElement getFirstFrame() {
		return firstFrame;
	}

	public WebElement getIframeInner() {
		return iframeInner;
	}

	public List<WebElement> getTextbox() {
		return textbox;
	}

	
	
	

}
