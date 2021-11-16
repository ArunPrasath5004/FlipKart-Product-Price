package org.alt;

import java.util.Date;

import org.base.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FramesMain extends BaseClass {
	
	@BeforeClass
	private void before() {
		browserLaunch("chrome");
		driver.manage().window().maximize();
		get("http://demo.automationtesting.in/Frames.html");
		timeWait(5);
		
	}

	@BeforeMethod
	private void beforemethod() {
		System.out.println("before test -----"+new Date());
		
	}
	
	@AfterMethod
	private void aftermethod() {
		System.out.println("after test ------"+new Date());
		
	}
	
	
	@Test
	private void test() {
		FirstPageFrame fr=new FirstPageFrame();
		
		clickBtn(fr.getIframeInner());
		timeWait(5);
		frameSwitch(0);
		frameSwitch(0);
		sendValues(fr.getTextbox().get(0), "Arun Prasath");
		
	}
}
